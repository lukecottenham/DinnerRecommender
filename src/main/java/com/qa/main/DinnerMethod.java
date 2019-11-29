package com.qa.main;
public class DinnerMethod {
	public String getDinner (String userInput) {
		String output = "";
	        switch(userInput)
	        {
	            case "pasta":
	            	output = "Is your favourite food Italian?";
	                System.out.println(output);
	                break;
	            case "burgers":
	            	output = "Is your favourite food American?";
	                System.out.println(output);
	                break;
	            case "tacos":
	            	output = "Is your favourite food Mexican?";
	                System.out.println(output);
	                break;
	            case "curry":
	            	output = "Is your favourite food Indian?";
	            	System.out.println(output);
	            	break;
	            default:
	            	output = "There is no recommendation for you currently in our DB. Would you like to enter another food?";
	                System.out.println(output);
	                break;
	        }
			return output;
	}
}