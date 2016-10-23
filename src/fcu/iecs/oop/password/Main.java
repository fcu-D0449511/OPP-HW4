package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String b = "exit";
		
		Scanner input = new Scanner(System.in);
		PasswordEncorder str = new PasswordEncorder();
		String str1;
		
		do{		
		System.out.println("Please enter a password : ");
		str1 = input.nextLine();
	    str.encode(str1);
		System.out.println("-> " + str.encode(str1));
		
		}while(!str1.equals(b));
		input.close();
	}	
	}


