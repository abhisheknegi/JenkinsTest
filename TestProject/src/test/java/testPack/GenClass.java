package testPack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import srcPackagae.CodeClass;

public class GenClass {
	
	CodeClass cc = new CodeClass();
	
	@BeforeAll
	static void beforeAll() { 
		System.out.println("Before All Tests ====> ");		
	}
	
	@Test
	void test1() {
		Assertions.assertEquals(5, cc.method1());
	}

}
