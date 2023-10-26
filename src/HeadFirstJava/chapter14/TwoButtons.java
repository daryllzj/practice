package HeadFirstJava.chapter14;

import javax.swing.*;
import java.awt.*;

public class TwoButtons {

    private JFrame frame;
    private JLabel label;

    public static void main(String[] args) {
        TwoButtons gui = new TwoButtons();
        gui.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton labelButton = new JButton("change label");
        labelButton.addActionListener(event -> label.setText("ouch"));

        JButton colorButton = new JButton("change circle");
        colorButton.addActionListener(e -> frame.repaint());

        label = new JLabel("I am a new label");
        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);

        frame.setSize(500, 300);
        frame.setVisible(true);
    }

//    class LabelListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent event){
//
//            label.setText("ouch");
//        }
//
//    }
//
//    class ColorListener implements ActionListener {
//
//        public void actionPerformed(ActionEvent event){
//
//            frame.repaint();
//        }
//
//    }



}
