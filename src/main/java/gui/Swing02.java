package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonEvent extends JFrame implements ActionListener {
    JLabel result;
    ButtonEvent() {
        JButton male = new JButton("남자");
        JButton female = new JButton("여자");
        JLabel label = new JLabel("당신의 성별은?");
        result = new JLabel("");


        //Frame 컨테이너의 객체 생성
        Container container = getContentPane();

        //배치관리자 지정
        container.setLayout(new FlowLayout());

        //컨테이너에 컴포넌트 요소 추가
        container.add(male);
        container.add(female);
        container.add(label);
        container.add(result);

        male.addActionListener(this);
        female.addActionListener(this);

        setTitle("버튼 이벤트 테스트");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        result.setText(e.getActionCommand());
    }
}

public class Swing02 {
    public static void main(String[] args) {
        new ButtonEvent();
    }
}
