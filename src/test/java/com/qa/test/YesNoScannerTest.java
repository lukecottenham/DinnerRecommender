package com.qa.test;

import org.junit.Assert;
import org.junit.Test;

import com.qa.main.FinalAnswer;

public class YesNoScannerTest {

	@Test
	public void yesTest() {
		FinalAnswer answer = new FinalAnswer();
		boolean responseYes = answer.finalAnswer();
		System.out.println(responseYes);
		Assert.assertEquals(true, responseYes);
	}
	
	@Test
	public void noTest() {
		FinalAnswer answer = new FinalAnswer();
		boolean responseNo = answer.finalAnswer();
		System.out.println(responseNo);
		Assert.assertEquals(false, responseNo);
	}

}
