package src.main.java.basics;

import java.util.Scanner;

public class GrossPayCalculator {
	public static void main(String[] args) {
		System.out.println("How much did you work in a week?");
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();

		System.out.println("What is your hourly pay rate?");
		double rate = sc.nextDouble();

		double grossPay = hours * rate;
		System.out.println("Your gross pay is $" + grossPay);
	}
}
