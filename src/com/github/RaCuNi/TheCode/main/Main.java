package com.github.RaCuNi.TheCode.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Let's start Summarize!");
		System.out.println("Type first 'Integer(Ex>1,2,3,4,5 ...)' and second 'Integer'.");
		System.out.println("(WARNING) Input MUST be 'INTEGER'.");
		System.out.println("Then Summarizer will Summarize those.");
		System.out.println("Do it!");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		DoSummarize sum = new DoSummarize();
		int y = sum.sum(a, b);
		System.out.println("a:"+a+" "+"b:"+b+" "+"return:"+y);
	}

}
