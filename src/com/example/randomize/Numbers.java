package com.example.randomize;

import java.util.Random;

/**
 * Class that generates a pseudo-random integer between a left and right bound.
 * @author Omkar Moghe
 *
 */
public class Numbers {
	private Random g;
	
	public Numbers(){
		g = new Random();
	}
	
	public int getInt(){
		int number = 0;
		number = g.nextInt();
		return number;
	}
	
	public int getInt(int l, int r){
		int number = 0;
		if(l < 0 && r >= 0){
			int number2 = 0;
			l = -l;
			number = g.nextInt(r + 1);
			number2 = g.nextInt(l + 1);
			if(g.nextInt(2) == 0){
				return number;
			}else{
				return -number2;
			}
		}else if(l < 0 && r < 0){
			l = -l;
			r = -r;
			number = g.nextInt(l - r + 1) + r;
			return -number;
		}else{
			number = g.nextInt(r - l + 1) + l;
			return number;
		}
	}
}
