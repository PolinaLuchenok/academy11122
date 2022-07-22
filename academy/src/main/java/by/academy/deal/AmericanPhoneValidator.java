package by.academy.deal;

import java.util.Objects;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
	private Pattern patternAm = Pattern.compile("\\+1[2-9]{1}[0-9]{2}[2-9]{1}[0-9]{6}");

	public AmericanPhoneValidator() {
		super();
	}
	
	@Override
	public Pattern getPattern() {
		return patternAm;
	}

	public Pattern getPatternAm() {
		return patternAm;
	}

	public void setPatternAm(Pattern patternAm) {
		this.patternAm = patternAm;
	}

	@Override
	public int hashCode() {
		return Objects.hash(patternAm);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AmericanPhoneValidator other = (AmericanPhoneValidator) obj;
		return Objects.equals(patternAm, other.patternAm);
	}

	@Override
	public String toString() {
		return "AmericanPhoneValidator [patternAm=" + patternAm + "]";
	}
}
