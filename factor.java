package com.Loops;

import java.util.Scanner;

public class factor {
	 static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
//		factor(n);
               for(int i=1;n>=i;i++){
            	   
            	   if(n%i==0) {
            		   System.out.print(i+" ");
            	   }
               }
	}

	
	
	
	
	

//	static void factor(int num) {
//		String yn="";
//		do {
//			
//		
//		for (int i = 1; num >= i; i++) {
//
//			if (num % i == 0) {
//				System.out.print(i);
//				System.out.println(" ");
//			}
//		}System.out.print("do you want to continue y or n:");
//               yn=sc.next();
//		}while(yn.equalsIgnoreCase("Y"));
//	}

	
}
