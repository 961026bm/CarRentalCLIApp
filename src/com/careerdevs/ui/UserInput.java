package com.careerdevs.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static int readInt (String question, int min, int max) {
        while (true) {
            System.out.println(question + "\nNumber (" + min + " " + max +"): ");

            try {
                int answer = scanner.nextInt();
                scanner.nextLine();
                while (answer > max || answer < min) {
                    System.out.println("you must enter a valid number, please try again");
                    System.out.println(question);
                    answer = scanner.nextInt();
                    scanner.nextLine();
                }
                return answer;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("you must enter an integer, please try again");
            }
        }
    }

}
