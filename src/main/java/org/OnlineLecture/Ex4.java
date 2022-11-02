package org.example;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("\nIm thinking of a number from 1 to 5. Try to guess it.");
        System.out.print("\nYour guess: ");
        Scanner scanner  = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("\nCorrect! Arent you lucky!");
        }

        else {

            System.out.println("\nWrong! Have another go.");
            System.out.print("\nYour guess: ");
            guess = scanner.nextInt();
        }

        if (guess == randomNumber) {
            System.out.println("\nCorrect! About time!");

        }

        else {

            System.out.println("\nWrong again! Maybe next time.");
        }

    }
}
