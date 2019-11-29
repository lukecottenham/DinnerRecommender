package com.qa.test;

import org.junit.Assert;
import org.junit.Test;

import com.qa.main.FoodInput;

public class FoodInputTest {

	@Test
	public void testPasta() {
		FoodInput food = new FoodInput();
		String response = food.foodInput();
		System.out.println(response);
		Assert.assertEquals("pasta", response);
	}

}
