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
                    if (jugadores.size() < 23) {
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
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;

                case 4:


                default:
                    System.out.println("Selecciona una opcion valida");
            }
        } while (variableDeControl != 5);
    }

}
