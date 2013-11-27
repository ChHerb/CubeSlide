package de.kgftit.game;


import android.graphics.Point;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;

public class Spiel {
	private final int lines = 12;
	private final int rows = 7;
	private final int littleBonus = 10;
	private final int startLines = 5;
	private int factor;
	private boolean gameOver;
	
	private int punkte;
	private int speed;
	private int level;
	private int cubeSize;
	private Cube[][] cubes;
	private Point startPunkt;
	
	private FrameLayout spielfeld;
	
	public Spiel(FrameLayout spielfeld, Point p){
		speed = 1;
		factor = 1;
		setGameOver(false);
		int sizeX = (p.x) / rows;
		int sizeY = (p.y) / lines;
		cubeSize = Math.min(sizeX, sizeY);
		cubes = new Cube[rows][lines];
		this.spielfeld = spielfeld;
		LayoutParams lp = spielfeld.getLayoutParams();
		lp.width = cubeSize * rows;
		lp.height = cubeSize * lines;
		this.spielfeld.setLayoutParams(lp);
		for (int index1 = 0; index1 < startLines;index1++){
			Point pos = new Point();
			pos.x = 0;
			pos.y = (lines - (startLines - index1)) * cubeSize;
			moveLineUp();
			getLine(false, pos);
		}
		startPunkt = new Point();
		startPunkt.x = 0;
		startPunkt.y = cubeSize * lines;
		getLine(true, startPunkt);
	}
	
	public void getLine(boolean isHidden, Point pos){
		for(int index1 = 0; index1 < rows; index1++ ){
			pos.x = index1 * cubeSize;
			Cube c = new Cube(spielfeld,cubeSize,false,isHidden,pos);
			spielfeld.addView(c, c.getLayout());
			cubes[index1][0] = c;
		}
	}
	public void moveLineUp(){
		for(int index1 = 0; index1 < rows;index1++){
			for(int index2 = 0; index2 < lines; index2++){
				if(index2 < lines-1){
					cubes[index1][index2+1] = cubes[index1][index2];
				}
				else{
					if (null != cubes[index1][index2]){
						setGameOver(true);
					}
				}
			}
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

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
}
