package com.example.randomize;

import java.util.Random;

/**
 * Class that simulates pseudo-random coin tosses.
 * @author Omkar Moghe
 *
 */
public class Coin {
	private Random g;
	
	public Coin(){
		g = new Random();
	}
	
	public String getFlip(){
		int toss = g.nextInt(2);
		String flip = null;
		if(toss == 0){
			flip = "Heads";
		}else{
			flip = "Tails";
		}
		
		return flip;
	}
}
