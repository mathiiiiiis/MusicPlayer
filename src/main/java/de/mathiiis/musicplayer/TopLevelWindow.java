package de.mathiiis.musicplayer;
import java.awt.*; 
import javax.swing.*;

//Create a simple GUI window
public class TopLevelWindow {

    private static void createWindow() {

        //Create and set up the window
        JFrame frame = new JFrame("Music Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel textLabel = new JLabel("I'm a label in the window",SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300, 100));
        frame.getContentPane().add(textLabel, BorderLayout.CENTER); //adds text to the JFrame

        //Display the window
        frame.setLocationRelativeTo(null); //centers window
        frame.pack(); //automatically sets the size of the window
        frame.setVisible(true); //selft explainable
    }

    public static void main(String[] args) {
        createWindow();
    }
}