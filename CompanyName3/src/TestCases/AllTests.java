package TestCases;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ QuoteBox_DropdownTests.class, Test_TypeOfPolicy_Business.class,
		Test_TypeOfPolicy_Leisure.class, Test_QuoteBox_Negative.class })
public class AllTests {

}
