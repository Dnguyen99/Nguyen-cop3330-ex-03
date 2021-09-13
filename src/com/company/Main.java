/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dylan Nguyen
 */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Enter a quote: ");
        String quote = input.nextLine();
        System.out.println("Who said this quote: ");
        String author = input.nextLine();
        System.out.println(""+author+ " says " +quote+".");
    }
}
