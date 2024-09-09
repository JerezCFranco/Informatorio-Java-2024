package ar.com.eventos;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.UUID;

import ar.com.eventos.domain.Organizador;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Organizador organizador = new Organizador();
        organizador.inicializarDatos();
        Scanner scan = new Scanner(System.in);
        int eleccion = 10;

        do {
            System.out.println("Bienvenido al programa! Que desea realizar?: ");
            System.out.println("1- Crear Evento Culinario\n2- Agregar o Inscribir Participante a evento");
            System.out.println("3- Agregar Chef o Asignarlo a un evento\n4- Reseñar Evento");
            System.out.println("5- Listar (Eventos, Participantes, Chefs)");
            System.out.println("6- Exportar Archivo\n7- Salir");
            eleccion = scan.nextInt();
            scan.nextLine();

            switch (eleccion) {
                case 1: // Crear Evento
                    organizador.crearEvento();
                    break;
                case 2: // Agregar o inscribir participante
                    System.out.println("Que desea realizar?\n1- Agregar Participante\n2- Inscribir Participante");
                    int eleccionParticipante = scan.nextInt();
                    scan.nextLine();
                    if (eleccionParticipante == 1) {
                        organizador.crearParticipante();
                    } else if (eleccionParticipante == 2) {
                        System.out.println("Ingrese el id del evento: ");
                        String idEventoInscribirStr = scan.nextLine();
                        UUID idEventoInscribir;
                        try {
                            idEventoInscribir = UUID.fromString(idEventoInscribirStr);
                        } catch (IllegalArgumentException e) {
                            System.out.println("El ID del evento ingresado no es un UUID válido.");
                            return;
                        }

                        System.out.println("Ingrese el id del participante: ");
                        String idParticipanteInscribirStr = scan.nextLine();
                        UUID idParticipanteInscribir;
                        try {
                            idParticipanteInscribir = UUID.fromString(idParticipanteInscribirStr);
                        } catch (IllegalArgumentException e) {
                            System.out.println("El ID del participante ingresado no es un UUID válido.");
                            return;
                        }

                        organizador.inscribirParticipanteEnEvento(idEventoInscribir, idParticipanteInscribir);
                    } else {
                        System.out.println("Elección invalida.");
                    }
                    break;
                case 3: // Agregar chef o asignarlo
                    System.out.println("Que desea realizar?\n1- Agregar Chef\n2- Asignar Chef a evento");
                    int eleccionChef = scan.nextInt();
                    scan.nextLine();
                    if (eleccionChef == 1) {
                        organizador.crearChef();
                    } else if (eleccionChef == 2) {
                        System.out.println("Ingrese el id del evento: ");
                        String idEventoInscribirStr = scan.nextLine();
                        UUID idEventoInscribir;
                        try {
                            idEventoInscribir = UUID.fromString(idEventoInscribirStr);
                        } catch (IllegalArgumentException e) {
                            System.out.println("El ID del evento ingresado no es un UUID válido.");
                            return;
                        }

                        System.out.println("Ingrese el id del chef: ");
                        String idChefInscribirStr = scan.nextLine();
                        UUID idChefInscribir;
                        try {
                            idChefInscribir = UUID.fromString(idChefInscribirStr);
                        } catch (IllegalArgumentException e) {
                            System.out.println("El ID del chef ingresado no es un UUID válido.");
                            return;
                        }
                        organizador.asignarChefAEvento(idEventoInscribir, idChefInscribir);
                    } else {
                        System.out.println("Elección invalida.");
                    }
                    break;
                case 4: // Reseñar evento
                    organizador.crearResena();
                    break;
                case 5: // Listar Eventos y Participantes
                    System.out.println("Que desea realizar?\n1- Listar todos los participantes ");
                    System.out.println("2- Listar Participantes de un evento");
                    System.out.println("3- Listar los Chefs");
                    System.out.println("4- Listar Eventos");
                    int eleccionListar = scan.nextInt();
                    scan.nextLine();
                    if (eleccionListar == 1) {
                        organizador.listarParticipantes();
                    } else if (eleccionListar == 2) {
                        System.out.println("Ingrese el id del evento: ");
                        String idDelEventoStr = scan.nextLine();
                        UUID idDelEvento;
                        try {
                            idDelEvento = UUID.fromString(idDelEventoStr);
                            organizador.listarParticipantesDeEvento(idDelEvento);
                        } catch (IllegalArgumentException e) {
                            System.out.println("El ID del evento ingresado no es un UUID válido.");
                        }
                    } else if (eleccionListar == 3) {
                        organizador.mostrarChefs();
                    } else if (eleccionListar == 4) {
                        organizador.verEventos();
                    } else {
                        System.out.println("Elección invalida.");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese la fecha para exportar los eventos (formato: AAAA-MM-DD): ");
                    String fechaStr = scan.nextLine();
                    LocalDate fecha;
                    try {
                        fecha = LocalDate.parse(fechaStr);
                        organizador.exportarEventosCapacidadMaxima(fecha);
                    } catch (Exception e) {
                        System.out.println("Formato de fecha inválido. Debe ser AAAA-MM-DD.");
                    }
                    break;
                case 7: // Finalizar Programa
                    System.out.println("Programa Finalizado, gracias por participar!.");
                    break;
                default:
                    break;
            }

        } while (eleccion != 7);
        scan.close();
    }
}

