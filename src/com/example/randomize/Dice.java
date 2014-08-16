package com.example.randomize;

import java.util.Random;

/**
 * Class that generates pseudo-random dice rolls.
 * @author Omkar Moghe
 *
 */
public class Dice {
	private Random g;
	
	public Dice(){
		g = new Random();
	}
	
	public int getRoll(){
		int roll = g.nextInt(6) + 1;
		return roll;
	}

}
