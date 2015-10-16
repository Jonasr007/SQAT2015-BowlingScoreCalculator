package org.unioulu.tol.sqat.bsc;

import java.util.ArrayList;
import java.util.List;

//finnished at 14:41

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
		boolean multiStrikeFlag=false;
		
		for(Frame f: frames) {
			if(multiStrikeFlag) {
				result+=f.getfirstThrow();
				multiStrikeFlag=false;
			}
			
			if(wasStrike) {
				result+=10+f.score();
				if(f.isStrike()) 
					multiStrikeFlag=true;				
			}
			
			if(wasSpare)
				result+=f.getfirstThrow();			
					
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

		}
		return result;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
