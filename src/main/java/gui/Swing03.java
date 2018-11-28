package gui;

import javax.swing.*;
import java.awt.*;

class JImageTest extends JFrame {
    JImageTest() {
        //1. 이미지 파일을 이용한 아이콘화
        ImageIcon ii = new ImageIcon("C:/ij_projects/korea.gif");

        //2. "버튼이름" 이미지 아이콘 버튼객체 생성
        JButton korea = new JButton("클릭", ii);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(korea);

        setTitle("이미지 아이콘 실습");
        setSize(500, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class Swing03 {
    public static void main(String[] args) {

        new JImageTest();
    }
}
