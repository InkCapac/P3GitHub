/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String movimientoComputadora = rps[new Random().nextInt(rps.length)];

            String movimientoJugador;

            while (true) {
                System.out.println("Por favor, ingresa tu movimiento (r para piedra, p para papel, o s para tijera)");
                movimientoJugador = scanner.nextLine();
                if (movimientoJugador.equals("r") || movimientoJugador.equals("p") || movimientoJugador.equals("s")) {
                    break;
                }
                System.out.println(movimientoJugador + " no es un movimiento válido.");
            }

            System.out.println("La computadora jugó: " + movimientoComputadora);

            if (movimientoJugador.equals(movimientoComputadora)) {
                System.out.println("¡El juego quedó empatado!");
            } else if (movimientoJugador.equals("r")) {
                if (movimientoComputadora.equals("p")) {
                    System.out.println("¡Has perdido!");

                } else if (movimientoComputadora.equals("s")) {
                    System.out.println("¡Has ganado!");
                }
            } else if (movimientoJugador.equals("p")) {
                if (movimientoComputadora.equals("r")) {
                    System.out.println("¡Has ganado!");

                } else if (movimientoComputadora.equals("s")) {
                    System.out.println("¡Has perdido!");
                }
            } else if (movimientoJugador.equals("s")) {
                if (movimientoComputadora.equals("p")) {
                    System.out.println("¡Has ganado!");

                } else if (movimientoComputadora.equals("r")) {
                    System.out.println("¡Has perdido!");
                }
            }

            System.out.println("¿Jugar de nuevo? (s/n)");
            String jugarDeNuevo = scanner.nextLine();

            if (!jugarDeNuevo.equals("s")) {
                break;
            }
        }
        scanner.close();
    }
}
