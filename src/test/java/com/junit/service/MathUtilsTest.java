package com.junit.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	MathUtils mathUtils;

	@BeforeAll
	static void beforeallinit() {
		System.out.println("This needs to run before all");
	}

	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}

	@AfterEach
	void cleanUp() {
		System.out.println("Cleane up....");
	}

	@Test
	void test() {
		int expected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(expected, actual, "this method should add two numbers");// asserts that expected and actual value
																				// are equal
		// assertArrayEquals(exceptedArray, actualArray)
		// assertIterableEquals()
	}

	@Test
	void testComputerCricleRadious() {
		assertEquals(314.1592653589793, mathUtils.computerCricleArea(10));
	}

}
