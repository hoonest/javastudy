package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class JComboBoxTest extends JFrame implements ItemListener {

    JLabel jl;

    JComboBoxTest() {
        ImageIcon ii = new ImageIcon("C:/ij_projects/images/1.jpg");
        jl = new JLabel(ii);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        container.add(jl);

        JComboBox<String> jc = new JComboBox<String>();
        for(int i=1; i<=6; i++) {
            jc.addItem(""+i);
        }

        container.add(jc);

        jc.addItemListener(this);

        setTitle("GridLayout ");
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String jcb = ((String)e.getItem());
        jl.setIcon(new ImageIcon("C:/ij_projects/images/"+  jcb +".jpg"));
    }
}

public class Swing14 {
    public static void main(String[] args) {
        new JComboBoxTest();
    }
}
