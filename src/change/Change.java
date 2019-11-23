/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change;

/**
 *
 * @author Blacker
 */
import java.io.*;
import javax.swing.JOptionPane;
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        

    String totalString;
    int total;
    totalString = JOptionPane.showInputDialog(null, "Change to be returned",   "Denomination Conversion", JOptionPane.INFORMATION_MESSAGE);
    total = Integer.parseInt(totalString);
    //Calculations begin here
    //Section handling the sh 1000 notes
    int thousand, fh, h, f, twenty, t, fi, tw, o;
    thousand = total/1000;
    int balance = total - (1000*thousand);
    //Section handling the sh 500 notes
    fh = balance/500;
    balance = balance - (500*fh);
    //Section handling the sh 100 notes
    h = balance/100;
    balance = balance - (100 * h);
    //Section handling the sh 50 notes
    f = balance/50;
    balance = balance - (50*f);
    //Section handling the sh 20 coins
    twenty = balance/20;
    balance = balance - (20*twenty);
    //Section handling the sh 10 coins
    t = balance/10;
    balance = balance-(10*t);
    //Section handling the sh 5 coins
    fi = balance/5;
    balance = balance - (5*fi);
   //Section handling the sh 1 coins
    o = balance/1;
    balance = balance - (1*o);
    //End of calculation
    //Print work.
    JOptionPane.showMessageDialog(null, "Total Entered is Ksh." + totalString + "\n" +     "\nThousand notes: " + thousand + "\nFive Hundred Notes: " + fh + "\nHundred notes: " + h + "\nFifty notes: " + f + "\nTwenty coins: " + twenty + "\nTen coins: " + t + "\nFive coins: " + fi + 
     "\nOne coins: " + o);
}
}
        
 
