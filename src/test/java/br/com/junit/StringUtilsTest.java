package br.com.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
	
	@Test
	public void testConcatenate(){
		StringUtils util = new StringUtils();
		
		String res = util.concatenate("SON", "jUnit");
		
		assertEquals("SONjUnit", res);		
	}
	
}