package edu.frosburg.cosc460.charlestyriekshell;

import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author tyriek
 */
public class TCAll extends Thread {

    public void run() {
        try {
            //instiate bufferedReader
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // get user input
            // Exmaple how to enter: C:\Program Files\Mozilla Firefox\firefox.exe , C:\Program Files\Google\Chrome\Application , notepad.exe etc
            //Enter path file anyway
            //System.out.println(
            String sfs = JOptionPane.showInputDialog(null, reader, " Enter the path for the file and add .exe: ", JOptionPane.INFORMATION_MESSAGE);
            //);
            //sfs = reader.readLine();
            Runtime.getRuntime().exec(sfs);

        } catch (Exception e) {
            
           
        }
    }
}
