package com.github.main;

import java.util.Scanner;

public class Pingpong {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner s =new Scanner(System.in);
	    
	    System.out.println("Enter the number");
	    
	    int n=s.nextInt();
	    
	        for(int i=1;i<=n;i++)
	        {
	            if((i%3==0)&&(i%5==0))
	            System.out.println("pingpong");
	            else if(i%3==0)
	            System.out.println("ping");
	            else if(i%5==0)
	            System.out.println("pong");
	            else System.out.println(i);
	        }

	}

}
