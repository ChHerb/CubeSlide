package de.kftit.utils;

import de.kgftit.cubeslide.R;



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
				id = R.color.Spielstein1;
			}
		}else if(zufall <= 2){
			if(hidden){
				id = R.color.Spielstein2H;
			}
			else{
				id = R.color.Spielstein2;
			}
		}else if(zufall <= 3){
			if(hidden){
				id = R.color.Spielstein3H;
			}
			else{
				id = R.color.Spielstein3;
			}
		}else if(zufall <= 4){
			if(hidden){
				id = R.color.Spielstein4H;
			}
			else{
				id = R.color.Spielstein4;
			}
		}else{ // if(zufall <= 5){
			if(hidden){
				id = R.color.Spielstein5H;
			}
			else{
				id = R.color.Spielstein5;
			}
		}
		return id;
	}
}
