package gui;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionListener;

class JButtonEvent extends JFrame /*implements ActionListener*/ {
    JLabel result;

    JButtonEvent() {

        result = new JLabel("");

        //3국의 이미지 아이콘화
        ImageIcon korIcon = new ImageIcon("C:/ij_projects/images/korea1.gif");
        ImageIcon usaIcon = new ImageIcon("C:/ij_projects/images/usa.gif");
        ImageIcon gerIcon = new ImageIcon("C:/ij_projects/images/germany.gif");

        JButton event = new JButton(korIcon);

        //버튼오버시 usa표시
        //event.setRolloverIcon(usaIcon);
        //버튼클릭시 ger표시
        //event.setPressedIcon(gerIcon);
        //버튼아웃시
       // event.setDisabledIcon(korIcon);

        Container cont = getContentPane();
        cont.setLayout(new FlowLayout());
        cont.add(event);
        cont.add(result);

        //result.addActionListener(this);

        setTitle("JButton 자체 Event 처리 실습");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

/*    @Override
    public void actionPerformed(ActionEvent e) {
        result.setText("===" + e.getActionCommand());
    }*/
}

public class Swing05 {
    public static void main(String[] args) {
        new JButtonEvent();
    }
}
