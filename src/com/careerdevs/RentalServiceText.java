package com.careerdevs;

import com.careerdevs.ui.UserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class RentalServiceText {
    private static ArrayList<Car> carStorage; // setting arraylist as a field (so we can access it any method within the program)


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Welcome to BM Car Rentals App");
//        System.out.println("please enter a number to select the car you will like to rent./n 1 2 or 3: ");
//        String user = scanner.nextLine();
//        System.out.println("you have chosen car" + user);
//
//        System.out.println("Thank you, your order will be processed, pls enter your name");
//        String user1 = scanner.nextLine();
//        System.out.println(user1 + " How many days do you need the car?");
//        short user2 = scanner.nextShort();
//        System.out.println("You have selected " + user2 + " days");

/* Create an array to store Car instances (objects)
You can use either an ArrayList<Car> or a standard Car[] for your data type
call this variable carStorage
Create at least 3 Car instances
create the car instances by calling the Car constructor
you should be hardcoding the data used for the constructor
you are allowed choose the make & model (see below for some examples)
Store your Car instances in the Car array
how you achieve this will vary depending on your choice for 1a

Display the ‘Available Cars’ menu
Iterate through your Car array.
Output each car’s data only if they are “available”
make sure the numbers go in order (no skips)
(see Client’s definition for an example)
Take user input in
Prompt the user as shown in the Clients Definition
read an “int” from the user and store it in a variable called “userSelection”
if the response is not valid (invalid data type or number out of range), ask the user again. You will need a loop for this.
(see Client’s definition for an example of 3)

Take user input in
Prompt the user as shown in the Clients Definition
read an “int” from the user and store it in a variable called “userSelection”
if the response is not valid (invalid data type or number out of range), ask the user again. You will need a loop for this.
(see Client’s definition for an example of 3)
Using the user’s input, modify the selected car’s “isRented” field to now be true
Output a response that displays the chosen car’s make and model
BONUS: Have the program start from the beginning and loop until all the cars have been rented. The program should cycle until all cars have been rented, at which point you have two choices: end the program, or reset the data.


*/

        //  Car[] carStorage = new Car[3]; same as [ArrayList<Car> carStorage]
        carStorage = new ArrayList<>();
        carStorage.add(new Car("Honda", "Accord"));
        carStorage.add(new Car("Chevy", "Cruze"));
        carStorage.add(new Car("Toyota", "Corolla"));

        carStorage.get(1).setRented(true);


// solution (std arr): iterate through the array, only displaying "Available Cars"
        System.out.println("Available Cars");
        int listNumber = 1;

        for (int i = 0; i < carStorage.size(); i++) {

            if (!carStorage.get(i).isRented() ) {
                System.out.println( listNumber + ") " + carStorage.get(i).getMake() + " " + carStorage.get(i).getModel() );
                 listNumber++;

                //System.out.println(car1.getMake()); // this will output Honda
                //System.out.println(carStorage[i].getMake()); // this output honda, chevy & toyota
            }
            int userSelection = UserInput.readInt("Enter anumber to select the car you'd like to rent");
            System.out.println(carStorage.size());

            for (int j = 0; j < userSelection; j++) {
                System.out.println(isRented.add(carStorage.get(0).getMake() + carStorage.get(0).getModel()));
            }
        }
//        System.out.println("Main Menu");
//        System.out.println("1) Menu 1");
//        System.out.println("2) Menu 2");
//        System.out.println("3) Exit");

    }
}


