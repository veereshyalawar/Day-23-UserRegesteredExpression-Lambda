/**
 * import matcher class and pattern class
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** 
 * As a User need to follow predefined Password rules.
 * UC5- Rule1– minimum 8 Characters
 * UC6- Rule2 – Should have at least 1 Upper Case
 * UC7- Rule3- Should have at least 1 numeric number in the password
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
	
	/**
	 * created method PasswordRule3 and passing parameter in this it will check
	 * Password is valid or not having Minimum 8 Characters and first letters should
	 * be capital with one numeric number in that result will be in true or false
	 * because method is boolean type
	 * 
	 * @param password- passing password
	 * @return -return to method created
	 */
	 public boolean passwordRule3(String str) {
	        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$");
	        Matcher matcher = pattern.matcher(str);
	        return matcher.matches();
	    }
}