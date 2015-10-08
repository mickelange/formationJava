package com.m2i.formation.geometry;

public class Point {
	public int x;
	public int y;
	
	public void deplacer( int newX, int newY)
	{
	x= newX;
	y = newY;
	}
	
	public void afficher()
	{
	System.out.println("("+x+";"+y+")");
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}

}
