/**
 * This program will allow the user to enter a number and then
 * will print out the original and the reversed number.
 *
 * @author Jessica Scharber
 * @version 10/05/2018
 */

import java.util.Scanner;
class reverseNumbers
{
   public static void main(String args[])
   {
      int numberEntered=0;
      int reversenum =0;
      System.out.println("Enter a number to see it reversed.");
      //This statement will capture the user input
      Scanner in = new Scanner(System.in);
      //Captured input would be stored in number num
      numberEntered = in.nextInt();
      //While Loop: Logic to find out the reverse number
      while( numberEntered != 0 )
      {
          reversenum = reversenum * 10;
          reversenum = reversenum + numberEntered%10;
          numberEntered = numberEntered/10;
      }

      System.out.println("The number you entered, reversed, is "+reversenum);
   }
}
