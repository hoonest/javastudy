package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class JCheckBoxTest extends JFrame implements ItemListener {
    JTextField jtf;

    JCheckBoxTest() {


        JCheckBox jcb1 = new JCheckBox("jsp");
        JCheckBox jcb2 = new JCheckBox("asp");
        JCheckBox jcb3 = new JCheckBox("php");
        JCheckBox jcb4 = new JCheckBox("servlet");

        jtf = new JTextField(10);

        Container  container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jcb1);
        container.add(jcb2);
        container.add(jcb3);
        container.add(jcb4);
        container.add(jtf);

        jcb1.addItemListener(this);
        jcb2.addItemListener(this);
        jcb3.addItemListener(this);
        jcb4.addItemListener(this);

        setTitle("GridLayout ");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox jb = (JCheckBox)e.getItem();
        jtf.setText(jb.getText());
    }
}

public class Swing12 {
    public static void main(String[] args) {
        new JCheckBoxTest();
    }
}
