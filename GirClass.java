
//Giraffe class is a subclass of the AnimalClass

package com.rahat.lessonA;
import java.awt.Graphics;


public class GirClass extends AnimalClass
{
	//giraffe class has its own attributes
	int neckLen;
	String color;

	public GirClass(int w, String s, String f, String h, String c, int n)
	{
		super(w, s, f, h);
		color = c;
		neckLen = n;
		
	}
	
	//displays the information on the screen
	public void draw(Graphics g)
	{
		g.drawString("The giraffe eats " + getFood() + ".", 30, 400);
		g.drawString("The giraffe lives in the " + getHabitat() + " and it weighs "
				+ getWeight() + " pounds.", 30, 430);
		g.drawString("The giraffe sounds like this: " + getSound(), 30, 450);
		g.drawString("The giraffe's neck length is " + neckLen + " feet", 30, 480);
		g.drawString("The giraffe's coat color is " + color, 30, 500);
	}
}