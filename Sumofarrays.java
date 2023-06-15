package com.tmf;
import java.util.Scanner;
public class Sumofarrays {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int marks[]=new int[10];
	int sum=0;
	Scanner obj=new Scanner(System.in);
	for(int i=0; i<10; i++) {
		System.out.println("enter a num");
		marks[i]=obj.nextInt();
		sum=sum+marks[i];
		
	}
	for(int i=0; i<10; i++) {
		System.out.println("marks[" +i+ "] = " +marks[i] );
	}
	System.out.println("The sum of given numbers are "+sum);

	}

}
