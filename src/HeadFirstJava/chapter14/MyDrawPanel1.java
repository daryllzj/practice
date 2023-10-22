package HeadFirstJava.chapter14;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyDrawPanel1 extends JPanel {

    public void paintComponent(Graphics g){

        Graphics2D graphics2D = (Graphics2D) g;

        Random random = new Random();
        int red = random.nextInt(256);
        int blue = random.nextInt(256);
        int green = random.nextInt(256);
        Color startColor = new Color(red, green, blue);

        red = random.nextInt(256);
        blue = random.nextInt(256);
        green = random.nextInt(256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradientPaint = new GradientPaint(70,70,startColor,150,150,endColor);
        graphics2D.setPaint(gradientPaint);
        g.fillRect(20,50,100, 100);
    }
}
