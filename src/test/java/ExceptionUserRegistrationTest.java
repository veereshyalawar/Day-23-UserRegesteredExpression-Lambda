
import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	/**
	 * test case for rule1 and rule2
	 */
	
	@Test
	/**
	 * created method givePasswordRule1_IsProper_ReturnTrue() for true condition
	 */
	public void givenPasswordRule1_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.passwordRule1("abcdefghi");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givePasswordRule1_IsNotProper_ReturnFalse() for false
	 * condition
	 */
	public void givenPasswordRule1_IsNotProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.passwordRule1("abcd");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	/**
	 * created method givePasswordRule2_IsProper_ReturnTrue() for true condition
	 */
	public void givenPasswordRule2_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.passwordRule2("qwgthRLjkdl");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givePasswordRule2_IsNotProper_ReturnFalse() for false
	 * condition
	 */
	public void givenPasswordRule2_IsNotProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.passwordRule2("jnsdjcvcp");
		Assert.assertEquals(false, actualResult);
	}
}