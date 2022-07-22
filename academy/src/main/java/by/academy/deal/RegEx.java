package by.academy.deal;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
		private String regex = "\\d{2}\\/?\\-?\\d{2}\\/?\\-?\\d{4}";
		private String regex1 = "\\d{2}\\/\\d{2}\\/\\d{4}";
		
		private String date;
		
		public RegEx() {
			super();
		}
		
		public RegEx(String date) {
			super();
			this.date = date;
		}

		public boolean checkDate (){
			Pattern pattern = Pattern.compile(regex); 
	        Matcher matcher = pattern.matcher(date);
	        boolean a = matcher.matches();
	        return a;
		}

		public boolean checkDate1 (){
			Pattern pattern1 = Pattern.compile(regex1); 
	        Matcher matcher1 = pattern1.matcher(date);
	        boolean a = matcher1.matches();
	        return a;
		}
		
		public String getRegex() {
			return regex;
		}

		public void setRegex(String regex) {
			this.regex = regex;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getRegex1() {
			return regex1;
		}

		public void setRegex1(String regex1) {
			this.regex1 = regex1;
		}

		@Override
		public int hashCode() {
			return Objects.hash(date, regex, regex1);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			RegEx other = (RegEx) obj;
			return Objects.equals(date, other.date) && Objects.equals(regex, other.regex)
					&& Objects.equals(regex1, other.regex1);
		}

		@Override
		public String toString() {
			return "RegEx [regex=" + regex + ", regex1=" + regex1 + ", date=" + date + "]";
		}
}
