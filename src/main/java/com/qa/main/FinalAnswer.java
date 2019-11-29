package com.qa.main;

import java.util.Scanner;

public class FinalAnswer {
	public Boolean finalAnswer() {
		int i = 0;
		while (i == 0) {
			Scanner yesNoInput = new Scanner(System.in);
			String userResponse = yesNoInput.nextLine();
			userResponse = userResponse.toLowerCase();
			if (userResponse.equals("yes")) {
				i = 1;
			} else if (userResponse.equals("no")) {
				i = 2;
			} else {
				System.out.println("invalid input, please try again");
			}
		}
		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}
}