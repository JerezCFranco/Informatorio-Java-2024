package ar.com.eventos.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

import ar.com.eventos.enumeration.EspecialidadEnum;
import ar.com.eventos.enumeration.InteresesCulinariosEnum;

public class Organizador {
    private List<EventosGastronomicos> eventos = new ArrayList<>();
    private List<Chef> chefs = new ArrayList<>();
    private List<Participante> participantesNuevos = new ArrayList<>();

    public EventosGastronomicos crearEvento() {
        EventosGastronomicos nuevoEvento = new EventosGastronomicos();
        Scanner scan = new Scanner(System.in);

        nuevoEvento.setId(UUID.randomUUID());

        System.out.println("Ingrese el nombre del evento: ");
        String nombreEvento = scan.nextLine();
        nuevoEvento.setNombre(nombreEvento);

        System.out.println("Ingrese la descripcion del evento: ");
        String descripcionEvento = scan.nextLine();
        nuevoEvento.setDescripcion(descripcionEvento);

        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'a las' HH:mm");
        System.out.println("Ingrese fecha y hora en el formato dd/MM/yyyy HH:mm:");
        String fechaHoraIngresada = scan.nextLine();
        LocalDateTime fechaHora = LocalDateTime.parse(fechaHoraIngresada, inputFormatter);
        nuevoEvento.setFechaYHora(fechaHora);

        System.out.println("Ingrese la ubicacion del evento: ");
        String ubicacionEvento = scan.nextLine();
        nuevoEvento.setUbicacion(ubicacionEvento);

        System.out.println("Ingrese la capacidad maxima de participantes en el evento: ");
        int capacidadEvento = scan.nextInt();
        scan.nextLine();
        nuevoEvento.setCapacidad(capacidadEvento);

        System.out.println("¿Desea asignar un chef existente o crear uno nuevo? (1- Existente, 2- Nuevo)");
        int eleccion = scan.nextInt();
        scan.nextLine();
        Chef chefAsignado = null;

        if (eleccion == 1) {
            System.out.println("Ingrese el nombre del chef a asignar: ");
            String nombreChef = scan.nextLine();
            for (Chef chef : chefs) {
                if (chef.getNombre().equalsIgnoreCase(nombreChef)) {
                    chefAsignado = chef;
                    break;
                }
            }
            if (chefAsignado == null) {
                System.out.println("No se encontró un chef con ese nombre.");
            }
        } else if (eleccion == 2) {
            chefAsignado = crearChef();
        }

        if (chefAsignado != null) {
            nuevoEvento.setChefCargo(chefAsignado);
            chefAsignado.getListaEventos().add(nuevoEvento);
        }

        eventos.add(nuevoEvento);

        return nuevoEvento;
    }

    public Chef crearChef() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre del chef: ");
        String nombreChef = scan.nextLine();

        System.out.println("Ingrese la especialidad del nuevo chef");
        System.out.println(
                "(opciones: INTERNACIONAL, GOURMET, SALSAS, ASADOS, PARRILLA, FRITO, VERDURAS, REPOSTERIA, CARNICERIA): ");
        EspecialidadEnum especialidadChef = EspecialidadEnum.valueOf(scan.nextLine().toUpperCase());

        Chef nuevoChef = new Chef(UUID.randomUUID(), nombreChef, especialidadChef);
        chefs.add(nuevoChef);
        System.out.println(
                "Chef creado con éxito: " + nuevoChef.getNombre() + ", Especialidad: " + nuevoChef.getEspecialidad());
        return nuevoChef;
    }

    public void asignarChefAEvento(UUID idEvento, UUID idChef) {
        EventosGastronomicos evento = buscarEventoPorId(idEvento);
        Chef chef = buscarChef(idChef);

        if (evento != null && chef != null) {
            evento.setChefCargo(chef);
            if (!chef.getListaEventos().contains(evento)) {
                chef.getListaEventos().add(evento);
            }
            System.out.println("Chef asignado con éxito al evento.");
        } else {
            System.out.println("Evento o chef no encontrado.");
        }
    }

    public void mostrarChefs() {
        if (chefs.isEmpty()) {
            System.out.println("No hay chefs registrados.");
            return;
        }
        System.out.println("Lista de chefs: ");
        for (Chef chef : chefs) {
            chef.verChef();
        }
    }

    public Chef buscarChef(UUID id) {
        for (Chef chef : chefs) {
            if (chef.getId().equals(id)) {
                return chef;
            }
        }
        System.out.println("No hay ningun chef con ese ID.");
        return null;
    }

    public void crearResena() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el id del evento: ");
        String idDelEventoStr = scan.nextLine();
        UUID idDelEvento;
        try {
            idDelEvento = UUID.fromString(idDelEventoStr);
        } catch (IllegalArgumentException e) {
            System.out.println("El ID del evento ingresado no es un UUID válido.");
            return;
        }

        System.out.println("Ingrese el id del participante: ");
        String idDelParticipanteStr = scan.nextLine();
        UUID idDelParticipante;
        try {
            idDelParticipante = UUID.fromString(idDelParticipanteStr);
        } catch (IllegalArgumentException e) {
            System.out.println("El ID del participante ingresado no es un UUID válido.");
            return;
        }

        System.out.println("Ingrese la calificación que le da al evento(1 a 5):");
        int calificacionDelEvento = scan.nextInt();
        scan.nextLine();
        if (calificacionDelEvento < 1 || calificacionDelEvento > 5) {
            System.out.println("No puede agregar una reseña inferior a 1, o mayor a 5");
            return;
        }
        System.out.println("Ingrese algún comentario sobre el evento: ");
        String comentarioDelEvento = scan.nextLine();

        dejarResenaEnEvento(idDelEvento, idDelParticipante, calificacionDelEvento, comentarioDelEvento);
    }

    public void dejarResenaEnEvento(UUID idEvento, UUID idParticipante, int calificacion, String comentario) {
        EventosGastronomicos evento = buscarEventoPorId(idEvento);
        Participante participante = buscarParticipantePorId(idParticipante);

        if (evento != null && participante != null) {
            evento.dejarResena(participante, calificacion, comentario);
        } else {
            System.out.println("Evento o participante no encontrado.");
        }
    }

    private EventosGastronomicos buscarEventoPorId(UUID id) {
        for (EventosGastronomicos evento : eventos) {
            if (evento.getId().equals(id)) {
                return evento;
            }
        }
        return null;
    }

    public Participante crearParticipante() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el nombre y apellido del participante: ");
        String nombreYApellido = scan.nextLine();

        System.out.println("Seleccione los intereses culinarios del participante: ");
        InteresesCulinariosEnum[] intereses = InteresesCulinariosEnum.values();
        for (int i = 0; i < intereses.length; i++) {
            System.out.println((i + 1) + ". " + intereses[i]);
        }
        List<InteresesCulinariosEnum> interesesSeleccionados = new ArrayList<>();
        String seleccion = "";
        while (!seleccion.equalsIgnoreCase("n")) {
            System.out.println("Ingrese el número correspondiente al interés culinario(o 'n' para terminar): ");
            seleccion = scan.nextLine();
            if (!seleccion.equalsIgnoreCase("n")) {
                int index = Integer.parseInt(seleccion) - 1;
                if (index >= 0 && index < intereses.length) {
                    interesesSeleccionados.add(intereses[index]);
                } else {
                    System.out.println("Selección inválida, intente nuevamente.");
                }
            }
        }
        Participante nuevoParticipante = new Participante(UUID.randomUUID(), nombreYApellido, interesesSeleccionados);
        participantesNuevos.add(nuevoParticipante);
        return nuevoParticipante;
    }

    public void listarParticipantes() {
        if (participantesNuevos.isEmpty()) {
            System.out.println("No hay participantes inscriptos.");
        } else {
            for (Participante participante : participantesNuevos) {
                participante.datosParticipante();
            }
        }
    }

    private Participante buscarParticipantePorId(UUID id) {
        for (EventosGastronomicos evento : eventos) {
            Participante participante = evento.buscarParticipantePorId(id);
            if (participante != null) {
                return participante;
            }
        }
        return buscarParticipanteEnOrganizadorPorId(id);
    }

    public Participante buscarParticipanteEnOrganizadorPorId(UUID idParticipante) {
        for (Participante participante : participantesNuevos) {
            if (participante.getId().equals(idParticipante)) {
                return participante;
            }
        }
        return null;
    }

    public void listarParticipantesDeEvento(UUID idEvento) {
        EventosGastronomicos evento = buscarEventoPorId(idEvento);
        if (evento != null) {
            evento.mostrarParticipantes();
        } else {
            System.out.println("Evento no encontrado.");
        }
    }

    private Participante buscarParticipantePorIdYEvento(UUID idEvento, UUID idParticipante) {
        EventosGastronomicos evento = buscarEventoPorId(idEvento);
        if (evento != null) {
            return evento.buscarParticipantePorId(idParticipante);
        }
        return null;
    }

    public void inscribirParticipanteEnEvento(UUID idEvento, UUID idParticipante) {
        EventosGastronomicos evento = buscarEventoPorId(idEvento);
        Participante participante = buscarParticipantePorId(idParticipante);

        if (evento != null && participante != null) {
            boolean exito = evento.inscribirParticipante(participante);
            if (exito) {
                System.out.println("Inscripcion realizada exitosamente.");
            }
        } else {
            System.out.println("Evento o participante no encontrado.");
        }
    }

    public void verEventos() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
        } else {
            for (EventosGastronomicos evento : eventos) {
                evento.datosEvento();
            }
        }
    }

    public void exportarEventosCapacidadMaxima(LocalDate fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String nombreArchivo = "eventos_capacidad_maxima_" + fecha.format(formatter) + ".txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (EventosGastronomicos evento : eventos) {
                if (evento.getCapacidad() == evento.getParticipantes().size() &&
                        evento.getFechaYHora().toLocalDate().equals(fecha)) {
                    writer.write("ID: " + evento.getId());
                    writer.write("\nNombre: " + evento.getNombre());
                    writer.write("\nDescripción: " + evento.getDescripcion());
                    writer.write("\nFecha y Hora: " + evento.getFechaYHora());
                    writer.write("\nUbicación: " + evento.getUbicacion());
                    writer.write("\nCapacidad: " + evento.getCapacidad() + " participante/s");
                    writer.write("\nChef a Cargo: "
                            + (evento.getChefCargo() != null ? evento.getChefCargo().getNombre() : "No asignado"));
                    writer.write("\nParticipantes:");
                    for (Participante participante : evento.getParticipantes()) {
                        writer.write("\n- Participante ID: " + participante.getId() + ", Nombre: "
                                + participante.getNombreYApellido());
                    }

                    writer.write("\nReseñas:");
                    for (Resena resena : evento.getResenas()) {
                        writer.write("\n- Participante ID: " + resena.getId() + ", Nombre y Apellido: " + resena.getNombreParticipante() +", Calificación: "
                                + resena.getCalificación() + " estrellas, Comentario: " + resena.getComentario());
                    }
                    writer.write("\n------------------------------\n");
                }
            }
            System.out.println("Archivo exportado exitosamente: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public void inicializarDatos() {
        // Crear chefs
        Chef chef1 = new Chef(UUID.fromString("baf5d23e-fb9e-4a7b-a0b2-c6eae6c00000"), "Omarcito", EspecialidadEnum.PARRILLA);
        Chef chef2 = new Chef(UUID.fromString("c8a6ed95-3c7d-4b55-b9b5-76f4b22ff700"), "Ana María", EspecialidadEnum.GOURMET);
        Chef chef3 = new Chef(UUID.fromString("d3c4c8d8-9c48-48ec-97ae-7d1e51b0a9a8"), "Roberto Asador", EspecialidadEnum.ASADOS);
        Chef chef4 = new Chef(UUID.fromString("e7d60d8b-fd4a-4d5e-89a0-1e89b203a0d4"), "Isabel Dulce", EspecialidadEnum.REPOSTERIA);
        Chef chef5 = new Chef(UUID.fromString("f7b826d5-0b5d-4f38-bdb0-9a7734e6c5b7"), "Javier Vino", EspecialidadEnum.INTERNACIONAL);

        chefs.add(chef1);
        chefs.add(chef2);
        chefs.add(chef3);
        chefs.add(chef4);
        chefs.add(chef5);

        // Crear participantes
        Participante participante1 = new Participante(UUID.fromString("301c5a0c-d791-4259-8c20-f777c8053d82"), "Carlos Jerez", List.of(InteresesCulinariosEnum.ITALIANA));
        Participante participante2 = new Participante(UUID.fromString("a7c88b71-56b5-4ef6-8a14-c2147b19d5a7"), "Mariana López", List.of(InteresesCulinariosEnum.MEDITERRANEA));
        Participante participante3 = new Participante(UUID.fromString("7f1d25e1-3e8b-42d1-95b1-d7d7b2a53a43"), "Juan Pérez", List.of(InteresesCulinariosEnum.VEGANA, InteresesCulinariosEnum.ASIATICA));
        Participante participante4 = new Participante(UUID.fromString("22b8b6b0-18d4-4c1e-9e35-bc1c91e67f93"), "Gabriela Martínez", List.of(InteresesCulinariosEnum.FRANCESA));
        Participante participante5 = new Participante(UUID.fromString("3e9d84b7-0d72-4e51-9a60-9e8d1b3f9d5f"), "Sergio López", List.of(InteresesCulinariosEnum.MEXICANA));

        participantesNuevos.add(participante1);
        participantesNuevos.add(participante2);
        participantesNuevos.add(participante3);
        participantesNuevos.add(participante4);
        participantesNuevos.add(participante5);

        // Crear eventos
        EventosGastronomicos evento1 = new EventosGastronomicos(UUID.fromString("aae25387-6a99-4ac1-b78e-44a9af3e0651"), "Brasas", "Evento de brasas", LocalDateTime.of(2000, 5, 5, 18, 30), "argentina", 1, chef1);
        evento1.inscribirParticipante(participante1);

        EventosGastronomicos evento2 = new EventosGastronomicos(UUID.fromString("fef3c5e9-7b71-43d4-9d6e-98b2c7f6f013"), "Fiesta Gourmet", "Evento de cocina gourmet con platos exquisitos.", LocalDateTime.of(2024, 10, 15, 20, 0), "Buenos Aires, Argentina", 50, chef2);
        evento2.inscribirParticipante(participante2);
        evento2.inscribirParticipante(participante3);

        EventosGastronomicos evento3 = new EventosGastronomicos(UUID.fromString("c53b1e2b-1b76-4b5d-8f14-2b429e6c67f0"), "Noche de Parrilla", "Evento con parrillada al aire libre y música en vivo.", LocalDateTime.of(2024, 12, 1, 19, 0), "Córdoba, Argentina", 100, chef3);
        evento3.inscribirParticipante(participante4);
        evento3.inscribirParticipante(participante5);

        EventosGastronomicos evento4 = new EventosGastronomicos(UUID.fromString("926d8c85-1b56-4c78-a5a6-cd9b2b81267a"), "Taller de Repostería", "Clase intensiva de técnicas de repostería.", LocalDateTime.of(2024, 11, 22, 10, 0), "Rosario, Argentina", 20, chef4);
        evento4.inscribirParticipante(participante4);
        evento4.inscribirParticipante(participante5);

        EventosGastronomicos evento5 = new EventosGastronomicos(UUID.fromString("5d4e06b7-8c3e-42c1-8c6a-70ec065e41c2"), "Festival de Vinos", "Evento para degustar vinos de diferentes bodegas.", LocalDateTime.of(2024, 9, 20, 16, 0), "Mendoza, Argentina", 200, chef5);
        evento5.inscribirParticipante(participante2);
        evento5.inscribirParticipante(participante3);

        eventos.add(evento1);
        eventos.add(evento2);
        eventos.add(evento3);
        eventos.add(evento4);
        eventos.add(evento5);

        // Crear reseñas
        Resena reseña1 = new Resena();
        reseña1.setId(UUID.fromString("b0cde1dd-5cb4-4ae4-b1b8-29d2baa9963f"));
        reseña1.setEvento(evento1);
        reseña1.setParticipante(participante1);
        reseña1.setCalificación(4);
        reseña1.setComentario("Evento muy divertido en familia");

        Resena reseña2 = new Resena();
        reseña2.setId(UUID.fromString("d8d5e3a5-1c52-4f60-9d8e-61b3e4a3bb72"));
        reseña2.setEvento(evento2);
        reseña2.setParticipante(participante2);
        reseña2.setCalificación(5);
        reseña2.setComentario("Un festín de sabores, excelente organización.");

        Resena reseña3 = new Resena();
        reseña3.setId(UUID.fromString("a54d2b3b-2bde-4b6e-a7d8-98b0f9f7e349"));
        reseña3.setEvento(evento3);
        reseña3.setParticipante(participante4);
        reseña3.setCalificación(5);
        reseña3.setComentario("Increíble parrillada y excelente ambiente.");

        evento1.dejarResena(reseña1.getParticipante(), reseña1.getCalificación(), reseña1.getComentario());
        evento2.dejarResena(reseña2.getParticipante(), reseña2.getCalificación(), reseña2.getComentario());
        evento3.dejarResena(reseña3.getParticipante(), reseña3.getCalificación(), reseña3.getComentario());
    }

}
