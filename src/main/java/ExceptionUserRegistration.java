/**
 * import matcher class and pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * UC1- As a User need to enter a valid First Name - First name starts with Cap
 *      and has minimum 3 characters 
 * UC2- As a User need to enter a valid Last Name-Last name starts with Cap and
 *      has minimum 3 characters 
 * UC3- As a User need to enter a valid email 
 * UC4- As a User need to follow 
 *      predefined Mobile Format Country code follow by space and 10 digit number 
 * UC5- As a User need to follow pre-defined Password rules. Rule1– minimum 8 Characters
 * UC6- Rule2 – Should have at least 1 Upper Case
 * 
 * @author user-Veeresh
 *
 */
public class ExceptionUserRegistration {

	

	/**
	 * created method PasswordRule1 and passing parameter in this it will check
	 * Password is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param password- passing password
	 * @return -return to method created
	 */
	public boolean passwordRule1(String str) {
		Pattern pattern = Pattern.compile("[a-zA-Z]{8,}");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}

	/**
	 * created method PasswordRule2 and passing parameter in this it will check
	 * Password is valid or not result will be in true or false because method is
	 * boolean type
	 * 
	 * @param password- passing password
	 * @return -return to method created
	 */
	public boolean passwordRule2(String str) {
		Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z]).{8,}$");
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
}