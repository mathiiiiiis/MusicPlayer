package de.mathiiis.musicplayer.utils;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class FilePicker {
    public static File[] pick() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "Audio files", "mp3", "wav", "flac", "aac", "ogg", "m4a", "alac", "wma", "aiff");
        chooser.setFileFilter(filter);
        chooser.setMultiSelectionEnabled(true);

        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION){
            return chooser.getSelectedFiles();
        }

        return null;
    }
}