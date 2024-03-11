/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class NuevaFuncionalidad {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        
        //
        //
        //
        while (true) {
            //Ahora que el usuario escriba el nombre del movimiento
            //Para elevar la dificultad y así aprende inglés
            String[] rps = {"rock", "paper", "scissors"};
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
            } else if (movimientoJugador.equals("rock")) {
                if (movimientoComputadora.equals("paper")) {
                    System.out.println("¡Has perdido!");

                } else if (movimientoComputadora.equals("scissors")) {
                    System.out.println("¡Has ganado!");
                }
            } else if (movimientoJugador.equals("paper")) {
                if (movimientoComputadora.equals("rock")) {
                    System.out.println("¡Has ganado!");

                } else if (movimientoComputadora.equals("scissors")) {
                    System.out.println("¡Has perdido!");
                }
            } else if (movimientoJugador.equals("scissors")) {
                if (movimientoComputadora.equals("paper")) {
                    System.out.println("¡Has ganado!");

                } else if (movimientoComputadora.equals("rock")) {
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
