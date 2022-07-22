package by.academy.deal;

import java.util.Objects;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {
	private Pattern patternBel = Pattern.compile("\\+375[0-9]{9}");

	public BelarusPhoneValidator() {
		super();
	}
	@Override
	public Pattern getPattern() {
		return patternBel;
	}
	public Pattern getPatternBel() {
		return patternBel;
	}
	public void setPatternBel(Pattern patternBel) {
		this.patternBel = patternBel;
	}
	@Override
	public int hashCode() {
		return Objects.hash(patternBel);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelarusPhoneValidator other = (BelarusPhoneValidator) obj;
		return Objects.equals(patternBel, other.patternBel);
	}
	@Override
	public String toString() {
		return "BelarusPhoneValidator [patternBel=" + patternBel + "]";
	}
}



