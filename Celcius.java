package com.model;

import java.util.Scanner;

public class Celcius {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Fahrenhit to celcius(1) or celcius to fahrenhit (2)");
    int result =sc.nextInt();
    
    if(result==1)
    {
    	System.out.println("You have choosen Fahrenhit to celcius");
    	System.out.println("Enter Fahrenhit value: ");
    	double value=sc.nextDouble();
    	double valueFinal=(value-32) * 5/9;
    	System.out.println("Celcius id: ");
    	System.out.println(Math.round(valueFinal*10.0)/10.0);
    	
    }
    else if(result ==2)
    {
    	System.out.println("You have choosen celcius to Fahrenhit !");
    	System.out.println("Enter celcius value: ");
    	double value=sc.nextDouble();
    	double valueFinal=value*1.8+32;
    	System.out.println("Fahrenhit is: ");
    	double finalResult=0;
    	System.out.println(Math.round(finalResult*10.0)/10.0);
    }
	
    else if(result==2)
    {
    	System.out.println("You have choosen celcius to Fahrenhit !");
    	System.out.println("Enter celcius value: ");
    	double value=sc.nextDouble();
    	double valueFinal=value*1.8+32;
    	System.out.println("Fahrenhit is: ");
    	double finalResult=0;
    	System.out.println(Math.round(finalResult*10.0)/10.0);
    	
    }
}
	
	
	
}


