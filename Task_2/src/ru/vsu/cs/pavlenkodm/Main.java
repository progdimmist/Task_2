package ru.vsu.cs.pavlenkodm;

import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList arr=new ArrayList();
        arr.add(2);
        //SwingUtils.setLookAndFeelByName("Windows");
        Locale.setDefault(Locale.ROOT);
        //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        ru.vsu.cs.util.SwingUtils.setDefaultFont("Times New Roman", 17);

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }
}
