/**
 * This code will facilitate a connection to a database for the Stock Tracker program.
 *
 * @author Jessica Scharber
 * @version 10/28/18
 */

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class getConnection
{
  public static void main(String[] args) throws Exception{
      getConnection();
    }
    public static Connection getConnection() throws Exception{

     try{

        String driver = "com.mysql.cj.jdbc.Driver";

        String url = "jdbc:mysql://24.196.52.166:3306/testdb";

        String username = "username";

        String password = "password";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url,username,password);

        System.out.println("Connected");

        return conn;

    } catch(Exception e){System.out.println(e);}

    return null;

  }
}

/**
 * Stock Tracker Program
 *
 * @author Jessica Scharber
 * @version (10/21/18)
 */


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
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;


public class stockTracker1J extends Frame implements ActionListener
{
    public static Connection getConnection() throws Exception{

     try{

        String driver = "com.mysql.jdbc.Driver";

        String url = "jdbc:mysql://24.196.52.166:3306/testdb";

        String username = "username";

        String password = "password";

        Class.forName(driver);

        Connection conn = DriverManager.getConnection(url,username,password);

        System.out.println("Connected");

        return conn;

    } catch(Exception e){System.out.println(e);}

    return null;

}
    public stockTracker1J()
    {
        // create an instance of the menubar
        MenuBar mnuBar = new MenuBar();
        setMenuBar(mnuBar);

        // construct and populate the File menu
        Menu mnuFile = new Menu("File", true);
        mnuBar.add(mnuFile);
            MenuItem mnuFileExit = new MenuItem("Exit");
            mnuFile.add(mnuFileExit);

        // construct and populate the User menu
        Menu mnuUser = new Menu("User", true);
        mnuBar.add(mnuUser);
            MenuItem mnuUserLogin = new MenuItem("Login");
            mnuUser.add(mnuUserLogin);

            MenuItem mnuUserInformation = new MenuItem("User Info");
            mnuUser.add(mnuUserInformation);

            MenuItem mnuUserAdds = new MenuItem("Add User");
            mnuUser.add(mnuUserAdds);

            MenuItem mnuUserDeletes = new MenuItem("Delete User");
            mnuUser.add(mnuUserDeletes);

        // construct and populate the Stocks menu
        Menu mnuStock = new Menu("Stocks", true);
        mnuBar.add(mnuStock);
            MenuItem mnuStockInformation = new MenuItem("Stock Info");
            mnuStock.add(mnuStockInformation);

            MenuItem mnuStockAdd = new MenuItem("Add Stock");
            mnuStock.add(mnuStockAdd);

            MenuItem mnuStockDelete = new MenuItem("Delete Stock");
            mnuStock.add(mnuStockDelete);

            // add the ActionListener to each menu item
            mnuFileExit.addActionListener(this);
            mnuUserLogin.addActionListener(this);
            mnuUserInformation.addActionListener(this);
            mnuUserAdds.addActionListener(this);
            mnuUserDeletes.addActionListener(this);
            mnuStockInformation.addActionListener(this);
            mnuStockAdd.addActionListener(this);
            mnuStockDelete.addActionListener(this);

            // assign an ActionCommand to each menu item
            mnuFileExit.setActionCommand("Exit");
            mnuUserLogin.setActionCommand("Login");
            mnuUserInformation.setActionCommand("User Info");
            mnuUserAdds.setActionCommand("Add User");
            mnuUserDeletes.setActionCommand("Delete User");
            mnuStockInformation.setActionCommand("Stock Info");
            mnuStockAdd.setActionCommand("Add Stock");
            mnuStockDelete.setActionCommand("Delete Stock");



    }



    public void actionPerformed(ActionEvent e)
    {
        // declare and construct variables

        String userIdS, fName, lName, userList, stockName, symbol, stockList;
        int inches, pounds,length, width, height, base,userId;
        double kilograms, meters, index, area, radius;

        // test for menu clicks
        String arg = e.getActionCommand();

        if (arg == "Exit")
            System.exit(0);

        if (arg == "Login")
        {
            userIdS = JOptionPane.showInputDialog(null,"Please Enter Your User ID.");
                userId = Integer.parseInt(userIdS);
            // output
            JOptionPane.showMessageDialog(null, "Login Successful" +
                        ".", "Login Confirmation Panel",JOptionPane.PLAIN_MESSAGE);
        }
        if (arg == "User Info")
                {
                     userIdS = JOptionPane.showInputDialog(null,"Enter the ID of the user you want information for.");
                            userId = Integer.parseInt(userIdS);

                    //userJ.userArray(String[] args);

                    // output
                    /*userList = "USER INFORMATION";
                            for(int i = 0; i<5; i++)
                            {   userJ.userArray();
                                userList += userArray[i];

                                if(i<5)
                                {
                                    userList += ", ";
                                }
                                }
                            JOptionPane.showMessageDialog(null, userList);  */
                    JOptionPane.showMessageDialog(null, userId + " Jessica Scharber " + " Stocks: Resin, Bitcoin, SolarE " +
                    " ", "Welcome Pane",JOptionPane.PLAIN_MESSAGE);
                }
        if (arg == "Add User")
        {
                fName = JOptionPane.showInputDialog(null,"Please enter your first name.");

                lName = JOptionPane.showInputDialog(null,"Please enter your last name.");


            // output
            JOptionPane.showMessageDialog(null, "Welcome " + fName +
            " " + lName, "Welcome Pane",JOptionPane.PLAIN_MESSAGE);

        }
        if (arg == "Delete User")
        {
            userIdS = JOptionPane.showInputDialog(null,"Enter the ID of the user you want to delete.");
                userId = Integer.parseInt(userIdS);

            // output
            JOptionPane.showMessageDialog(null, "The user has been deleted." +
                        ".", "User Deletion",JOptionPane.PLAIN_MESSAGE);

        }
        if (arg == "Stock Info")
        {
                stockName = JOptionPane.showInputDialog(null,"Please enter the name of the stock.");

                    // output
                    JOptionPane.showMessageDialog(null, "The corresponding symbol is.... " +
                    ".", "Stock Info",JOptionPane.PLAIN_MESSAGE);


        }
        if (arg == "Add Stock")
        {
            String[] stockNameArray = new String[5];
                            for (int i=0; i<5; i++)
                            {
                                stockNameArray[i] = JOptionPane.showInputDialog("Please enter the name of a stock you wish to track.");
                            }

                            stockList = "Your Selected Stocks Are: ";
                            for(int i = 0; i<5; i++)
                            {
                                stockList += stockNameArray[i];

                                if(i<5)
                                {
                                    stockList += ", ";
                                }
                                }
                            JOptionPane.showMessageDialog(null, stockList);

        }

        if (arg == "Delete Stock")
                {
                    stockName = JOptionPane.showInputDialog(null,"Enter the name of the stock you want to delete.");

                    // output
                    JOptionPane.showMessageDialog(null, stockName + " has been deleted from your portfolio." +
                    ".", "Stock Deleted",JOptionPane.PLAIN_MESSAGE);

        }
    }

    public static void main(String args[]) throws Exception
    {
        //set frame properties
        stockTracker1J f = new stockTracker1J();
        f.setTitle("STOCK TRACKER");
        f.setBounds(200,200,300,300);
        f.setVisible(true);

        //set image properties and add to frame
        Image icon = Toolkit.getDefaultToolkit().getImage("calcImage.gif");
        f.setIconImage(icon);

        userJ callClass = new userJ();
        callClass.userJAb();
        callClass.userArray();

        getConnection newgetConnection = new getConnection();
        newgetConnection.getConnection();
       }
}
