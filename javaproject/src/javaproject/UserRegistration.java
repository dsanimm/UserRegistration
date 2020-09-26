package javaproject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name:");
		String fname = sc.next();
		String regex = "(^[A-Z][a-z]{2,})";
		Pattern p = Pattern.compile(regex);
		
		Matcher m = p.matcher(fname);
		
		if(m.find()) {
			System.out.println("First Name is Valid");
		}
		
		else {
			System.out.println("Invalid First Name");
		}
		
		
	}

}
