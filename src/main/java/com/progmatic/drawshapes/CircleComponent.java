package com.progmatic.drawshapes;

import javax.swing.*;
import java.awt.*;

public class CircleComponent extends JComponent {

    Circle ciricle;

    public CircleComponent(Circle ciricle) {
        this.ciricle = ciricle;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.ORANGE);
        g.drawOval(0,0, (int)ciricle.getRadius()*2, (int)ciricle.getRadius()*2);
    }

    @Override
    public Rectangle getBounds() {
        Rectangle ret = new Rectangle();
        ret.setBounds(
                (int)(ciricle.getCenter().getX()-ciricle.getRadius()),
                (int)(ciricle.getCenter().getY()-ciricle.getRadius()),
                (int)(ciricle.getRadius()*2)+1,
                (int)(ciricle.getRadius()*2)+1);
        return ret;
    }
}
