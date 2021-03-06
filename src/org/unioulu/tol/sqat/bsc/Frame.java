package org.unioulu.tol.sqat.bsc;

public class Frame {
	private int firstThrow;
	private int secondThrow;
	boolean islastFrame=false;
	
	public int getfirstThrow() {
		return firstThrow;
	}

	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		int result;
		result= firstThrow+secondThrow;
		// To avoid wrong inputs
		if(isStrike())
			secondThrow=0;
		
		return result;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow==10)
			return true;
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(firstThrow+secondThrow==10&&firstThrow!=10)
			return true;
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){		
		return islastFrame;
	}

	public void setIslastFrame(boolean islastFrame) {
		this.islastFrame = islastFrame;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}
}
