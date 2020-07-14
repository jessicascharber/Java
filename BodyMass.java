import java.io.*;
import javax.swing.JOptionPane;

public class BodyMass
	 {

		 public static void main(String[] args) throws IOException
		{
			 // declare and construct variables
			 String height, weight;
			 int inches, pounds;
			 double kilograms, meters, index;


			 System.out.println("ENTER THE DIMENSIONS OF THE CIRCLE");
			 			height = JOptionPane.showInputDialog(null,"Enter your height to the nearest inch: ");
			 				inches = Integer.parseInt(height);
			 			weight = JOptionPane.showInputDialog(null, "Enter your weight to the nearest pound: ");
					  		pounds = Integer.parseInt(weight);
		 	// calculations
		 	meters = inches / 39.36;
		 	kilograms = pounds / 2.2;
		 	index = kilograms / Math.pow(meters,2);

	 		// output
	 		JOptionPane.showMessageDialog(null, "YOUR BODY MASS INDEX IS " + Math.round(index) +
	 		".", "Body Mass Calculator",JOptionPane.PLAIN_MESSAGE);
	 		System.exit(0);
	 	}
 }