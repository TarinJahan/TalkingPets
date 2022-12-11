package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        Integer numberOfPets;
        numberOfPets = scanner.nextInt();
        System.out.println("What kind of pet do you have: Cat, Dog, or Rabbit?");
        String[] pets = new String[3];

        for(int i = 0; i < pets.length; i++){
            String typeOfPet = "";
            typeOfPet = scanner.next();
            if(typeOfPet.equals("Cat")){
                //pets[i] = Cat;
            } else {
                System.out.println("Please enter an animal that is listed.");
            }
        }
    }


}
