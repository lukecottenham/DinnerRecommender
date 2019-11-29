package com.qa.main;

import java.util.Scanner;

public class FoodInput {

	public String foodInput() {
		Scanner findFood = new Scanner(System.in);
		System.out.println("What food do you feel like having tonight?");
		String response = findFood.nextLine();
		String lowercaseResponse = response.toLowerCase();
		return lowercaseResponse;
	}
}
