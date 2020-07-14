import java.awt.*;
import java.awt.EventQueue;
import java.awt.event.*;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.util.Scanner;
import java.io.*;



public class calcMenu4 extends Frame implements ActionListener
{
	public calcMenu4()
	{
		// create an instance of the menubar
		MenuBar mnuBar = new MenuBar();
		setMenuBar(mnuBar);

		// construct and populate the File menu
		Menu mnuFile = new Menu("File", true);
		mnuBar.add(mnuFile);
			MenuItem mnuFileExit = new MenuItem("Exit");
			mnuFile.add(mnuFileExit);

		// construct and populate the Shapes menu
		Menu mnuShapes = new Menu("Shapes", true);
		mnuBar.add(mnuShapes);
			MenuItem mnuShapesSquare = new MenuItem("Square");
			mnuShapes.add(mnuShapesSquare);

			MenuItem mnuShapesRectangle = new MenuItem("Rectangle");
			mnuShapes.add(mnuShapesRectangle);

			MenuItem mnuShapesTriangle = new MenuItem("Triangle");
			mnuShapes.add(mnuShapesTriangle);

			MenuItem mnuShapesCircle = new MenuItem("Circle");
			mnuShapes.add(mnuShapesCircle);

		// construct and populate the Calculate Average menu
		Menu mnuBodyMass = new Menu("Body Mass", true);
		mnuBar.add(mnuBodyMass);
			MenuItem mnuBodyMassCalcBM = new MenuItem("Calculate your body mass.");
			mnuBodyMass.add(mnuBodyMassCalcBM);

			// add the ActionListener to each menu item
			mnuFileExit.addActionListener(this);
			mnuShapesSquare.addActionListener(this);
			mnuShapesRectangle.addActionListener(this);
			mnuShapesTriangle.addActionListener(this);
			mnuShapesCircle.addActionListener(this);
			mnuBodyMass.addActionListener(this);

			// assign an ActionCommand to each menu item
			mnuFileExit.setActionCommand("Exit");
			mnuShapesSquare.setActionCommand("Square");
			mnuShapesRectangle.setActionCommand("Rectangle");
			mnuShapesTriangle.setActionCommand("Triangle");
			mnuShapesCircle.setActionCommand("Circle");
			mnuBodyMassCalcBM.setActionCommand("Calculate your body mass.");
	}


	public void actionPerformed(ActionEvent e)
	{
		// declare and construct variables
					 String height1, weight1, length1, width1, side, base1, radius1;
					 int inches, pounds,length, width, height, base;
			 		 double kilograms, meters, index, area, radius;

		// test for menu clicks
		String arg = e.getActionCommand();

		if (arg == "Exit")
			System.exit(0);

		if (arg == "Square")
		{
			System.out.println("ENTER THE DIMENSIONS OF THE SQUARE TO CALCULATE ITS AREA");
				side = JOptionPane.showInputDialog(null,"Enter the length of one side of the square: ");
					inches = Integer.parseInt(side);

			// calculations
			area = inches*inches;
			System.out.println("The area of the square is: "+area);

			// output
			JOptionPane.showMessageDialog(null, "THE AREA OF THE SQUARE IS: " + area +
			".", "SQUARE AREA CALCULATOR",JOptionPane.PLAIN_MESSAGE);

		}
		if (arg == "Rectangle")
		{
			System.out.println("ENTER THE DIMENSIONS OF THE RECTANGLE TO CALCULATE ITS AREA");
				length1 = JOptionPane.showInputDialog(null,"Enter the length of the rectangle. ");
					length = Integer.parseInt(length1);
				width1 = JOptionPane.showInputDialog(null,"Enter the width of the rectangle. ");
					width = Integer.parseInt(width1);

			// calculations
			area = length*width;
			System.out.println("The area of the rectangle is: "+area);

			// output
			JOptionPane.showMessageDialog(null, "THE AREA OF THE RECTANGLE IS: " + area +
			".", "RECTANGLE AREA CALCULATOR",JOptionPane.PLAIN_MESSAGE);

		}
		if (arg == "Triangle")
		{
			System.out.println("ENTER THE DIMENSIONS OF THE TRIANGLE TO CALCULATE ITS AREA");
							length1 = JOptionPane.showInputDialog(null,"Enter the length of the triangle: ");
								length = Integer.parseInt(length1);
							height1 = JOptionPane.showInputDialog(null,"Enter the height of the triangle: ");
								height = Integer.parseInt(height1);
							base1 = JOptionPane.showInputDialog(null,"Enter the base of the triangle: ");
								base = Integer.parseInt(base1);

						// calculations
						area = (base*height)/2;
						System.out.println("The area of the triangle is: "+area);

						// output
						JOptionPane.showMessageDialog(null, "THE AREA OF THE TRIANGLE IS: " + area +
						".", "TRIANGLE AREA CALCULATOR",JOptionPane.PLAIN_MESSAGE);

		}
		if (arg == "Circle")
		{
			System.out.println("ENTER THE RADIUS OF THE CIRCLE TO CALCULATE ITS AREA AND CIRCUMFERENCE");
					radius1 = JOptionPane.showInputDialog(null,"Enter the radius of the circle: ");
						radius = Integer.parseInt(radius1);

					// calculations
					area = Math.PI * (radius * radius);
					System.out.println("The area of the circle is: "+area);
					double circumference=Math.PI * 2*radius;
					System.out.println( "The circumference of the circle is: " +circumference);

					// output
					JOptionPane.showMessageDialog(null, "THE AREA OF THE CIRCLE IS: " + area +
					".", "CIRCLE MEASUREMENT CALCULATOR",JOptionPane.PLAIN_MESSAGE);
					JOptionPane.showMessageDialog(null, "THE CIRCUMFERENCE OF THE CIRCLE IS: " + circumference +
					".", "CIRCLE MEASUREMENT CALCULATOR",JOptionPane.PLAIN_MESSAGE);

		}
		if (arg == "Calculate your body mass.")
		{
			System.out.println("ENTER YOUR HEIGHT AND WEIGHT TO CALCULATE YOU BODY MASS INDEX");
			height1 = JOptionPane.showInputDialog(null,"Enter your height to the nearest inch: ");
				inches = Integer.parseInt(height1);
			weight1 = JOptionPane.showInputDialog(null, "Enter your weight to the nearest pound: ");
				pounds = Integer.parseInt(weight1);

			// calculations
			meters = inches / 39.36;
			kilograms = pounds / 2.2;
			index = kilograms / Math.pow(meters,2);

			// output
			System.out.println("Your body mass index is: "+index);
			JOptionPane.showMessageDialog(null, "YOUR BODY MASS INDEX IS " + Math.round(index) +
			".", "Body Mass Calculator",JOptionPane.PLAIN_MESSAGE);

 		}
	}



	public static void main(String args[])
	{
		//set frame properties
		calcMenu4 f = new calcMenu4();
		f.setTitle("SELECT A CALCULATION TO PERFORM");
		f.setBounds(200,200,300,300);
		f.setVisible(true);

		//set image properties and add to frame
		Image icon = Toolkit.getDefaultToolkit().getImage("calcImage.gif");
		f.setIconImage(icon);
	}



}

