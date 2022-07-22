package by.academy.deal;

import java.util.regex.Pattern;

public interface Validator {
	public default boolean validate (String string) {
		return getPattern().matcher(string).matches();
	}
	Pattern getPattern();
}
