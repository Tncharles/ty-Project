package edu.frosburg.cosc460.charlestyriekshell;

import java.util.*;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author tyriek
 */
public class TCls extends Thread {

    {
        //instiate file
        File cd = new File(".");
        //System.out.println
        JOptionPane.showMessageDialog(null, "The contents of the current directory is: ");
        //print the contents
        getAllFiles(cd);
    }
    // method to getAllFiles

    private static void getAllFiles(File cd) {

        try {
            //store content
            File[] filesList = cd.listFiles();
            for (File f : filesList) {
                if (f.isDirectory()) {
                    getAllFiles(f);
                }
                if (f.isFile()) {
                    // print the names
                    //System.out.println
                    JOptionPane.showMessageDialog(null, f.getName());
                }
            }
        } catch (Exception e) {
           }
    }
}
