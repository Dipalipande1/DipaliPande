package com.model;

import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	int number,i=0;
	int binary[]=new int[100];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter decimal number: ");
	number =sc.nextInt();
	
	while(number!=0) 
	{
		binary[i]=number%2;
		number=number/2;
		i++;
		System.out.println("Binary value is: ");
		for (int j=1;j>=0;j--)
		{
			System.out.println("" +binary[j]);
		}
		
		
	}
	
	
	
	
}
	
	
	
	
}
