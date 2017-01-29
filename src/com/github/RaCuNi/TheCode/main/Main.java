package com.github.RaCuNi.TheCode.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		DoSummarize sum = new DoSummarize();
		int y = sum.sum(a, b);
		System.out.println("a:"+a+" "+"b:"+b+" "+"return:"+y);
	}

}
