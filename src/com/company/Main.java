package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
	    PassGen pass = new PassGen();
		Scanner scanner = new Scanner(System.in);
	    int length;
	    boolean in=false;
	    do {
	    	System.out.print("Enter length (0-15): ");
	    	length = scanner.nextInt();
	    	if(length>0 && length<=15) {
	    		in=true;
			}
			else {
				System.out.println("Wrong range. Please try again.");
			}
		}
		while(in==false);
	    String password = pass.getPass(length);
	    System.out.format("Generated password: %s", password);
    }
}