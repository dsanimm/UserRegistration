package javaproject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	public static void check(String toCheck,String regex){
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(toCheck);
		
		if(m.find()) {
			System.out.println("Valid");
		}
		
		else {
			System.out.println("Invalid");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String fname = sc.next();
		String regex = "(^[A-Z][a-z]{2,})";
		check(fname,regex);
		System.out.println("Enter Last Name:");
		String lname = sc.next();
		check(lname,regex);
		
		
		
		
		
	}

}
