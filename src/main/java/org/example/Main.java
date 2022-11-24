package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado = new Scanner(System.in);

        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

        int variableDeControl;

        System.out.println("++++++++ BIENVENIDO ENTRENADOR NESTOR LORENZO +++++++++");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        do {


            System.out.println("Menu de jugador");
            System.out.println("+++++++++++++++");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Buscar un jugador");
            System.out.println("3. Editar informacion de un jugador");
            System.out.println("4. Mostrar convocatoria de jugadores");
            System.out.println("5. SALIR DEL MENU");
            System.out.println("Digita una opcion del menu: ");
            variableDeControl = entradaPorTeclado.nextInt();
            switch (variableDeControl) {

                case 1:
                    if (jugadores.size() < 3) {
                        Jugador objetoJugador = new Jugador();
                        System.out.print("Ingrese el nombre del jugador: ");
                        objetoJugador.setNombre(entradaPorTeclado.next());
                        System.out.print("Ingrese el apellido del jugador: ");
                        objetoJugador.setApellidos(entradaPorTeclado.next());
                        System.out.print("Ingrese numero de camiseta: ");
                        objetoJugador.setNumeroCamiseta(entradaPorTeclado.nextInt());
                        System.out.print("Ingrese posicion de jugador: ");
                        objetoJugador.setPosicion(entradaPorTeclado.next());
                        System.out.print("Ingrese edad del jugador: ");
                        objetoJugador.setEdad(entradaPorTeclado.nextInt());
                        System.out.print("Ingrese equipo del jugador: ");
                        objetoJugador.setEquipoDondeJuega(entradaPorTeclado.next());
                        jugadores.add(objetoJugador);
                    } else {
                        System.out.println("Llego al limite, no permitido");
                    }
                    break;
                case 2:
                    System.out.println("Digite el numero de la camiseta del jugador a consultar: ");
                    int buscarJugador = entradaPorTeclado.nextInt();
                    boolean jugadorEncontrado = false;
                    for (Jugador jugador : jugadores) {
                        if (buscarJugador == jugador.getNumeroCamiseta()) {
                            System.out.println("numero de camiseta del jugador: " + jugador.getNumeroCamiseta());
                            System.out.println("nombre del jugador: " + jugador.getNombre());
                            System.out.println("apellido del jugador: " + jugador.getApellidos());
                            System.out.println("edad del jugador: " + jugador.getEdad());
                            System.out.println("posicion del jugador: " + jugador.getPosicion());
                            System.out.println("equipo del jugador: " + jugador.getEquipoDondeJuega());
                            jugadorEncontrado = true;
                        }
                    }
                    if (!jugadorEncontrado) {
                        System.out.println("Jugador no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Editar jugador");
                    System.out.println("Ingrese el numero de camisa del jugador a editar: ");
                    int editarJugador = entradaPorTeclado.nextInt();
                    jugadorEncontrado = false;
                    for (Jugador jugador : jugadores) {
                        if (editarJugador == jugador.getNumeroCamiseta()) {
                            System.out.println("editar nombre: ");
                            jugador.setNombre(entradaPorTeclado.next());
                            jugadorEncontrado = true;
                        }
                    }
                    if (!jugadorEncontrado) {
                        System.out.println("Jugador no encontrado.");
                    }
                    break;

                case 4:
                    for (Jugador jugador : jugadores) {
                        System.out.println("numero de camiseta del jugador: " + jugador.getNumeroCamiseta());
                        System.out.println("nombre del jugador: " + jugador.getNombre());
                        System.out.println("apellido del jugador: " + jugador.getApellidos());
                        System.out.println("edad del jugador: " + jugador.getEdad());
                        System.out.println("posicion del jugador: " + jugador.getPosicion());
                        System.out.println("equipo del jugador: " + jugador.getEquipoDondeJuega());
                    }
                    break;

                default:
                    System.out.println("Convocatoria completa");
            }
        } while (variableDeControl != 5);
    }

}
