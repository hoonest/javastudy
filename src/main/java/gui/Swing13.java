package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JRadioBoxTest extends JFrame implements ActionListener {
    JTextField jtf;

    JRadioBoxTest() {
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        jtf = new JTextField(10);

        ButtonGroup bg = new ButtonGroup();
        JRadioButton jb1 = new JRadioButton("승마");
        JRadioButton jb2 = new JRadioButton("수영");
        JRadioButton jb3 = new JRadioButton("농구");
        JRadioButton jb4 = new JRadioButton("골프");
        bg.add(jb1);bg.add(jb2);bg.add(jb3);bg.add(jb4);



        container.add(jb1);
        container.add(jb2);
        container.add(jb3);
        container.add(jb4);
        container.add(jtf);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);

        setTitle("GridLayout ");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jtf.setText(e.getActionCommand()+"\n");
    }
}

public class Swing13 {
    public static void main(String[] args) {
        new JRadioBoxTest();
    }
}
