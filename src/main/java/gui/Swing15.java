package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JListTest extends JFrame implements ActionListener {
    String[] sports = {"농구", "축구", "야구", "배구", "테니스", "핸드볼"};

    JListTest() {
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JList<String> jl = new JList<String>(sports);
        jl.setVisibleRowCount(3);

        JScrollPane jsp = new JScrollPane(jl);

        container.add(jsp);


        setTitle("GridLayout ");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        e.getActionCommand();
    }
}

public class Swing15 {
    public static void main(String[] args) {
        new JListTest();
    }
}
