package com.mavendevop;

import static org.junit.Assert.*;

import org.junit.Test;

public class Addtest {

	@Test
	public void test() {
		Add a=new Add();
		//int res=a.Addf(2,4);
		assertEquals(6,a.Addf(2,4));
		//int res1=a.Addf(1, 1);
		//assertEquals(2,res1);

	}
}
