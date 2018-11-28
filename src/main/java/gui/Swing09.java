package gui;

import javax.swing.*;
import java.awt.*;

class JGridLayout2 extends JFrame {

    JGridLayout2() {
        ImageIcon icon1=null, icon2=null,icon3=null, icon4=null, icon5=null, icon6=null;

        Container container = getContentPane();
        container.setLayout(new GridLayout(3,2));

        for(int i=1;i<=6;i++) {
            container.add(new JButton(new ImageIcon("C:/ij_projects/images/"+i+".jpg")));
        }

        setTitle("GridLayout ");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class Swing09 {
    public static void main(String[] args) {
        new JGridLayout2();
    }
}
