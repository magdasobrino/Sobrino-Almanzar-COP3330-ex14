/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args){

    int orderAmount;
    double total, stateTax = 0;
    String state;

    Scanner input = new Scanner(System.in);
    System.out.print("What is the order amount? ");
    orderAmount =input.nextInt();
    System.out.print("What is the State? ");
    state =input.next();


    if(state.equals("WI"))

    {
        stateTax = orderAmount * 0.055;
    }

    total=orderAmount+stateTax;

    System.out.printf("The subtotal is $%.2f \n",(double)orderAmount);
    System.out.printf("The tax is $%.2f \n",stateTax);
    System.out.printf("The total is $%.2f \n",total);

    System.exit(0);
	}//end of main

}//end of program
