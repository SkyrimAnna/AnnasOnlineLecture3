package org.example;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        // I dont understand why i get a warning under the ThreadLocalRandom. Also why does it say origin 1 and bound 6?. The program runs!

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("Im thinking of a number from 1 to 5. Try to guess it.\n");
        System.out.print("Your guess: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == randomNumber) {
            System.out.println("Correct! Arent you lucky.");
        }

        else {

            System.out.println("Hard luck! Maybe next time.");

        }



    }


}
