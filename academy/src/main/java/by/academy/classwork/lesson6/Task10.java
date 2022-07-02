package by.academy.classwork.lesson6;

import java.util.regex.Matcher; 
import java.util.regex.Pattern; 


public class Task10 {
	public static void main(String[] args) { 
        
		String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
		String regex = "[a-zA-Z0-9\\s]+\\d";
		
		Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher(str); 
        
        while (matcher.find()) {
        	//System.out.println(matcher.start());
        	//System.out.println(matcher.end());
        	System.out.println(str.substring(matcher.start(), matcher.end())); 
        }
    } 
}
