package testcases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	LoginTest.class,
	ShopMobilePhoneTest.class,
	Validations.class
})
public class CustomProjectRunner 
{

}
