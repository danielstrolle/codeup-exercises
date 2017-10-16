package com.codeup;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Something: ");
        String userInput = scan.nextLine();
        System.out.println("You Entered: '" + userInput + "'");
        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is a number");
        } else {
            System.out.println(userInput + " is not a number");
        }
        String swap = StringUtils.swapCase(userInput);
        System.out.println("Flipped Case: " + swap);
        String reverse = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reverse);
    }
}
