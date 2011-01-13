package com.github.acm;

import junit.framework.Assert;

import org.junit.Test;


public class CollatzTest {
	
	@Test // 1 10 => 20
	public void should_return_20_as_max_cycle_for_range_from_1_to_10() {
		Collatz collatz = new Collatz();
		Assert.assertEquals(20, collatz.solve(1, 10));
	}
	
	@Test // 100 200 => 125
	public void should_return_125_as_the_max_cycle_for_range_from_100_to_200() {
		Collatz collatz = new Collatz();
		Assert.assertEquals(125, collatz.solve(100, 200));
	}
	
	@Test // 900 1000 => 174
	public void should_return_174_as_max_cycle_length_for_range_from_900_to_1000() {
		Collatz collatz = new Collatz();
		Assert.assertEquals(174, collatz.solve(900, 1000));
	}
	
	@Test // for a big number
	public void should_return_616_as_max_cycle_length_for_range_1_to_10_000_000() {
		Collatz collatz = new Collatz();
		Assert.assertEquals(616, collatz.solve(1, 10000000));
	}
	
	@Test
	public void the_cycle_length_for_22_is_16() {
		Collatz collatz = new Collatz();
		Assert.assertEquals(16, collatz.cycleLengthFor(22));
	}
	
	@Test
	public void the_cycle_length_for_20_is_8() {
		Collatz collatz = new Collatz();
		Assert.assertEquals(8, collatz.cycleLengthFor(20));
	}
	
	@Test
	public void the_cycle_length_for_4_is_3() {
		Collatz collatz = new Collatz();
		Assert.assertEquals(3, collatz.cycleLengthFor(4));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void should_throws_exception_when_trying_to_find_cycle_length_for_numbers_lt_zero() {
		new Collatz().cycleLengthFor(-10);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void should_throws_exception_when_trying_to_find_cycle_length_for_zero() {
		new Collatz().cycleLengthFor(0);
	}
	
	@Test
	public void should_returns_3n_plus_1_for_odd_numbers() {
		Collatz collatz = new Collatz();
		Assert.assertEquals(34, collatz.calculateFor(11));
	}
	
	@Test
	public void should_returns_n_divided_by_2_for_even_numbers() {
		Collatz collatz = new Collatz();
		Assert.assertEquals(11, collatz.calculateFor(22));
	}
}
