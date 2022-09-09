package edu.frosburg.cosc460.charlestyriekshell;

import java.nio.file.Paths;
import javax.swing.JOptionPane;

/**
 *
 * @author tyriek
 */
public class TCpwd extends Thread {

    public void run() {
        try {
            //get current directory
            String ptd = Paths.get("").toAbsolutePath().toString();
            // print directory
            //  System.out.println(
            JOptionPane.showMessageDialog(null, "Current Directory = " + ptd);
            //);

        } catch (Exception e) {

        }
    }
}
