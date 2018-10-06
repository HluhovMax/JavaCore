package com.shildt.chapter13.applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Max Hluhov on 06.10.2018.
 */
public class SimpleApplet extends Applet {
    public void paint(Graphics graphics) {
        graphics.drawString("Simple applet", 20, 20);
    }
}
