package com.qa.main;

public class DinnerSystem {

	public void startSearch() {
		boolean searching  = true;
		while (searching) {
			FoodInput foodChoice = new FoodInput();
			DinnerMethod dinnerType = new DinnerMethod();
			
			String favFood = foodChoice.foodInput();
			dinnerType.getDinner(favFood);
		}
	}



}
