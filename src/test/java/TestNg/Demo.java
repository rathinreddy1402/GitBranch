package TestNg;

import org.testng.annotations.Test;

public class Demo {

	@Test
public void createContact()
		{
		System.out.println("contact created");
			}
	
		@Test(invocationCount = 3)
public void modifyContact()
	{
		System.out.println("Contact modified");
	}
	
	@Test
	public void deleteContact()
	{
		System.out.println("contact deleted");
	}
	}


