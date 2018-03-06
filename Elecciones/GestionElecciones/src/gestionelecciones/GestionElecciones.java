/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionelecciones;

import java.util.Scanner;

/**
 *
 * @author JuanJ
 */
public class GestionElecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creacion de  int opcion = 0, op = 0;TODOS los objetos y variables.
        int opcion = 0, op, a = 0, x;

        Candidato can1 = new Candidato("Juan José", "Rangel", 1070982300, 20, 8424617, "Calle 15 #4-39", "Facatativa", "POLO");
        Candidato can2 = new Candidato("Gustavo", "Duque", 1070237915, 25, 8424617, "Calle 32 #6-54", "Bucaramanga", "POLO");
        Candidato can3 = new Candidato("Juan ", "Velez", 1070597328, 28, 8424617, "Calle 18 #6-333", "Bogota", "POLO");
        Candidato can4 = new Candidato("Ivan", "Petro", 1070671945, 67, 8424617, "Calle 3 #56-309", "Tunja", "LIBERAL");
        Candidato can5 = new Candidato("José", "Perez", 1070431958, 40, 8424617, "Calle 86 #3-569", "Cali", "LIBERAL");
        Candidato can6 = new Candidato("Nicolas", "Ramirez", 1070319764, 30, 8424617, "Calle 53 #3-12", "Cucuta", "VERDE");
        Candidato can7 = new Candidato("Fernando", "Mateus", 1070931752, 60, 8424617, "Calle 58 #5-89", "Medellin", "VERDE");
        Candidato can8 = new Candidato("Luis", "Quevedo", 1070901760, 30, 8424617, "Calle 65 #3-563", "Cartagena", "MIRA");
        Candidato can9 = new Candidato("Andres", "Rodriguez", 1070307952, 65, 8424617, "Calle 35 #23-393", "Ibague", "MIRA");

        Scanner sc = new Scanner(System.in);

        while (opcion != 4) {

            System.out.println("**************************");
            System.out.println("* Elecciones Al Congreso *");
            System.out.println("**************************");
            System.out.println("Por favor, seleccione una de las siguientes opciones:\n");
            System.out.println("1.- VER INFO POR CANDIDATO.");
            System.out.println("2.- ABRIR VOTACIONES.");
            System.out.println("3.- VER INFORME VOTACIONES.");
            System.out.println("4.- SALIR.");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    a = 0;
                    while (a != 2) {
                        System.out.println("**************************");
                        System.out.println("* Consulta por Candidato *");
                        System.out.println("**************************");
                        System.out.println("Digite el numero de candidato a consultar: ");
                        System.out.println("1.-" + can1.nombre + " " + can1.apellido);
                        System.out.println("2.-" + can2.nombre + " " + can2.apellido);
                        System.out.println("3.-" + can3.nombre + " " + can3.apellido);
                        System.out.println("4.-" + can4.nombre + " " + can4.apellido);
                        System.out.println("5.-" + can5.nombre + " " + can5.apellido);
                        System.out.println("6.-" + can6.nombre + " " + can6.apellido);
                        System.out.println("7.-" + can7.nombre + " " + can7.apellido);
                        System.out.println("8.-" + can8.nombre + " " + can8.apellido);
                        System.out.println("9.-" + can9.nombre + " " + can9.apellido);

                        op = sc.nextInt();
                        if (op == 1) {
                            System.out.println("Datos Candidato: \n" + can1.datosCandidato());
                        }
                        if (op == 2) {
                            System.out.println("Datos Candidato: \n" + can2.datosCandidato());
                        }
                        if (op == 3) {
                            System.out.println("Datos Candidato: \n" + can3.datosCandidato());
                        }
                        if (op == 4) {
                            System.out.println("Datos Candidato: \n" + can4.datosCandidato());
                        }
                        if (op == 5) {
                            System.out.println("Datos Candidato: \n" + can5.datosCandidato());
                        }
                        if (op == 6) {
                            System.out.println("Datos Candidato: \n" + can6.datosCandidato());
                        }
                        if (op == 7) {
                            System.out.println("Datos Candidato: \n" + can7.datosCandidato());
                        }
                        if (op == 8) {
                            System.out.println("Datos Candidato: \n" + can8.datosCandidato());
                        }
                        if (op == 9) {
                            System.out.println("Datos Candidato: \n" + can9.datosCandidato());
                        }
                        System.out.println("Desea ver la informacion de otro candidato? SI=1, NO=2.");
                        a = sc.nextInt();
                    }
                    break;

                case 2:
                    a = 0;
                    while (a != 2) {
                        System.out.println("***********************************************************************************************************");
                        System.out.println("*                                            ELECCIONES AL CONGRESO                                       *");
                        System.out.println("***********************************************************************************************************");
                        System.out.println("*                                                    TARJETON                                             *");
                        System.out.println("*NUMERO:         -1-                -2-                -3-                 -4-                 -5-        *");
                        System.out.println("*Nombres:  " + can1.nombre + " " + can1.apellido + "    " + can2.nombre + " " + can2.apellido + "        " + can3.nombre + " " + can3.apellido + "         " + can4.nombre + " " + can4.apellido + "         " + can5.nombre + " " + can5.apellido + "     *");
                        System.out.println("*Partido:       " + can1.partido + "                " + can2.partido + "              " + can3.partido + "              " + can4.partido + "              " + can5.partido + "      *");
                        System.out.println("*           ░░░██░░░       ░░░██░░░       ░░░██░░░       ░░░██░░░       ░░░██░░░   *");
                        System.out.println("*           ░▄▄▄▄▄▄░       ░▄▄▄▄▄▄░       ░▄▄▄▄▄▄░       ░▄▄▄▄▄▄░       ░▄▄▄▄▄▄░   *");
                        System.out.println("*           ░█▐██▌█░       ░█▐██▌█░       ░█▐██▌█░       ░█▐██▌█░       ░█▐██▌█░   *");
                        System.out.println("*           ░▀▐▌▐▌▀░       ░▀▐▌▐▌▀░       ░▀▐▌▐▌▀░       ░▀▐▌▐▌▀░       ░▀▐▌▐▌▀░   *");
                        System.out.println("*           ░░▐▌▐▌░░       ░░▐▌▐▌░░       ░░▐▌▐▌░░       ░░▐▌▐▌░░       ░░▐▌▐▌░░   *");
                        System.out.println("*                                                                                                         *");
                        System.out.println("*NUMERO:         -6-                -7-                 -8-                -9-                            *");
                        System.out.println("*Nombres:  " + can6.nombre + " " + can6.apellido + "    " + can7.nombre + " " + can7.apellido + "      " + can8.nombre + " " + can8.apellido + "      " + can9.nombre + " " + can9.apellido + "                     *");
                        System.out.println("*Partido:       " + can6.partido + "              " + can7.partido + "                " + can8.partido + "               " + can9.partido + "                           *");
                        System.out.println("*           ░░░██░░░       ░░░██░░░       ░░░██░░░       ░░░██░░░                       *");
                        System.out.println("*           ░▄▄▄▄▄▄░       ░▄▄▄▄▄▄░       ░▄▄▄▄▄▄░       ░▄▄▄▄▄▄░                       *");
                        System.out.println("*           ░█▐██▌█░       ░█▐██▌█░       ░█▐██▌█░       ░█▐██▌█░                       *");
                        System.out.println("*           ░▀▐▌▐▌▀░       ░▀▐▌▐▌▀░       ░▀▐▌▐▌▀░       ░▀▐▌▐▌▀░                       *");
                        System.out.println("*           ░░▐▌▐▌░░       ░░▐▌▐▌░░       ░░▐▌▐▌░░       ░░▐▌▐▌░░                       *");
                        System.out.println("***********************************************************************************************************");
                        System.out.println("Seleccione opcion (1-9): ");
                        op = sc.nextInt();
                        System.out.println("¿Cual fue el medio que lo influencio a votar por el candidato?:\n");
                        System.out.println("1.- TELEVISION");
                        System.out.println("2.- RADIO");
                        System.out.println("3.- INTERNET");
                        System.out.println("Seleccione opcion (1-3): ");
                        x = sc.nextInt();
                        if (op == 1) {
                            can1.Votos(1);
                            can1.Costo(x);
                        }
                        if (op == 2) {
                            can2.Votos(1);
                            can2.Costo(x);
                        }
                        if (op == 3) {
                            can3.Votos(1);
                            can3.Costo(x);
                        }
                        if (op == 4) {
                            can4.Votos(1);
                            can4.Costo(x);
                        }
                        if (op == 5) {
                            can5.Votos(1);
                            can5.Costo(x);
                        }
                        if (op == 6) {
                            can6.Votos(1);
                            can6.Costo(x);
                        }
                        if (op == 7) {
                            can7.Votos(1);
                            can7.Costo(x);
                        }
                        if (op == 8) {
                            can8.Votos(1);
                            can8.Costo(x);
                        }
                        if (op == 9) {
                            can9.Votos(1);
                            can9.Costo(x);
                        }
                        System.out.println("Nuevo votante: 1. \nCerrar Votacion : 2.");
                        a = sc.nextInt();
                    }
                    break;

                case 3:

                    int poloV = can1.votos + can2.votos + can3.votos;
                    long poloC = can1.costo + can2.costo + can3.costo + 3_000_000_000L;
                    int liberalV = can4.votos + can5.votos;
                    long liberalC = can4.costo + can5.costo + 2_000_000_000;
                    int verdeV = can6.votos + can7.votos;
                    long verdeC = can6.costo + can7.costo + 1_000_000_000;
                    int miraV = can8.votos + can9.votos;
                    long miraC = can8.costo + can9.costo + 500_000_000;

                    System.out.println("*************************************************************************");
                    System.out.println("*                ELECCIONES AL CONGRESO (RESUMEN VOTACION)              *");
                    System.out.println("*************************************************************************");
                    System.out.println("*PARTIDO          CANDIDATOS          TOTAL VOTOS          COSTO CAMPAÑA*");
                    System.out.println("*LIBERAL              2               " + liberalV + "                   $" + liberalC);
                    System.out.println("*VERDE                2               " + verdeV + "                   $" + verdeC);
                    System.out.println("*MIRA                 2               " + miraV + "                   $" + miraC);
                    System.out.println("*POLO                 3               " + poloV + "                   $" + poloC);

                    System.out.println("*************************************************************************");
                    System.out.println("*                          VOTOS POR CANDIDATO                          *");
                    System.out.println("*************************************************************************");
                    System.out.println("NOMBRE                     CANTIDAD DE VOTOS             COSTO CAMPAÑA  *");
                    System.out.println("1.-" + can1.nombre + " " + can1.apellido+"           " + can1.votos+"                            $" + can1.costo);
                    System.out.println("2.-" + can2.nombre + " " + can2.apellido+"              " + can2.votos+"                            $" + can2.costo);
                    System.out.println("3.-" + can3.nombre + " " + can3.apellido+"                " + can3.votos+"                            $" + can3.costo);
                    System.out.println("4.-" + can4.nombre + " " + can4.apellido+"                 " + can4.votos+"                            $" + can4.costo);
                    System.out.println("5.-" + can5.nombre + " " + can5.apellido+"                 " + can5.votos+"                            $" + can5.costo);
                    System.out.println("6.-" + can6.nombre + " " + can6.apellido+"            " + can6.votos+"                            $" + can6.costo);
                    System.out.println("7.-" + can7.nombre + " " + can7.apellido+"            " + can7.votos+"                            $" + can7.costo);
                    System.out.println("8.-" + can8.nombre + " " + can8.apellido+"               " + can8.votos+"                            $" + can8.costo);
                    System.out.println("9.-" + can9.nombre + " " + can9.apellido+"           " + can9.votos+"                            $" + can9.costo);
                    
                    break;

            }

        }

    }

}
