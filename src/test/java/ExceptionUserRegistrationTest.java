
import org.junit.Assert;
import org.junit.Test;

/**
 * @author veeresh
 * testCases for validating lastName
 *
 */
public class ExceptionUserRegistrationTest {
	ExceptionUserRegistration exceptionUserRegistration = new ExceptionUserRegistration();

	@Test
	/**
	 * created method givenLastName_IsProper_ReturnTrue() for true condition
	 */
	public void givenLastName_IsProper_ReturnTrue() {
		/**
		 * calling lastName method to see last name is valid or not
		 */
		boolean actualResult = exceptionUserRegistration.lastName("Yalawar");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	/**
	 * created method givenLastName_IsProper_ReturnFalse() for false condition
	 */
	public void givenLastName_IsProper_ReturnFalse() {
		/**
		 * calling lastName method to see last name is valid or not
		 */
		boolean actualResult = exceptionUserRegistration.lastName("yalawar");
		Assert.assertEquals(false, actualResult);
	}
}