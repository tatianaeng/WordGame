/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wordgame;
import java.util.Scanner;

/**
 *
 * @author tatianaeng
 */
public class WordGame
{

    public static void main(String[] args)
    {
        // variables
        String name;
        int age;
        String city;
        String college;
        String profession;
        String animal;
        String petName;
        
        // create the Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        // ask user for his/her name
        System.out.println("What is your name?");
        
        // read user input
        name = keyboard.nextLine();
        
        // ask user for his/her age
        System.out.println("What is your age?");
        
        // read user input
        age = keyboard.nextInt();
        
        // consume the remaining newline
        // otherwise, the computer will ask the user for the name of a city and then immediately ask for the name of a college, without giving the user to enter a city name.
        keyboard.nextLine();
        
        // ask user for the name of a city
        System.out.println("Enter the name of a city.");
        
        // read user input
        city = keyboard.nextLine();
        
        // ask user for the name of a college
        System.out.println("Enter the name of a college.");
        
        // read user input
        college = keyboard.nextLine();
        
        // ask user for a profession
        System.out.println("Enter a profession.");
        
        // read user input
        profession = keyboard.nextLine();
        
        // ask user for a type of animal
        System.out.println("Name a type of animal.");
        
        // read user input
        animal = keyboard.nextLine();
        
        // ask user for a pet's name
        System.out.println("Enter a pet's name.");
        
        // read user input
        petName = keyboard.nextLine();
        
        // generate the story
        /*
        System.out.println("There once was a person named " + name + " who lived in "
                + city + ".\nAt the age of " + age + ", " + name + " went to college at " 
                + college + ".\n" + name + " graduated and went to work as a " 
                + profession + ".\nThen, " + name + " adopted a(n) " + animal + " named " 
                + petName + ".\nThey both lived happily ever after!");
        */
        
        System.out.printf("There once was a person named %s who lived in %s.\n"
                + "At the age of %d, %s went to college at %s.\n%s graduated and went to work as a %s.\n"
                + "Then %s adopted a(n) %s named %s, and they lived happily ever after!", 
                name, city, age, name, college, name, profession, name, animal, petName);
    }
}