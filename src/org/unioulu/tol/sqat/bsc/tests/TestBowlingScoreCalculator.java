package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	@Test
	public void test() {
		Frame f1 = new Frame(2,2);
		assertEquals(f1.score(),4);
		
		fail("Not yet implemented");
	}

}
