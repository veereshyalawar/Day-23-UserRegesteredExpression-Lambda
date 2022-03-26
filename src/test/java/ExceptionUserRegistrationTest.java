import org.junit.Assert;
import org.junit.Test;

/**
 * @author veeresh
 * testCases for validating firstName
 *
 */
public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	@Test
	/**
	 * created method givenFirstName_IsProper_ReturnTrue() for true condition
	 */
	public void givenFirstName_IsProper_ReturnTrue() {
		/**
		 * calling firstName method to see first name is valid or not
		 */
		boolean actualResult = exceptionUserRegistration.firstName("Veer");
		Assert.assertEquals(true, actualResult);
		}

	@Test
	/**
	 * created method givenFirstName_IsProper_ReturnFalse() for false condition
	 */
	public void givenFirstName_IsProper_ReturnFalse() {
		/**
		 * calling firstName method to see first name is valid or not
		 */
		boolean actualResult = exceptionUserRegistration.firstName("veer");
		Assert.assertEquals(false, actualResult);
	}
}