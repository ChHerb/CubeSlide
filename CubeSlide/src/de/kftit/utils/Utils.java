package de.kftit.utils;

import de.kgftit.cubeslide.R;



public class Utils {
	public static double getRandomNumber(){
		return Math.random();
	}
	public static int[] getRandomColor(){
		int[] ids = new int[3];
		double zufall;
		zufall = getRandomNumber() * 5;
		if(zufall <= 1){
			ids[0] = R.color.Spielstein1H;
			ids[1] = R.color.Spielstein1;
			ids[2] = R.color.Spielstein1B;
		}else if(zufall <= 2){
			ids[0] = R.color.Spielstein2H;
			ids[1] = R.color.Spielstein2;
			ids[2] = R.color.Spielstein2B;
		}else if(zufall <= 3){
			ids[0] = R.color.Spielstein3H;
			ids[1] = R.color.Spielstein3;
			ids[2] = R.color.Spielstein3B;
		}else if(zufall <= 4){
			ids[0] = R.color.Spielstein4H;
			ids[1] = R.color.Spielstein4;
			ids[2] = R.color.Spielstein4B;
		}else{ // if(zufall <= 5){
			ids[0] = R.color.Spielstein5H;
			ids[1] = R.color.Spielstein5;
			ids[2] = R.color.Spielstein5B;
		}
		return ids;
	}
}
