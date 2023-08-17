package com.knLoops;

import java.util.Scanner;

public class ForLoopSum {

	public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in);
    System.out.println("Enter the number");
    int num= scan.nextInt();
    int sum =0;
    for (int i = 1; i<=num;i++) {
    	sum =  sum+i;
    }
    System.out.println("the total number ="+sum);
	}

}
