package com.progmatic.drawshapes;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.setProperty("sun.java2d.opengl", "true");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame frame = new MainFrame();
                frame.init();
                //frame.addSpaceShip();
                frame.setVisible(true);
            }
        });

    }
}

