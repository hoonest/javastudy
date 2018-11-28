package gui;


import javax.swing.*;
import java.awt.*;

class JGridLayout extends JFrame {
    JGridLayout() {
        ImageIcon icon1, icon2,icon3, icon4, icon5, icon6;
        JButton b1, b2, b3, b4, b5, b6;

        Container container = getContentPane();
        container.setLayout(new GridLayout(3,2));
        for(int i=1; i<=15;i++) {
            container.add(new JButton("버튼 " + i));

        }

        icon1 = new ImageIcon("C:/ij_projects/images/1.gif");
        b1 = new JButton(icon1);
        container.add(b1);

        setTitle("GridLayout ");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}


public class Swing08 {

    public static void main(String[] args) {
        new JGridLayout();
    }
}
