package com.mavendevop;

import static org.junit.Assert.*;

import org.junit.Test;
import com.mavendevop.*;

public class Addtest {

	@Test
	public void test() {
		Add a=new Add();
		int rs=a.addf(2,4);
		int rs1=a.addf(4,4);
		assertEquals(6,rs);
		assertEquals(8,rs1);
		

	}
}
