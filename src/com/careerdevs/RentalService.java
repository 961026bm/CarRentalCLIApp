package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalService {
    private static ArrayList<Car> carStorage; // setting arraylist as a field (so we can access it any method within the program)


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

/* Create an array to store Car instances (objects)
You can use either an ArrayList<Car> or a standard Car[] for your data type
call this variable carStorage
Create at least 3 Car instances
create the car instances by calling the Car constructor
you should be hardcoding the data used for the constructor
you are allowed choose the make & model (see below for some examples)
Store your Car instances in the Car array
how you achieve this will vary depending on your choice for 1a
*/

       //  Car[] carStorage = new Car[3]; same as [ArrayList<Car> carStorage]
        carStorage = new ArrayList<>();
        carStorage.add(new Car("Honda", "Accord"));
        carStorage.add(new Car("Chevy", "Cruze"));
        carStorage.add(new Car("Toyota", "Corolla"));

        System.out.println(carStorage.get(0).getMake());


// solution (std arr): iterate through the array, only displaying "Available Cars"
        System.out.println("Available Cars");
        int listNumber = 1;
      /*for (int i = 0; i < carStorage.length; i++) {

            if (!carStorage[i].isRented() ) {
                System.out.println( "(" + listNumber + ") " + carStorage[i].getName() );
                listNumber++;

                //System.out.println(car1.getMake()); // this will output Honda
                //System.out.println(carStorage[i].getMake()); // this output honda, chevy & toyota
            }
        }*/
//        System.out.println("Main Menu");
//        System.out.println("1) Menu 1");
//        System.out.println("2) Menu 2");
//        System.out.println("3) Exit");

    }
}
