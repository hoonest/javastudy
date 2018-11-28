package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


class JRadioPanel extends JPanel implements ActionListener {
    JLabel jl2;

    JRadioPanel() {
        JLabel jl1 = new JLabel("당신의 혈액형은?");

        jl2 = new JLabel("");

        JRadioButton jr1 = new JRadioButton("남자");
        JRadioButton jr2 = new JRadioButton("여자");

        ButtonGroup bg = new ButtonGroup();
        bg.add(jr1);
        bg.add(jr2);

        add(jl1); add(jl2);add(jr1);add(jr2);

        jr1.addActionListener(this);
        jr2.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        jl2.setText(e.getActionCommand());
    }
}

class JComboBoxPanel extends JPanel implements ItemListener {
    JLabel result;
    JComboBoxPanel(){
        JLabel jl1 = new JLabel("당신의 혈액형은?");
        result = new JLabel("");

        JComboBox<String> jcb = new JComboBox<String>();
        jcb.addItem("A형");
        jcb.addItem("B형");
        jcb.addItem("O형");
        jcb.addItem("AB형");

        add(jl1); add(result);add(jcb);
        jcb.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String item = (String)e.getItem();
        result.setText(item);
    }
}


class JTabbedPanelFrame extends JFrame {

    JTabbedPanelFrame() {
        JTabbedPane jtp = new JTabbedPane();
        JRadioPanel jrp = new JRadioPanel();
        JComboBoxPanel jcp = new JComboBoxPanel();

        jtp.addTab("성별", jrp);
        jtp.addTab("혈액형", jcp);


        Container container = getContentPane();
        container.add(jtp);

        setTitle("GridLayout ");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}

public class Swing16 {
    public static void main(String[] args) {
        new JTabbedPanelFrame();
    }
}
