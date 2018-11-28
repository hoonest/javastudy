package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JImageTest2 extends JFrame implements ActionListener {
    JLabel result;

    JImageTest2() {
        //1. 이미지 파일을 이용한 아이콘화
        ImageIcon ii = new ImageIcon("C:/ij_projects/korea.gif");

        result = new JLabel("");

        //2. "버튼이름" 이미지 아이콘 버튼객체 생성
        JButton korea = new JButton("클릭",ii);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(korea);
        container.add(result);

        korea.addActionListener(this);

        setTitle("여기는 대한민국입니다.");
        setSize(500, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        result.setText("대한민국 버튼 클릭");
    }
}

public class Swing04 {
    public static void main(String[] args) {
        new JImageTest2();
    }

}
