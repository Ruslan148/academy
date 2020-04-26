package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	public static boolean validate(String emailAddress) {
		Pattern p = Pattern.compile("^[\\w\\d-\\+]+(\\.[\\w\\d-]+)*@[\\w\\d-]+(\\.[\\w\\d]+)*(\\.[A-Za-z]{2,})$");
		Matcher m = p.matcher(emailAddress);
		return m.find();

	}
}