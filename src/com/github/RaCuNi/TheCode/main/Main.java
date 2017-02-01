package com.github.RaCuNi.TheCode.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Let's start Summarize!");
		System.out.println("Type first 'Integer(Ex>1,2,3,4,5 ...)' and second 'Integer'.");
		System.out.println("(WARNING) Input MUST be 'INTEGER'.");
		System.out.println("Then Summarizer will Summarize those.");
		System.out.println("Do it!");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		DoSummarize sum = new DoSummarize();
		int i = sc.nextInt();
		switch(i){
		case 1: {
			int a = sc.nextInt();
			int y = sum.sum(a);
			System.out.println(y);
			break;
		}
		
		case 2: {
			int a2 = sc.nextInt();
			int b2 = sc.nextInt();
			int y2 = sum.sum(a2, b2);
			System.out.println(y2);
			break;
		}
		
		case 3: {
			int a3 = sc.nextInt();
			int b3 = sc.nextInt();
			int c3 = sc.nextInt();
			int y3 = sum.sum(a3, b3, c3);
			System.out.println(y3);
			break;
		}
		
		case 4: {
			int a4 = sc.nextInt();
			int b4 = sc.nextInt();
			int c4 = sc.nextInt();
		    int d4 = sc.nextInt();
		    int y4 = sum.sum(a4, b4, c4, d4);
		    System.out.println(y4);
		    break;
		}
		
		default: {
			System.out.println("You should type integer from 1 to 4.");
		  }
		}
	}

}
