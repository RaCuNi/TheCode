package com.github.RaCuNi.TheCode.main;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String UserInput = br.readLine();
		String UserInput_ = br.readLine();
		int a = Integer.parseInt(UserInput);
		int b = Integer.parseInt(UserInput_);
		DoSummarize sum = new DoSummarize();
		int y = sum.sum(a, b);
		System.out.println("a:"+a+" "+"b:"+b+" "+"return:"+y);
	}

}
