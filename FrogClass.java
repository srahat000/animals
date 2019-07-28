
//Frog class is a subclass of the AnimalClass

package com.rahat.lessonA;
import java.awt.Graphics;


public class FrogClass extends AnimalClass
{
	//frog has its own attributes inside its class
	Boolean poison;
	int jump;

	public FrogClass(int w, String s, String f, String h, int j, Boolean p)
	{
		super(w, s, f, h);
		poison = p;
		jump = j;
	
		
	}
	
	//displays the information on the screen
	public void draw(Graphics g)
	{
		g.drawString("The frog eats " + getFood() + ".", 30, 400);
		g.drawString("The frog lives in  the " + getHabitat() + " and it weighs "
				+ getWeight() + " pounds.", 30, 430);
		g.drawString("The frog sounds like this: " + getSound(), 30, 450);
		if(poison)
			g.drawString("The frog is poisonous", 30, 480);
		else 
			g.drawString("The frog is not poisonous", 30, 480);
		g.drawString("The frog can jump as high as "+ jump + " feet.", 30, 500);
	}
}