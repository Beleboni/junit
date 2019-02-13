package br.com.junit;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class IsEmptyString extends TypeSafeDiagnosingMatcher<String> {

	private final String str;
	
	public IsEmptyString(String str) {
		this.str = str;
	}
	
	@Override
	public void describeTo(Description description) {
		description.appendText("A string is empty");
	}

	@Override
	protected boolean matchesSafely(String str, Description description) {
		Boolean result = str == "";
		description.appendText("String").appendValue(str).appendText("is empty: ").appendValue(result);
		return str == "";
	}
	
	public static IsEmptyString isEmpty(String str) {
		return new IsEmptyString(str);
	}

	public String getStr() {
		return str;
	}

}