package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JTextFieldTextArea extends JFrame implements ActionListener {
    private JTextField jtf;
    private JTextArea jta;



    JTextFieldTextArea() {
        jtf = new JTextField(10);
        jta = new JTextArea(7, 20);
        jta.setAutoscrolls(true);
        jta.setColumns(20);
        jta.setRows(7);
        jta.setTabSize(20);
        jta.setSize(7,20);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(jtf);
        container.add(jta);

        jtf.addActionListener(this);


        setTitle("GridLayout ");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        jta.append(e.getActionCommand() + "\n");
    }
}


public class Swing11 {
    public static void main(String[] args) {
        new JTextFieldTextArea();
    }
}
