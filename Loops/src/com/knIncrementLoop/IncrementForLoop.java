package com.knIncrementLoop;

import java.util.Scanner;

public final class IncrementForLoop {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = scan.nextInt();
//    for(int i =1;i<=num;i++) {
//    	System.out.println(i);
    for(int i = num;i>=1;i--) {
    	System.out.println(i);
    }
	}

}
