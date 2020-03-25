package com.progmatic.drawshapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class MainFrame extends JFrame {

    List<CircleComponent> activeCircles  = new ArrayList<>();

    public void init() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setUndecorated(true);
        //setSize(800, 600);
        getContentPane().setBackground(Color.DARK_GRAY);

        //no layout manager is used, because we want to use absolute positioning
        setLayout(null);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                for (CircleComponent c: activeCircles){
                    remove(c);
                }
                activeCircles.clear();
                Circle base = new Circle(new Point(e.getLocationOnScreen().x, e.getLocationOnScreen().y), 10);
                addCircle(base);
                Circle[] necklace = base.getNecklace(200, 20);
                for (Circle c:necklace) {
                    addCircle(c);
                }
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        //pack();

    }

    private void addCircle(Circle c) {
        CircleComponent cc = new CircleComponent(c);
        add(cc);
        activeCircles.add(cc);
        cc.setBounds(cc.getBounds());
        cc.setVisible(true);
    }
}
