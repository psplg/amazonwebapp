package com.amazon.amazonwebapp.testrunner;

import java.util.Arrays;
import cucumber.api.java.Before;

public class HooksClass {
	@Before
		public void setUp()
		{
			System.out.println("before the test");
			
			if(true)
			{
				
			}
		}	
}

