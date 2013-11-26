package de.kgftit.game;


import android.graphics.Point;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public class Spiel {
	private final int lines = 15;
	private final int rows = 7;
	private final int littleBonus = 10;
	private final int startLines = 5;
	private int factor;
	
	private int punkte;
	private int speed;
	private int level;
	private int cubeSize;
	
	private FrameLayout spielfeld;
	
	public Spiel(FrameLayout spielfeld, Point p){
		speed = 1;
		factor = 1;
		// Margin = 40
		int sizeX = (p.x) / rows;
		int sizeY = (p.y) / lines;
		cubeSize = Math.min(sizeX, sizeY);
		
		this.spielfeld = spielfeld;
		LayoutParams lp = spielfeld.getLayoutParams();
		lp.width = cubeSize * rows;
		lp.height = cubeSize * lines;
		this.spielfeld.setLayoutParams(lp);
		for (int index1 = 0; index1 < startLines;index1++){
			Point pos = new Point();
			pos.x = 0;
			pos.y = (lines - (startLines - index1)) * cubeSize;
			getLine(false, pos);
		}
		
	}
	
	public void getLine(boolean isHidden, Point pos){
		for(int index1 = 0; index1 < rows; index1++ ){
			spielfeld.addView(new Cube(spielfeld,cubeSize,false,isHidden,pos));
			
		}
	}
	
	
	public int getLittleBonus() {
		return littleBonus;
	}
	public int getFactor() {
		return factor;
	}
	public void setFactor(int factor) {
		this.factor = factor;
	}
	public int getPunkte() {
		return punkte;
	}
	public void setPunkte(int punkte) {
		this.punkte = punkte;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getLines() {
		return lines;
	}
	public int getRows() {
		return rows;
	}
	public int getCubeSize() {
		return cubeSize;
	}

	public void setCubeSize(int cubeSize) {
		this.cubeSize = cubeSize;
	}

	public int getStartLines() {
		return startLines;
	}
}
