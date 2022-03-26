import org.junit.Assert;
import org.junit.Test;

public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	@Test
	/**
	 * created method givenEmailId_IsProper_ReturnTrue() for true condition
	 */
	public void givenEmailId_IsProper_ReturnTrue() {
		boolean actualResult = exceptionUserRegistration.email("veereshyalawar2@gmail.com");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givenEmailId_IsNotProper_ReturnFalse() for false condition
	 */
	public void givenEmailId_IsNotProper_ReturnFalse() {
		boolean actualResult = exceptionUserRegistration.email("veeresh.comgmail");
		Assert.assertEquals(false, actualResult);
	}
}