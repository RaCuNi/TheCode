package com.github.RaCuNi.TheCode.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Let's start Summarize!");
		System.out.println("First, you should type integer from 2 to 4.");
		System.out.println("2: Summarize two Int.\n3: Summarize three Int.\n4: Summarize four Int.");
		System.out.println("Second, type integers.");
		System.out.println("(WARNING) Input MUST be 'INTEGER'.");
		System.out.println("Then Summarizer will Summarize those.");
		System.out.println("Do it!");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		DoSummarize sum = new DoSummarize();
		int i = sc.nextInt();
		switch(i){
		case 2: {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long y = sum.sum(a, b);
			System.out.println(y);
			break;
		}
		
		case 3: {
			long a2 = sc.nextLong();
			long b2 = sc.nextLong();
			long c2 = sc.nextLong();
			long y2 = sum.sum(a2, b2, c2);
			System.out.println(y2);
			break;
		}
		
		case 4: {
			long a3 = sc.nextLong();
			long b3 = sc.nextLong();
			long c3 = sc.nextLong();
		    long d3 = sc.nextLong();
		    long y3 = sum.sum(a3, b3, c3, d3);
		    System.out.println(y3);
		    break;
		}
		
		default: {
			System.out.println("You should type integer from 2 to 4.");
		  }
		}
	}

}
