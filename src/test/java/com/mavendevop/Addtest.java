package com.mavendevop;

import static org.junit.Assert.*;

import org.junit.Test;
import com.mavendevop.*;

public class Addtest {

	@Test
	public void test() {
		Add a=new Add();
		
		assertEquals(6,a.addf(2,4));
		assertEquals(8,a.addf(4,4));
		

	}
}
