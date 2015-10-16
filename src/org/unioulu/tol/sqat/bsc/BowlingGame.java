package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	int counter=0;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		counter++;
		if(counter==10) {
			frame.setIslastFrame(true);
		}
		this.frames.add(frame);
	}

	public void setBonus(int firstThrow, int secondThrow) {
		bonus= new Frame(firstThrow, secondThrow);
	}
	
	public int score(){
		int result=0;
		boolean wasStrike=false;
		boolean wasSpare=false;
		
		for(Frame f: frames) {
			if(wasStrike)
				result+=10+f.score();
			if(wasSpare)
				result+=f.getfirstThrow();			
			
			if(f.isSpare()&&wasStrike)
				result+=5;
			
			if(f.isStrike())
				wasStrike=true;
			else	
				wasStrike=false;
			
			if(f.isSpare())
				wasSpare=true;
			else
				wasSpare=false;			
			
			if(!f.isStrike())
				result+=f.score();
		//	System.out.println(result);

		}
		return result;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
