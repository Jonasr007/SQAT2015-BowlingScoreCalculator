package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		this.frames.add(frame);
		//to be implemented
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int result=0;
		boolean wasStrike=false;
		boolean wasSpare=false;
		
		for(Frame f: frames) {
			if(wasStrike)
				result+=10;
			else if(wasSpare)
				result+=10;

			
			if(f.isStrike())
				wasStrike=true;
			else	
				wasStrike=false;
			
			if(f.isSpare())
				wasSpare=true;
			else
				wasSpare=false;

			if(!f.isSpare())
				result+=f.score();

		}
		return result;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
