package testPack;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import srcPackagae.CodeClass;

public class CodeClassTest {

	CodeClass cc = new CodeClass();

	@BeforeAll
	static void beforeAll() {
		System.out.println("beforeAll CodeClassTest ====> ");
	}

	@Test
	void test() {
		Assertions.assertEquals(5, cc.method1());
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("afterAll CodeClassTest ====> ");
	}

}
