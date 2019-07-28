
//Elephant class is a subclass of the AnimalClass

package com.rahat.lessonA;
import java.awt.Graphics;


public class EleClass extends AnimalClass
{
	//elephant class has its own attributes
	Boolean tusks;

	public EleClass(int w, String s, String f, String h, Boolean t)
	{
		super(w, s, f, h);
		tusks = t;
		
	}
	
	//displays the information on the screen
	public void draw(Graphics g)
	{
		g.drawString("The elephant eats " + getFood() + ".", 30, 400);
		g.drawString("The elephant lives in the " + getHabitat() + " and it weighs "
				+ getWeight() + " pounds.", 30, 430);
		g.drawString("The elephant sounds like this: " + getSound(), 30, 450);
		if(tusks == true)
			g.drawString("The elephant has tusks", 30, 480);
		else
			g.drawString("The elephant does not have tusks", 30, 480);
	}
}