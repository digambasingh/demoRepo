package com.demo;

import java.util.Scanner;

public class EvenNumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the Number is: ");
	int number = sc.nextInt();
	
	System.out.println("Even numbers are:");
	for(int i=0;i<=number;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
		}
	}
}
}
