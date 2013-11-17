package de.kgftit.game;

import de.kftit.utils.Utils;
import de.kgftit.cubeslide.R;

import android.widget.FrameLayout;
import android.widget.ImageView;

public class Cube extends ImageView{
	private boolean ohneFarbe;
	
	public Cube(FrameLayout spielfeld, int size, boolean ohneFarbe) {
		super(spielfeld.getContext());
		this.setOhneFarbe(ohneFarbe);
		if (ohneFarbe){
			this.setBackgroundColor(getResources().getColor(R.color.SpielsteinUnbekannt));
		}else{
			this.setBackgroundColor(getResources().getColor(Utils.getRandomColor(true)));
		}
		
	}
	
	public void changeColor(){
		if (ohneFarbe){
			this.setBackgroundColor(Utils.getRandomColor(false));
		}
		else
		{
			
		}
	}

	public boolean isOhneFarbe() {
		return ohneFarbe;
	}

	public void setOhneFarbe(boolean ohneFarbe) {
		this.ohneFarbe = ohneFarbe;
	}
}
