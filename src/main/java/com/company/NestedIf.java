package com.company;

import java.util.Scanner;

public class NestedIf {
    public void chooseRoom() {
        Scanner s = new Scanner(System.in);

        String userInput;

        System.out.println("WELCOME TO AKSHAY/'s TINY ADVENTURE!");

        System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"");
        userInput = s.nextLine();

        if(userInput.equals("upstairs") ){
            System.out.println("You go upstairs and see a bedroom door and a bathroom door, do you go into the \"bathroom\" or the \"bedroom\"?");
            userInput = s.nextLine();
            if(userInput.equals("bathroom") ){
                System.out.println("you go into the bathroom and see a \"faucet\" and a \"toilet\" what do you use?");
                userInput = s.nextLine();
                if(userInput.equals("faucet") ){
                    System.out.println("you open the faucet and acid sprays out and kills you! BYE!");
                }else if(userInput.equals("toilet")){
                    System.out.println("you use the toilet as you flush the house starts ringing and vibrating and then blows up you die! BYE!!");
                }
            }if(userInput.equals("bedroom") ){
                System.out.println("you go into the bedroom and see a \"window\" and a \"bed\" do you sleep on the bed or open the window?");
                userInput = s.nextLine();
                if(userInput.equals("window") ){
                    System.out.println("you open the window and get shot and die! BYE!");
                }
                if(userInput.equals("bed") ){
                    System.out.println("you sleep on the bed and fall into a eternal slumber and die of starvation!! BYE!");
                }
            }
        }else if(userInput.equals("kitchen")){
            System.out.println("you see a \"pantry\" and a \"fridge\" which one do you open?");
            userInput = s.nextLine();
            if(userInput.equals("pantry")){
                System.out.println("you see the food inside do want to cook it? \"yes\" or \"no\"? ");
                userInput = s.nextLine();
                if(userInput.equals("yes")){
                    System.out.println("you go to the stove to cook the food but the stove explodes as you turn it on and you burn and die! BYE!!");
                } else if(userInput.equals("no")){
                    System.out.println("opening the pantry locks all the doors so you realize that you cant leave so you get hungry cook the food and the stove explodes and you die!");
                }
            }
            if(userInput.equals("fridge")){
                System.out.println("you see the cooked food inside do you \"eat\" or \"no\"");
                userInput = s.nextLine();
                if(userInput.equals("yes")){
                    System.out.println("you die from eating bad food");
                } else if(userInput.equals("no")){
                    System.out.println("you get bored and leave the house safe!");
                }

            }

        }


    }
}
