package org.example;

import org.example.clases.Jugador;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaPorTeclado=new Scanner(System.in);
        Jugador objetoJugador = new Jugador();

        ArrayList<Jugador> jugadores=new ArrayList<Jugador>();

        System.out.println("♥♥♥♥♥♥ BIENVENIDO ENTRENADOR NESTOR LORENZO ♥♥♥♥♥♥");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");

        int variableDeControl=0;
        System.out.println("Menu de jugador");
        System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
        System.out.print("1. Nombre, apellido, edad, posicion, numero de camiseta y equipo");
        System.out.print("2. ");
        System.out.print("3. Registro de Invitado");
        System.out.print("4. Ver Invitados");
        System.out.print("5. Ver costos");
        System.out.print("6. Ver ganancias");

    }
}