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
