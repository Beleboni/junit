package br.com.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	SuiteCaseTest1.class,
	SuiteCasetest2.class
})
public class RunSuiteTest2 {

}
