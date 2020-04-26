package homework3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task1IronMan {
	public static void main(String[] args) {
//		Задание: найти все слова в тексте, которые начинаются на a, b, c (регистр не важен), закинуть в StringBuilder,
//		разделяя пробелами, вывести на экран.
		String text = "Iron Man is a 2008 American superhero film based on the Marvel Comics character of the same name. Produced by Marvel \\r\\n\"\r\n"
				+ "				+ \"	    		Studios and distributed by Paramount Pictures,[N 1] it is the first film in the Marvel Cinematic Universe. \\r\\n\"\r\n"
				+ "				+ \"	    		It was directed by Jon Favreau from a screenplay by the writing teams of Mark Fergus and Hawk Ostby, and Art \\r\\n\"\r\n"
				+ "				+ \"	    		Marcum and Matt Holloway, and stars Robert Downey Jr. as Tony Stark / Iron Man alongside Terrence Howard, Jeff Bridges, \\r\\n\"\r\n"
				+ "				+ \"	    		Shaun Toub, and Gwyneth Paltrow. In the film, following his escape captivity from a terrorist group, world famous \\r\\n\"\r\n"
				+ "				+ \"	    		industrialist and master engineer Tony Stark builds a mechanized suit of armor and becomes the superhero Iron Man.\\r\\n\"\r\n"
				+ "				+ \"	    		A film featuring the character was in development at Universal Pictures, 20th Century Fox, and New Line Cinema at \\r\\n\"\r\n"
				+ "				+ \"	    		various times since 1990, before Marvel Studios reacquired the rights in 2006. Marvel put the project in production \\r\\n\"\r\n"
				+ "				+ \"	    		as its first self-financed film, with Paramount Pictures distributing. Favreau signed on as director in April 2006,\\r\\n\"\r\n"
				+ "				+ \"	    		and faced opposition from Marvel when trying to cast Downey in the title role; the actor was signed in September. \\r\\n\"\r\n"
				+ "				+ \"	    		Filming took place from March to June 2007, primarily in California to differentiate the film from numerous other \\r\\n\"\r\n"
				+ "				+ \"	    		superhero stories that are set in New York City-esque environments. During filming, the actors were free to create \\r\\n\"\r\n"
				+ "				+ \"	    		their own dialogue because pre-production was focused on the story and action. Rubber and metal versions of the armor,\\r\\n\"\r\n"
				+ "				+ \"	    		created by Stan Winston's company, were mixed with computer-generated imagery to create the title character.\\r\\n\"\r\n"
				+ "				+ \"	    		Iron Man premiered in Sydney on April 14, 2008, and was released in the United States on May 2, as the first film \\r\\n\"\r\n"
				+ "				+ \"	    		in Phase One of the MCU. It grossed over $585 million on its $140 million budget, becoming the eighth-highest grossing \\r\\n\"\r\n"
				+ "				+ \"	    		film of 2008. The film was praised by critics for its acting (particularly Downey's), screenplay, direction, visual \\r\\n\"\r\n"
				+ "				+ \"	    				effects, and action sequences. It was selected by the American Film Institute as one of the ten best films of \\r\\n\"\r\n"
				+ "				+ \"	    				2008 and received two nominations at the 81st Academy Awards for Best Sound Editing and Best Visual Effects. \\r\\n\"\r\n"
				+ "				+ \"	    				It was followed by two sequels, Iron Man 2 in 2010 and Iron Man 3 in 2013.";
       
        String[] wordArray = text.split(" ");
        Pattern p = Pattern.compile("\\b[аbcABC]\\w*\\b");
        for (String word : wordArray) {
            Matcher matcher = p.matcher(word);
            if (matcher.find()) {
                System.out.print(" " + word);
            }
        }
		System.out.println("Using \"split\"");
		String[] array = text.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String i : array) {
			if(i.toLowerCase().startsWith("a") || i.toLowerCase().startsWith("b") || i.toLowerCase().startsWith("c")) {
				result.append(i).append(" ");
			}
		}
		System.out.println(result);
    }
}