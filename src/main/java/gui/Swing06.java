package gui;

import javax.swing.*;
import java.awt.*;

class JFlowLayout extends JFrame {

    JFlowLayout() {
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        for(int i =0; i<=15;i++) {
            container.add(new JButton("버튼"+i));
        }

        setTitle("FlowLayout 배치관리자 실습");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}

public class Swing06 {
    public static void main(String[] args) {
        new JFlowLayout();
    }

}
