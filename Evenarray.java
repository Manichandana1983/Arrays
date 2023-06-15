package com.tmf;
import java.util.Scanner;
public class Evenarray {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int marks[]=new int[5];
	Scanner obj=new Scanner(System.in);
	for(int i=0; i<5; i++) {
		System.out.println("enter a number");
		marks[i]=obj.nextInt();
		
	}
	for(int i=0; i<5; i++) {
	if(marks[i] %2 ==0) {
		System.out.println(marks[i]);
	}
		
		
	}

	}

}
