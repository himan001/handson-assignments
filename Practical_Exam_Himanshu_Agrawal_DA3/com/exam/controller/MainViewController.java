package com.exam.controller;

import java.util.Scanner;

public class MainViewController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);  //System Input 
		int choice = 0;  //User Choice

		do {
			System.out.println("*********************************************");
			System.out.println("1.Food Items 2.Apparel 3.Electronics 4.Exit");
			System.out.println("*********************************************");
			choice = scanner.nextInt();
			
			switch(choice) {
			case 1 : 
				break;
			case 2:
				break;
			case 3:
				break;
			}

		}while(choice!=4);
		
		scanner.close();
	}
	

}
