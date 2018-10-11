package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int summary = 0;
        int randomInt = (int) (Math.random() * 101);
        System.out.println("Guess the random number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        {
            while (number != randomInt)
            {
                System.out.println("Guess again: ");
                summary = summary + 1;
                number = input.nextInt();
            }
        }
        System.out.println("That is correct! You took "+summary+" times to guess the number.");
    }
}
