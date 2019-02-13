package br.com.junit;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

public class AnnonTest {
	
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();
	
	@BeforeClass
	public static void beforeClassTest() {
		System.out.println("@Before Class executed");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("@Before Class executed");
	}
	
	@Test
	@Ignore
	public void testOneTest() {
		System.out.println("@Test one");
	}
	
	@Test
	@Ignore
	public void testTwoTest() {
		System.out.println("@Test two");
	}
	
	@Test(expected = Exception.class)
	@Ignore
	public void divideIntergerByZero() {
		//int number = 10 / 0;
	}
	
	@After
	public void afterTest() {
		System.out.println("@After annon executed");
	}
	
	@Test
	public void createFolderRuleTest() throws IOException {
		File folder = null;
		
		try {
			folder = this.folder.newFolder("MY_FOLDER");
			Assert.assertTrue(folder.exists());
		} catch (Exception e) {
			assertFalse(folder.exists());
		}
	}
	
	
	@AfterClass
	public static void afterClassTest() {
		System.out.println("@After Class executed");
	}

}
