package de.kftit.utils;

import android.R;

public class Utils {
	public static double getRandomNumber(){
		return Math.random();
	}
	public static int getRandomColor(boolean hidden){
		int id;
		double zufall;
		zufall = getRandomNumber() * 5;
		if(zufall <= 1){
			if(hidden){
				id = R.color.Spielstein1H;
			}
			else{
				
			}
		}else if(zufall <= 2){
			if(hidden){
				
			}
			else{
				
			}
		}else if(zufall <= 3){
			if(hidden){
				
			}
			else{
				
			}
		}else if(zufall <= 4){
			if(hidden){
				
			}
			else{
				
			}
		}else{ // if(zufall <= 5){
			if(hidden){
				
			}
			else{
				
			}
		}
		return id;
	}
}
