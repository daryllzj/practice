package HeadFirstJava.chapter14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui2 implements ActionListener {

    private JButton button;

    public static void main(String[] args) {
        SimpleGui2 gui2 = new SimpleGui2();
        gui2.go();

    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("click me");
        button.addActionListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        button.setText("I have been clicked");
    }


}
