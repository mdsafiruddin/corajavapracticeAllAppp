package com.app.core;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
		    for(int j=1; j <=10-i; j++) {
			System.out.print(" ");
		}
		for(int k=1; k<= 2*i; k++) {
			System.out.print("*");
		}
        System.out.println( );
}

		for(int a=1; a<=10; a--) {
	for(int b=1; b <=10-a; b--) {
		System.out.print(" ");
	}
	for(int k=1; k<= 2*a; k--) {
		System.out.print("*");
	}
}
		System.out.println(" ");
	}
	
}
	
