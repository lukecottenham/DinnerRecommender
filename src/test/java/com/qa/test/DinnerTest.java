package com.qa.test;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import com.qa.main.DinnerMethod;
import com.qa.main.FoodInput;

public class DinnerTest {
	@Test
	public void testPasta() {
		DinnerMethod dinnerMethod = new DinnerMethod();
		
		FoodInput foodChoice = new FoodInput();
		
		String choice1 = foodChoice.foodInput();
		String foodTest = dinnerMethod.getDinner(choice1);
		Assert.assertEquals("Is your favourite food Italian?", foodTest);

		String choice2 = foodChoice.foodInput();
		String foodTest2 = dinnerMethod.getDinner(choice2);
		Assert.assertEquals("Is your favourite food American?", foodTest2);

		String choice3 = foodChoice.foodInput();
		String foodTest3 = dinnerMethod.getDinner(choice3);
		Assert.assertEquals("Is your favourite food Mexican?", foodTest3);
		
		String choice4 = foodChoice.foodInput();
		String foodTest4 = dinnerMethod.getDinner(choice4);
		Assert.assertEquals("Is your favourite food Indian?", foodTest4);
		
		String falseChoice = foodChoice.foodInput();
		String foodTest5 = dinnerMethod.getDinner(falseChoice);
		Assert.assertEquals(
				"There is no recommendation for you currently in our DB. Would you like to enter another food?",
				foodTest5);
	}
}