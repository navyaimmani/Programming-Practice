package com.github.main;

public class fibonaciloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;

		int b = 1;

		for (int i = 0;i<15;i++){

		System.out.println(a);

		a = a+b;

		b = a-b;

		}

	}

}
