package de.kgftit.game;

import de.kftit.utils.Utils;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Cube extends ImageView{

	public Cube(FrameLayout spielfeld, int size) {
		super(spielfeld.getContext());
		
	}
	
	public void setColor(){
		double zufall;
		zufall = Utils.getRandomNumber();
		
	}
}
