package com.careerdevs;

import java.util.Scanner;

public class RentalService {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to BM Car Rentals App");
        System.out.println("please enter a number to select the car you will like to rent./n 1 2 or 3: ");
        String user = scanner.nextLine();
        System.out.println("you have chosen car" + user);

        System.out.println("Thank you, your order will be processed, pls enter your name");
        String user1 = scanner.nextLine();
        System.out.println(user1 + " How many days do you need the car?");
        short user2 = scanner.nextShort();
        System.out.println("You have selected " + user2 + " days");



        Car[] carStorage = new Car[3];

        // create obj instances
        Car car1 = new Car("Honda", "Accord");
        Car car2 = new Car("Chevy", "Cruze");
        Car car3 = new Car("Toyota", "Corolla");

        // store obj instances in list/arr
        carStorage[0] = car1;
        carStorage[1] = car2;
        carStorage[2] = car3;

        for (int i = 0; i < carStorage.length; i++) {
            //System.out.println(car1.getMake()); // this will output Honda
            System.out.println(carStorage[i].getMake()); // this output honda, chevy & toyota
        }
        System.out.println("Main Menu");
        System.out.println("1) Menu 1");
        System.out.println("2) Menu 2");
        System.out.println("3) Exit");



    }
}
