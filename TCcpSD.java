package edu.frosburg.cosc460.charlestyriekshell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

/**
 *
 * @author tyriek
 */
public class TCcpSD extends Thread {

    {
        // greet user
        // System.out.println(
        //JOptionPane.showMessageDialog(null,"Greetings Friend, I will copy a file for you today maybe:) ");
        //user input for the file
        Scanner CAF = new Scanner(System.in);
        // The file that need to be copy. Make sure you add the path way and file name.txt     
        // System.out.println(
        String sourceFileName = JOptionPane.showInputDialog(null, CAF, "\n" + "Greetings Friend, I will copy a file for you today maybe:) \n"
                + " Enter the path for the file name: ", JOptionPane.INFORMATION_MESSAGE);
        //);
        //String sourceFileName = CAF.next();
        // the new file copy.  Make sure you add the path way and file name.txt 
        //System.out.println(
        String destinationFileName = JOptionPane.showInputDialog(null, CAF,
                "Enter the path for the new file destinationand with a new name: ", JOptionPane.INFORMATION_MESSAGE);
        //);
        //String destinationFileName = CAF.next();
        File input = new File(sourceFileName);
        File output = new File(destinationFileName);
        // copying and output      
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(input);
            out = new FileOutputStream(output);
            byte[] buffer = new byte[1024];

            int length;

            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            // End code       
        } catch (Exception e) {

        }

    }
}
