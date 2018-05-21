package com.gc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gc.Primes;

class PrimesTest {

	@Test
	void test() {
		Primes obj = new Primes();
		int expected = 2;
		int actual = obj.locatePrimesAt(1);
		assertEquals(expected, actual);

	}

	@Test
	void test1() {
		Primes obj = new Primes();
		int expected = 3;
		int actual = obj.locatePrimesAt(2);
		assertEquals(expected, actual);

	}

	@Test
	void test2() {
		Primes obj = new Primes();
		int expected = 5;
		int actual = obj.locatePrimesAt(3);
		assertEquals(expected, actual);
	}

	@Test
	void test4() {
		Primes obj = new Primes();
		int expected = 7;
		int actual = obj.locatePrimesAt(4);
		assertEquals(expected, actual);
	}

	@Test
	void test5() {
		Primes obj = new Primes();
		int expected = 11;
		int actual = obj.locatePrimesAt(5);
		assertEquals(expected, actual);
	}

	@Test
	void test6() {
		Primes obj = new Primes();
		int expected = 13;
		int actual = obj.locatePrimesAt(6);
		assertEquals(expected, actual);
	}

	@Test
	void test7() {
		Primes obj = new Primes();
		int expected = 17;
		int actual = obj.locatePrimesAt(7);
		assertEquals(expected, actual);
	}
}