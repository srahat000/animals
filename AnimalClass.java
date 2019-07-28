
//AnimalClass is created and packaged

package com.rahat.lessonA;
import java.awt.Graphics;

public abstract class AnimalClass {

	private int weight;
	private String sound, food, habitat;
	
	//class constructor
	public AnimalClass()
	{
		weight = 0;
		food = habitat = sound = "";
	}
	
	public AnimalClass(int w, String s, String f, String h)
	{
		weight = w;
		sound = s;
		food = f;
		habitat = h;
	}
	
	//sets weight
	public void setWeight(int w) 
	{
		weight = w;
	}
	
	//sets sound
	public void setSound(String s) 
	{
		sound = s;
	}
	
	//sets food
	public void setFood(String f) 
	{
		food = f;
	}
	
	//sets Habitat
	public void setHabitat(String h) 
	{
		habitat = h;
	}
	
	
	//gets weight
	public int getWeight()
	{
		return weight;
	}
	
	//gets sound
	public String getSound()
	{
		return sound;
	}
	
	//gets food
	public String getFood()
	{
		return food;
	}
	
	//gets habitat
	public String getHabitat()
	{
		return habitat;
	}
	


	public abstract void draw(Graphics g);
}
