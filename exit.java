package edu.frosburg.cosc460.charlestyriekshell;
import javax.swing.JOptionPane;

/**
 *
 * @author tyriek
 */
public class exit extends Thread {

    public void run() {
        

            //print have a good day
            // System.out.println
            JOptionPane.showMessageDialog(null, "Have a good day");
            //end code
            System.exit(0);

       
    }

}
