package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JMenuDemo extends JFrame implements ActionListener {
    JTextField jtf;

    JMenuDemo() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        jtf = new JTextField();
        container.add(jtf, BorderLayout.SOUTH);

        JMenu file = new JMenu("파일");

        JMenuItem jmi = new JMenuItem("새로만들기");
        JMenuItem jmi2 = new JMenuItem("열기");
        JMenuItem jmi3 = new JMenuItem("끝내기");

        jmi.addActionListener(this);
        jmi2.addActionListener(this);
        jmi3.addActionListener(this);
        file.add(jmi);file.add(jmi2); file.add(jmi3);

        JMenuBar jmb = new JMenuBar();
        jmb.add(file);
        //setJMenuBar(jmb);


        JMenu file2 = new JMenu("편집");

        JMenuItem jmi4 = new JMenuItem("복사하기");
        JMenuItem jmi5 = new JMenuItem("붙이기");
        JMenuItem jmi6 = new JMenuItem("오려내기");

        jmi4.addActionListener(this);
        jmi5.addActionListener(this);
        jmi6.addActionListener(this);
        file2.add(jmi4);file2.add(jmi5); file2.add(jmi6);

        //JMenuBar jmb2 = new JMenuBar();
        jmb.add(file2);



        setJMenuBar(jmb);
        setTitle("GridLayout ");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jtf.setText(e.getActionCommand());
    }
}

public class Swing18 {
    public static void main(String[] args) {
        new JMenuDemo();
    }
}
