package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx {

	@Test
	public void m1()
	{
		System.out.println("step1");
		System.out.println("step2");
		System.out.println("step3");
	SoftAssert soft=new SoftAssert();
		soft.assertEquals(true, true);
		System.out.println("step4");
		System.out.println("step5");
		soft.assertAll();
	}


	@Test
	public void m2()
	{
		String expdata ="qspiders";
	   String actdata="qspiders";
	   SoftAssert soft=new SoftAssert();
		soft.assertEquals(expdata, actdata);
	   System.out.println("step5");
	   soft.assertAll();
	   
}
}
