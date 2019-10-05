package com.mavendevop;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addtest {

	@Test
	public void test() {
		Add a=new Add();
		
		assertEquals(6,a.Addf(2,4));
		assertEquals(8,a.Addf(4,4));
		

	}
}
