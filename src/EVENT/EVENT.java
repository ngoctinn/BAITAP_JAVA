package EVENT;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EVENT {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(80, 80, 100, 40);
        f.add(b);
        b.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    int a = JOptionPane.showConfirmDialog(f, "Bạn có chắc muốn thoát chương trình?");
                                    if (a == JOptionPane.YES_OPTION) {
                                        System.exit(0);
                                    }
                                }
                            }
        );
    f.setSize(300,400);
        f.setLayout(null);
    f.setVisible(true);

    }
}
