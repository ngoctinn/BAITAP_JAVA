package Vidu_3_1;

import javax.swing.*;

public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(80, 70, 100, 40);
        f.add(b);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
