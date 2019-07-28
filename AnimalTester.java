
//This is the user interface class for the virtual zoo

package com.rahat.lessonA;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;


public class AnimalTester extends Applet implements ActionListener{
	
	Button btnGir, btnEle, btnFrog, done;
	Label lblIntro, lblFood, lblWeight, lblHabitat, lblSound,
		lblNeck, lblPoison, lblCoatColor, lblJumpH, lblTusk;
	TextField txtWeight, txtFood, txtHabitat, txtSound,
		txtNeck, txtPoison, txtCoatColor, txtJumpH, txtTusk;
	
	int w, n, j;
	String f, h, s, t, p, c;
	
	int animalType;
	
	
	//there are three animal classes
	EleClass elephant;
	GirClass giraffe;
	FrogClass frog;
	
	public void init()
	{
		setLayout(null);
		
		lblIntro = new Label("WELCOME TO THE ZOO. SELECT AN ANIMAL!");
		lblIntro.setBounds(90, 10, 150, 20);
		add(lblIntro);
		
		done = new Button("Done");
		done.setBounds(400, 400, 80, 30);
		add(done);
		done.addActionListener(this);
		
		btnEle = new Button("Elephant");
		btnEle.setBounds(30, 275, 80, 30);
		add(btnEle);
		btnEle.addActionListener(this);
		
		btnGir = new Button("Giraffe");
		btnGir.setBounds(120, 275, 80, 30);
		add(btnGir);
		btnGir.addActionListener(this);
		
		btnFrog = new Button("Frog");
		btnFrog.setBounds(210, 275, 80, 30);
		add(btnFrog);
		btnFrog.addActionListener(this);
		
		lblWeight = new Label("Enter the weight:");
		lblWeight.setBounds(30,70,125,20);
		txtWeight = new TextField(10);
		txtWeight.setBounds(300, 70, 100, 20);
		add(lblWeight);
		add(txtWeight);
		
		lblSound = new Label("Enter the sound it makes:");
		lblSound.setBounds(30,100,180,20);
		txtSound = new TextField(10);
		txtSound.setBounds(300, 100, 100, 20);
		add(lblSound);
		add(txtSound);
		
		lblFood = new Label("Enter its food:");
		lblFood.setBounds(30,130,150,20);
		txtFood = new TextField(10);
		txtFood.setBounds(300, 130, 100, 20);
		add(lblFood);
		add(txtFood);
		
		lblHabitat = new Label("Enter its habitat:");
		lblHabitat.setBounds(30,160,150,20);
		txtHabitat = new TextField(10);
		txtHabitat.setBounds(300, 160, 100, 20);
		add(lblHabitat);
		add(txtHabitat);
		
		
		//this label describes the elephant attribute
		lblTusk = new Label("The elephant has tusks (true or false): ");
		lblTusk.setBounds(30, 330, 250, 20);
		txtTusk = new TextField(10);
		txtTusk.setBounds(300, 330, 100, 20);
		add(lblTusk);
		txtTusk.addActionListener(this);
		add(txtTusk);
		lblTusk.hide();
		txtTusk.hide();
		
		//this label describes the frog attribute
		lblJumpH = new Label("Enter how high it jumps: ");
		lblJumpH.setBounds(30, 330, 180, 20);
		txtJumpH = new TextField(10);
		txtJumpH.setBounds(300, 330, 125, 20);
		add(lblJumpH);
		add(txtJumpH);
		lblJumpH.hide();
		txtJumpH.hide();
		
		
		//this label describes the frog attribute
		lblPoison = new Label("It is poisonious (true or false): ");
		lblPoison.setBounds(30, 350, 250, 20);
		txtPoison = new TextField(10);
		txtPoison.setBounds(300, 350, 100, 20);
		add(lblPoison);
		add(txtPoison);
		lblPoison.hide();
		txtPoison.hide();
		
		
		//this label describes the giraffe attribute
		lblCoatColor = new Label("Enter the color of the coat: ");
		lblCoatColor.setBounds(30, 330, 180, 20);
		txtCoatColor = new TextField(10);
		txtCoatColor.setBounds(300, 330, 100, 20);
		add(lblCoatColor);
		add(txtCoatColor);
		lblCoatColor.hide();
		txtCoatColor.hide();
		
		//this label describes the giraffe attribute
		lblNeck = new Label("Enter the neck length: ");
		lblNeck.setBounds(30, 350, 150, 20);
		txtNeck = new TextField(10);
		txtNeck.setBounds(300, 350, 100, 20);
		add(lblNeck);
		add(txtNeck);
		lblNeck.hide();
		txtNeck.hide();
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnEle)
		{
			lblTusk.show();
			txtTusk.show();
			lblPoison.hide();
			txtPoison.hide();
			lblNeck.hide();
			txtNeck.hide();
			lblCoatColor.hide();
			txtCoatColor.hide();
			lblJumpH.hide();
			txtJumpH.hide();
			
			animalType = 0;
			
			
		}
		
		if(e.getSource() == btnGir)
		{
			lblCoatColor.show();
			txtCoatColor.show();
			lblNeck.show();
			txtNeck.show();
			lblTusk.hide();
			txtTusk.hide();
			lblPoison.hide();
			txtPoison.hide();
			lblJumpH.hide();
			txtJumpH.hide();
			
			animalType = 1;
			
			
		}
		
		if(e.getSource() == btnFrog)
		{
			lblJumpH.show();
			txtJumpH.show();
			lblPoison.show();
			txtPoison.show();
			lblTusk.hide();
			txtTusk.hide();
			lblNeck.hide();
			txtNeck.hide();
			lblCoatColor.hide();
			txtCoatColor.hide();
			
			animalType = 2;
			
			
		}
		
		
		//when the button done is selected, the information collected
		//is sent to its corresponding class
		if(e.getSource() == done)
		{
			if(animalType == 0)
				elephant = new EleClass(Integer.parseInt(txtWeight.getText()), 
						txtSound.getText(),txtFood.getText(), txtHabitat.getText(), 
						Boolean.parseBoolean(txtTusk.getText()));
				
			if(animalType == 1)
				giraffe = new GirClass(Integer.parseInt(txtWeight.getText()), 
						txtSound.getText(),txtFood.getText(), txtHabitat.getText(), 
						txtCoatColor.getText(), 
						Integer.parseInt(txtNeck.getText()));
				
			if(animalType == 2)
				frog = new FrogClass(Integer.parseInt(txtWeight.getText()), 
						txtSound.getText(),txtFood.getText(), txtHabitat.getText(),
						Integer.parseInt(txtJumpH.getText()), Boolean.parseBoolean(txtPoison.getText()));
		
		}
		
		repaint();
		
	}

	
	//based on the animalType, the output from a specific class will be shown
	public void paint(Graphics g)
	{
		switch (animalType)
		{
		case 0:
			elephant.draw(g);
			break;
			
		case 1:
			giraffe.draw(g);
			break;
			
		case 2:
			frog.draw(g);
			break;
		}
	}
}