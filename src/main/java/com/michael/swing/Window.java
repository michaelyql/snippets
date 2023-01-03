package com.michael.swing;

// javax.swing is under the java.desktop module (standard library)
import javax.swing.*;

// Ideally you use the Netbeans IDE, as it allows you to visually drag and drop Swing components and generates the code for you

public class Window {
    private static void createAndShowGUI() {
        // Create and set up the window
        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add "Hello world" label
        JLabel label = new JLabel("Hello world");
        frame.getContentPane().add(label);

        // Display the window 
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread
        // creating and showing the app's GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}