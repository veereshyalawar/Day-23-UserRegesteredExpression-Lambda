/**
 * import matcher class and pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * As a User need to follow predefined Password rules. Rule1– minimum 8 Characters
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
}