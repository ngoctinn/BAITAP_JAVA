package Vidu_3_2;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    public GUI(String title) {
        // gọi phương thức định nghĩa khung giao diện
        initGUI(title);
    }

    private void initGUI(String title) {
        setTitle(title);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null); // can giua man hinh
        getContentPane().setBackground(Color.BLUE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new CardLayout());

    }
}


