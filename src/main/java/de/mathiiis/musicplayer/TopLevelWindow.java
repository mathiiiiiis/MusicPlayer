package de.mathiiis.musicplayer;
import java.awt.*; 
import javax.swing.*;

//Create a simple GUI window
public class TopLevelWindow {
    private static JLabel textLabel;
    private static JButton addFilesButton;

    private static void createWindow() {
        textLabel = new JLabel("Press the Button!",SwingConstants.CENTER);
        addFilesButton = new JButton("Add Files");

        //Create and set up the window
        JFrame frame = new JFrame("Music Player");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(textLabel, BorderLayout.CENTER); //adds text to the JFrame

        JPanel panel = new JPanel();
        panel.add(addFilesButton); //adds button to JPanel

        addFilesButton.addActionListener(e -> {
            System.out.println("Button clicked!");
            textLabel.setText("You clicked the Button!");

            new javax.swing.Timer(1500, ev -> {
                textLabel.setText("Press the Button!");
                System.out.println("Changed text back");
            }) {{
                setRepeats(false);
                start();
            }};
        });

        frame.getContentPane().add(panel, BorderLayout.SOUTH); //adds JPanel to JFrame


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