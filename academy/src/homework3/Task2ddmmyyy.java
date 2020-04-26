package homework3;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Task2ddmmyyy {
//	Написать RegExp который проверял бы введенную дату на соответствие патерна:
//		   a) dd/MM/yyyy
//		   b) dd-MM-yyyy 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		
		if(s.matches("((([0]?[1-9])|([1]\\d)|2\\d|3[01])/(0?[1-9]|1[0-2])/(19|20)\\d\\d)"
				+ "|((([0]?[1-9])|([1]\\d)|2\\d|3[01])-(0?[1-9]|1[0-2])-(19|20)\\d\\d)")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}