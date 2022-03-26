import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	@Test
	/**
	 * @author veeresh
	 * created method givenMobileNumber_IsProper_ReturnTrue() for true condition
	 */
	public void givenMobileNumber_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.phoneNumber("91 8867743684");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givenMobileNumber_IsNotProper_ReturnFalse() for false
	 * condition
	 */
	public void givenMobileNumber_IsNotProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.phoneNumber("81 23452565674875");
		Assert.assertEquals(false, actualResult);
	}
}