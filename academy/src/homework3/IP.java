package homework3;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IP {

	private static String S;
	private static boolean bool;

	private static final String IPADDRESS_PATTERN = 


			 "(((([0-1][0-9][0-9])|(2[0-4][0-9])|(2[0-5][0-5]))\\.){3}(([0-1][0-9][0-9])|(2[0-4][0-5])|(2[0-5][0-5])))";
	public static void main(String[] args) {

//      Scanner sc = new Scanner(System.in);
//      System.out.println("Введите число: ");
//      x = sc.nextInt();
//      sc.close();

		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		S = s.next();
		bool = validate(S);
		if (bool == true) {
			System.out.println("IP адрес");
		} else {
			System.out.println("Строка не IP адрес");
		}

	}

	public static boolean validate(String ip) {
		Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
		Matcher matcher = pattern.matcher(ip);
		return matcher.matches();
	}

}
