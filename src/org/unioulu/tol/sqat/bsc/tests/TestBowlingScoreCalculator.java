package org.unioulu.tol.sqat.bsc.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat.bsc.BowlingGame;
import org.unioulu.tol.sqat.bsc.Frame;

public class TestBowlingScoreCalculator {
	@Test
	public void test() {
		Frame f1 = new Frame(1,5); //4
		// 1. & 2.		
		assertEquals(f1.score(),6);
		
		//3. & 4.
		Frame f2 = new Frame(3,6); // 8
		Frame f3 = new Frame(7,2); // 13
		Frame f4 = new Frame(3,6); // 21
		Frame f5 = new Frame(4,4); // 28
		Frame f6 = new Frame(5,3); // 36
		Frame f7 = new Frame(3,3); // 44
		Frame f8 = new Frame(4,5); // 53
		Frame f9 = new Frame(8,1); // 62
		Frame f10 = new Frame(2,6); // 71
		
		BowlingGame bG1 = new BowlingGame();
		bG1.addFrame(f1);
		bG1.addFrame(f2);
		bG1.addFrame(f3);
		bG1.addFrame(f4);
		bG1.addFrame(f5);
		bG1.addFrame(f6);
		bG1.addFrame(f7);
		bG1.addFrame(f8);
		bG1.addFrame(f9);
		bG1.addFrame(f10);
	//	assertEquals(bG1.score(),81);
		
		//5.
		f1 = new Frame(10,0);
		bG1 = new BowlingGame();
		bG1.addFrame(f1);
		bG1.addFrame(f2);
		bG1.addFrame(f3);
		bG1.addFrame(f4);
		bG1.addFrame(f5);
		bG1.addFrame(f6);
		bG1.addFrame(f7);
		bG1.addFrame(f8);
		bG1.addFrame(f9);
		bG1.addFrame(f10);
	// 	assertEquals(bG1.score(),94);
		
		//6.
		f1 = new Frame(1,9); 
		bG1 = new BowlingGame();
		bG1.addFrame(f1);
		bG1.addFrame(f2);
		bG1.addFrame(f3);
		bG1.addFrame(f4);
		bG1.addFrame(f5);
		bG1.addFrame(f6);
		bG1.addFrame(f7);
		bG1.addFrame(f8);
		bG1.addFrame(f9);
		bG1.addFrame(f10);
		assertEquals(bG1.score(),88);

		//7		
		f2 = new Frame(10,0); // strike count 20
		f3 = new Frame(4,6); //--> next one f4(2,6) just the first count so count 12
		bG1 = new BowlingGame();
		bG1.addFrame(f1);
		bG1.addFrame(f2);
		bG1.addFrame(f3);
		bG1.addFrame(f4);
		bG1.addFrame(f5);
		bG1.addFrame(f6);
		bG1.addFrame(f7);
		bG1.addFrame(f8);
		bG1.addFrame(f9);
		bG1.addFrame(f10);
	//	assertEquals(bG1.score(),103);
		
		//8		
		f2 = new Frame(10,0); // strike count 27
		f3 = new Frame(10,0); // strike count 19
		bG1 = new BowlingGame();
		bG1.addFrame(f1);
		bG1.addFrame(f2);
		bG1.addFrame(f3);
		bG1.addFrame(f4);
		bG1.addFrame(f5);
		bG1.addFrame(f6);
		bG1.addFrame(f7);
		bG1.addFrame(f8);
		bG1.addFrame(f9);
		bG1.addFrame(f10);
	//	assertEquals(bG1.score(),112);
		
		// Lastframe
//		assertEquals(f9.isLastFrame(),false);
//		assertEquals(f10.isLastFrame(),true);
		
	}

}
