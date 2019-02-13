package br.com.junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
//import static br.com.junit.IsEmptyString.*;
import static br.com.junit.DivisibleBy.*;
import org.junit.Test;

public class AssertTest {
	
	@Test
	public void testAssert(){
//		String str1 = "jUnit";
//		String str2 = "jUnit";
//		Integer int1 = 1;
//		Integer int2 = 0;
//		
//		assertEquals(str1, str2);
//		assertSame(int1, int2);
		
//		int [] array1 = {1,2,3,4};
//		int [] array2 = {1,2,3,4};
		
//		assertNotNull(int1);
//		assertNull(int1);
		
//		assertArrayEquals(array1, array2);
//		assertThat(str1, isA(String.class));
//		assertThat(str1, is("jUnit"));
//		assertThat("Not equals", "1234", is("123"));
		
//		String tst = "";
//		assertThat(tst, is(isEmpty(tst)));
		
		Integer tst2 = 6;
		assertThat(tst2, is(divisibleBy(tst2)));
	}

}
