package de.kgftit.game;

import de.kftit.utils.Utils;
import de.kgftit.cubeslide.R;

import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class Cube extends ImageView{
	private boolean ohneFarbe;
	private boolean hidden;
	private int[] colorID;
	private int actColor;
	private int blinkCount;
	private Point position;
	private final int fallingSpeed = 4;
	
	public Cube(FrameLayout spielfeld, int size, boolean ohneFarbe, boolean hidden, Point pos) {
		super(spielfeld.getContext());
		this.setOhneFarbe(ohneFarbe);
		this.setHidden(hidden);
		this.setPosition(pos);
		this.layout(pos.x, pos.y, pos.x + size, pos.y + size);
		if (ohneFarbe){
			this.setBackgroundColor(getResources().getColor(R.color.SpielsteinUnbekannt));
		}else if (hidden){
			colorID = Utils.getRandomColor();
			actColor = 0;
			this.setBackgroundColor(getResources().getColor(colorID[0]));
		}else{
			actColor = 1;
			colorID = Utils.getRandomColor();
			this.setBackgroundColor(getResources().getColor(colorID[1]));
		}
		
	}
	
	public void changeColor(){
		if (ohneFarbe){
			this.colorID = Utils.getRandomColor();
			actColor = 1;
			setOhneFarbe(false);
			this.setBackgroundColor(this.colorID[1]);
		}
		else
		{
			if(actColor == 1){
				if(blinkCount > 10){
					this.setVisibility(View.GONE);
				}else{
					actColor = 2;
					this.setBackgroundColor(this.colorID[actColor]);
					blinkCount++;
				}
			}
			else if(actColor == 2){
				actColor = 1;
				this.setBackgroundColor(this.colorID[actColor]);
			}
		}
	}

	public boolean isOhneFarbe() {
		return ohneFarbe;
	}

	public void setOhneFarbe(boolean ohneFarbe) {
		this.ohneFarbe = ohneFarbe;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public int getFallingSpeed() {
		return fallingSpeed;
	}
}
