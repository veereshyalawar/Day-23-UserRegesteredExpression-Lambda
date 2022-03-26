import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();



	@Test
	/**
	 * @author veeresh
	 * created method givePasswordRule1_IsProper_ReturnTrue() for true condition
	 */
	public void givenPasswordRule1_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.passwordRule1("aBcdeFghiM");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givePasswordRule1_IsNotProper_ReturnFalse() for false
	 * condition
	 */
	public void givenPasswordRule1_IsNotProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.passwordRule1("abCd");
		Assert.assertEquals(false, actualResult);
	}
}