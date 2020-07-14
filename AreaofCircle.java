import java.util.Scanner;
class CircleDemo
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[])
	{
		System.out.print("Enter the radius: ");
		/* Store radius in double so user can enter radius in decimals*/
		
		double radius = sc.nextDouble();
		// Area = PI*radius*radius
		double area = Math.PI * (radius * radius);
		System.out.println("The area of the circle is: " + area);
		// Circumference = 2*PI*radius
		double circumference=Math.PI * 2*radius;
		System.out.println( "The circumference of the circle is: " +circumference);
	}
}