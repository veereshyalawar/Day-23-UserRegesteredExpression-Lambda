/**
 * import matcher class and pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC1- As a User need to enter a valid First Name - First name starts with Cap
 * and has minimum 3 characters 
 * UC2- As a User need to enter a valid Last Name -Last name starts with Cap 
 * and has minimum 3 characters 
 * UC3- As a User need to enter a valid email
 * UC4- As a User need to follow pre-defined Mobile Format Country code follow by space and 10
   digit number
 * @author user-Veeresh
 *
 */
public class ExceptionUserRegistration {

	/**
	 * created method phoneNumber and passing parameter in this it will check phone
	 * Number is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param str -passing phone number
	 * @return -return to method created
	 */
	public boolean phoneNumber(String str) {
		Pattern pattern = Pattern.compile("91\\s[0-9]{10}");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}