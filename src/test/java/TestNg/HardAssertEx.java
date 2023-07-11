package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertEx {

	/*@Test
	public void m1()
	{
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
		Assert.assertEquals(true, true);
		System.out.println("step4");
		System.out.println("step5");
	}*/
	
	@Test
	public void m2()
	{
		String expdata ="qspiders";
	   String actdata="qspiders";
	   Assert.assertEquals(actdata, expdata);
	   System.out.println("step5");
	}}

