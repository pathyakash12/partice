package com.knTableLoop;

import java.util.Scanner;

public class FirstNPrimeNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
        int num = scan.nextInt();
        int count=0;
        for(int i=2;i<=num;i++) {
        for(int j=1;j<=i;j++) 
        {
        	if(i%j==0) {
        	count++;
        	}
        }
      if(count<=2) {
    	  System.out.println(i);
      } 
      count=0;
	}
	

}
}