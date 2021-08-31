/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;



public class Main
{
    public static void main( String[] args )
    {
        System.out.print("What is your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name + ", nice to meet you! " );
    }
}
