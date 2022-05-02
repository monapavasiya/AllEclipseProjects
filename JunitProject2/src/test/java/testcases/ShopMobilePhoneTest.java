package testcases;

import org.junit.Assume;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ShopMobilePhoneTest 
{
	@Test         //add JUnit 4 library to built path
	public void test_a_serchForMobile()
	{
		System.out.println("Searching for mobile");
	}
	
	@Test
	public void  test_b_selectMobile ()          // torun in order need to give name alphabetically
	{
		System.out.println("Selecting mobile");
	}
	
	//@Ignore  // to skip any test
	@Test
	public void  test_c_checkout()
	{
		Assume.assumeTrue(false);   // to skip any test
		System.out.println("Checkout");
	}

}
