package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	@Test
	public void test() {
		Frame f1 = new Frame(2,2);
		// 1. & 2.		
		assertEquals(f1.score(),4);
		
		//3.
		Frame f2 = new Frame(2,2);
		Frame f3 = new Frame(1,4);
		Frame f4 = new Frame(2,6);
		Frame f5 = new Frame(5,2);
		Frame f6 = new Frame(3,5);
		Frame f7 = new Frame(4,4);
		Frame f8 = new Frame(3,6);
		Frame f9 = new Frame(1,8);
		Frame f10 = new Frame(2,7);
		
		BowlingGame bG1 = new BowlingGame();
		bG1.addFrame(f2);
		bG1.addFrame(f3);
		bG1.addFrame(f4);
		bG1.addFrame(f5);
		bG1.addFrame(f6);
		bG1.addFrame(f7);
		bG1.addFrame(f8);
		bG1.addFrame(f9);
		bG1.addFrame(f10);
		assertEquals(bG1.score(),4);

		
		
	//	fail("Not yet implemented");
	}

}
