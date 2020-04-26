package homework3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) throws ParseException {


				Scanner sc = new Scanner(System.in);
				System.out.println("Ввести параметры: день, месяц и год");
				Date date = null;
				Calendar calendarOne = Calendar.getInstance();
				String s = sc.nextLine();
				boolean value = s.matches("((([0]?[1-9])|([1]\\d)|2\\d|3[01])/(0?[1-9]|1[0-2])/(19|20)\\d\\d)"
											+ "|((([0]?[1-9])|([1]\\d)|2\\d|3[01])-(0?[1-9]|1[0-2])-(19|20)\\d\\d)");

				if (value) {
					if (s.charAt(2) == '-' && s.charAt(5) == '-') {
						SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
						date = format.parse(s);
					} else if (s.charAt(2) == '/' && s.charAt(5) == '/') {
						SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
						date = format.parse(s);
					}
				} else {
					System.out.println("Wrong");
					
				}
				calendarOne.setTime(date);

				System.out.println("День: \t" + calendarOne.get(Calendar.DAY_OF_MONTH) + "\r\n" + "Месяц: \t"
						+ (calendarOne.get(Calendar.MONTH) + 1) + "\r\n" + "Год: \t" + calendarOne.get(Calendar.YEAR));

				calendarOne.add(Calendar.MONTH, 3);
				System.out.println("Добавить 3 месяца: " + calendarOne.getTime());

				calendarOne.add(Calendar.DAY_OF_MONTH, 2);
				System.out.println("Добавить 2 дня: " + calendarOne.getTime());

				calendarOne.add(Calendar.HOUR, 4);
				System.out.println("Добавить 4 часа: " + calendarOne.getTime());
				
			}
		}
	
