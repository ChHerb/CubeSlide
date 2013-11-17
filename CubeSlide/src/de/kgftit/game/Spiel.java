package de.kgftit.game;

import android.widget.FrameLayout;
import android.widget.ImageView;

public class Spiel {
	private int lines;
	private int rows;
	private int littleBonus;
	private int factor;
	
	private int punkte;
	private int speed;
	private int level;
	
	private FrameLayout spielfeld;
	
	public Spiel(FrameLayout spielfeld){
		lines = 15;
		rows = 7;
		speed = 1;
		littleBonus = 10;
		factor = 1;
		this.spielfeld = spielfeld;
		
	}
	
	public void getLine(){
		
	}
	
	
	public int getLittleBonus() {
		return littleBonus;
	}
	public void setLittleBonus(int littleBonus) {
		this.littleBonus = littleBonus;
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
	public void setLines(int lines) {
		this.lines = lines;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
}
