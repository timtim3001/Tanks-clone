package tk.timtim3001.tanksclone;

import javax.swing.*;

public class Main {

    public static void main(String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Frame();
    }
}
