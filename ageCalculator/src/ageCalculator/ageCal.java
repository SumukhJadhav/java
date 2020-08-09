package ageCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ageCal {

	public static void main(String[] args) {
			
			LocalDate today = LocalDate.now();
			System.out.println("\t Age Calculator");
			System.out.print("Enter Year:");
			
			Scanner scan = new Scanner(System.in);
			int year = scan.nextInt();
			
			System.out.print("Enter month:");
			int month = scan.nextInt();
			
			System.out.print("Enter day");
			int dayOfMonth = scan.nextInt();
			
			LocalDate birthDate = LocalDate.of(year, month, dayOfMonth);
			
			
			int x = Period.between(birthDate, today).getYears();
			
			System.out.println("You are " + x + " years old.");

	}

}
