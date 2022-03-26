/**
 * import matcher class and pattern class
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * UC1-As a User need to enter a valid First Name - First name starts with Cap
 * and has minimum 3 characters UC2-As a User need to enter a valid Last Name -
 * Last name starts with Cap and has minimum 3 characters UC3-As a User need to
 * enter a valid email
 * 
 * @author user-Veeresh
 *
 */
public class ExceptionUserRegistration {

	// validating email//
	
	/**
	 * created method email and passing parameter in this it will check email is
	 * valid or not result will be in true or false because method is boolean type
	 * 
	 * @param str -passing email id
	 * @return -return to method created
	 */
	
	public boolean email(String str) {
		Pattern pattern = Pattern
				.compile("^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}