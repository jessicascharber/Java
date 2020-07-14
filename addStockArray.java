import javax.swing.JOptionPane;

public class addStockArray
{
	public static void main(String[] args)
	{

	    String[] stockNameArray = new String[10];

		for (int i=0; i<10; i++)
		{
			stockNameArray[i] = JOptionPane.showInputDialog("Please enter the name of a stock you wish to track.");
		}

		String stockList = "Your Selected Stocks Are: ";
		for(int i = 0; i<10; i++)
		{
			stockList += stockNameArray[i];

			if(i<10)
			{
				stockList += ", ";
			}
	    }

		JOptionPane.showMessageDialog(null, stockList);
	}
}