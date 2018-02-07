/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Greeting;

//* Bianca Papapietro, Univesity of Phoenix

import java.util.Scanner;


public class Greeting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a keyboard input object
        Scanner keyboard = new Scanner(System.in);
        
        //Display on the console - ask for customer's name
        System.out.print("Please enter your name. ");
        
        //Get the customer name from the keyboard and store it in the String onject "customerName"
        String customerName=keyboard.next();
        System.out.println("");
        
        //Display the customer's nmae on the console using println()
        System.out.println("Welcome, " + customerName + "!");
                
        
    }
    
}
