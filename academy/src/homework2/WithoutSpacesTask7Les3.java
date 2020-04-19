package homework2;

import java.util.Scanner;

public class WithoutSpacesTask7Les3 {

	public static void main(String[] args) {
		       
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Введите текст с пробелами: ");
	        String str = sc.nextLine();
			
	        str = str.replace(" " , "");
	        
	        System.out.println("Result - " + str);
	        sc.close();
	   
    
	}

}
