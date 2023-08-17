package com.knTableLoop;

import java.util.Scanner;

public class TableForLoop {

	public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter number");
    int num = scan.nextInt();
//    for(int i  =1; i<=num;i++) {
//    	System.out.println(num +"*"+i+"="+(num*i));
//    	table code
//    }
//    for(int i =2; i<=num;i+=2) {
//    	//even numbers
//    	    	System.out.println(i);
//    }
    int sum=0;
    for(int i =2;i<=num;i+=2) {
    	
    	sum= sum+i;
    //total even numbers
    }
	 System.out.println(sum);
   


	}
	

}
