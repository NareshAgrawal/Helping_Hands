/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.SplashScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nares
 */
public class Splash extends Frame implements ActionListener{
     static void renderSplashFrame(Graphics2D g, int frame) {
        final String[] comps = {"config", "modules", "graphics"};
        g.setComposite(AlphaComposite.Clear);
        g.fillRect(140,130,200,40);
        g.setPaintMode();
        g.setColor(Color.WHITE);
        g.drawString("Loading "+comps[(frame/5)%3]+"...", 140, 140);
    }
    public Splash() {
     final SplashScreen splash = SplashScreen.getSplashScreen();
        if (splash == null) {
            System.out.println("SplashScreen.getSplashScreen() returned null");
            return;
        }
        Graphics2D g = splash.createGraphics();
        if (g == null) {
            System.out.println("g is null");
            return;
        }
        for(int i=0; i<100; i++) {
            renderSplashFrame(g, i);
            splash.update();
            try {
                Thread.sleep(40);
            }
            catch(InterruptedException e) {
            }
        }
        splash.close();
    }
    public void actionPerformed(ActionEvent ae) {
        System.exit(0);
    }
    
    public static void main (String args[]) {
        Splash test = new Splash();
    }
}
