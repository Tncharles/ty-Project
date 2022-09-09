package edu.frosburg.cosc460.charlestyriekshell;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

/**
 *
 * @author tyriek
 */
public class TCShell {

    public static void main(String[] args) {

        int c;
        while (true) {

            // Menu 
            // JOptionPane.showMessageDialog(null,"Menu");
            //creating object of the Scanner class  
            // Scanner sc = new Scanner(System.in);
            //reading input from the user  
            //  System.out.println(
            String sc = JOptionPane.showInputDialog(null, "Menu \n"
                    + "(1) To Print out the contents of the current directory \n"
                    + "(2) To Print out the current location \n"
                    + "(3) To Copy file S to a new file \n"
                    + "(4) To Print out the name of the program’s creator. \n"
                    + "(5) Will do everything and Allow you to open a program of your choice \n"
                    + "(6) Will quit \n"
                    + "Enter a number ( 1 - 6 ): \n", JOptionPane.INFORMATION_MESSAGE);//);
            // c = sc.nextInt();
            c = Integer.parseInt(sc);

            {
                // if statement for thread 0
                if (c == 1) {
                    //set up thread 0
                    TCls t0 = new TCls();
                    //do this task
                    try {
                        // kick off the thread created above
                        t0.start();
                        // Threads are joined when they are done
                        t0.join();

                    } catch (Exception e) {

                    }
                } // if statement for thread 1
                else if (c == 2) {
                    //set up thread 1
                    TCpwd t1 = new TCpwd();
                    //do this task
                    try {
                        // kick off the thread created above
                        t1.start();
                        // Threads are joined when they are done
                        t1.join();

                    } catch (Exception e) {

                    }
                } // if statement for thread 2
                else if (c == 3) {
                    //set up thread 2
                    TCcpSD t2 = new TCcpSD();
                    //do this task
                    try {
                        // kick off the thread created above
                        t2.start();
                        // Threads are joined when they are done
                        t2.join();

                    } catch (Exception e) {
                        //System.out.println(e.getMessage());
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }

                } // if statement for thread 3
                else if (c == 4) {
                    //set up thread 3
                    who t3 = new who();
                    //do this task
                    try {
                        // kick off the thread created above
                        t3.start();
                        // Threads are joined when they are done
                        t3.join();

                    } catch (Exception e) {
                    }
                } // if statement for thread 4
                else if (c == 5) {
                    //set up thread 4 with all threads running
                    TCls t0 = new TCls();
                    TCpwd t1 = new TCpwd();
                    TCcpSD t2 = new TCcpSD();
                    who t3 = new who();
                    TCAll t4 = new TCAll();
                    exit t5 = new exit();

                    //do this tasks
                    try {
                        // kick off the threads created above
                        t0.start();
                        t1.start();
                        t2.start();
                        t3.start();
                        t4.start();
                        t5.start();
                        // Threads are joined when they are done
                        t0.join();
                        t1.join();
                        t2.join();
                        t3.join();
                        t4.join();
                        t5.join();

                    } catch (Exception e) {
                    }
                } // if statement for thread 5
                else if (c == 6) {
                    //set up thread 5
                    exit t5 = new exit();
                    //do this task
                    try {
                        // kick off the thread created above
                        t5.start();
                        // Threads are joined when they are done
                        t5.join();

                    } catch (InterruptedException e) {

                    }
                }

            }

        }
    }
}
