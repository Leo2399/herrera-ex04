/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Leonardo Herrera
 */

package base;

import java.util.Scanner;

public class Solution04 {
    /*
    print "Enter a noun"
    'noun' = read string from user

    print "Enter a verb"
    'verb' = read string from user

    print "Enter an adjective"
    'adjective' = read string from user

    print "Enter an adverb"
    'adverb' = read string from user

    print "Do you 'verb' your 'adjective' 'noun' 'adverb'? That's hilarious!"
    */
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();

        System.out.print("Enter a verb: ");
        String verb = input.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = input.nextLine();

        System.out.print("Enter an adverb: ");
        String adv = input.nextLine();

        System.out.println("Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!");
    }
}
