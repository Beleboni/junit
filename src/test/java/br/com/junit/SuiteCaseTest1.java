package br.com.junit;

import static org.junit.Assert.*;
import org.junit.Test;

public class SuiteCaseTest1 {
	
	@Test
	public void calc(){
		assertEquals(4, 2 + 2);
	}

}
