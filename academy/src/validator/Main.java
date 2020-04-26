package validator;

public class Main {

	public static void main(String[] args) {
		AmericanPhoneValidator americaValue = new AmericanPhoneValidator();
		BelarusPhoneValidator belarusValue = new BelarusPhoneValidator();
		EmailValidator emailAddres = new EmailValidator();
		
		System.out.println(americaValue.validate("+132222222554"));  // начинается на +1
		System.out.println(americaValue.validate("+23566664569988"));
		System.out.println(belarusValue.validate("+375292233444")); // начинается на +375
		System.out.println(belarusValue.validate("+355575445972068"));
		System.out.println(emailAddres.validate("rus@mail.ru"));
		System.out.println(emailAddres.validate("mlhamed@uran.com"));
		System.out.println(emailAddres.validate("lalalala@.ss"));
	
	}

}