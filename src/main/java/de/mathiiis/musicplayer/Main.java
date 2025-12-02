package de.mathiiis.musicplayer;

import de.mathiiis.musicplayer.utils.FilePicker;
import java.awt.*; 
import javax.swing.*;
import java.io.File;

//Create a simple GUI window
class MainApp {
    private static JLabel textLabel;
    private static JButton addFilesButton;

    private static void createWindow() {
        textLabel = new JLabel("Press the Button!",SwingConstants.CENTER);
        addFilesButton = new JButton("Add Files");

        //Create and set up the window
        JFrame frame = new JFrame("Music Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.add(addFilesButton);

        addFilesButton.addActionListener(e -> {
            File selected = FilePicker.pick();
            if (selected != null){
                textLabel.setText("Selected: " + selected.getName() + " :3");
            } else{
                textLabel.setText("No Fil selected :(");
            }
        });

        frame.getContentPane().add(panel, BorderLayout.SOUTH);


        //Display the window
        frame.setLocationRelativeTo(null); //centers window
        frame.setMinimumSize(new Dimension(400, 250));
        frame.setMaximumSize(new Dimension(400, 250));
        frame.pack(); //automatically sets the size of the window
        frame.setVisible(true);
    }

     public static void main(String[] args) {
         SwingUtilities.invokeLater(() -> createWindow());
     }
}