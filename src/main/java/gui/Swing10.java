package gui;


import javax.swing.*;
import java.awt.*;

class JPanelTest extends JFrame {
    JPanelTest() {
        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        //첫번째 패널 객체 생성 및 컴포넌트 추가(버튼)
        JPanel jp1 = new JPanel();
        jp1.setLayout(new GridLayout(5,1));
        jp1.add(new JButton("JAVA"));
        jp1.add(new JButton("C++"));
        jp1.add(new JButton("ASP"));
        jp1.add(new JButton("JSP"));
        jp1.add(new JButton("PHP"));
        container.add(jp1, BorderLayout.WEST);


        JPanel jp3 = new JPanel();
        jp3.setLayout(new GridLayout(3,2));
        for(int i=1;i<=6;i++) {
            jp3.add(new JButton(new ImageIcon("C:/ij_projects/images/"+i+".jpg")));
        }
        container.add(jp3, BorderLayout.CENTER);

        //두번째 패널 객체 생성 및 컴포넌트 추가(radio)
        JPanel jp2 = new JPanel();
        jp2.setLayout(new GridLayout(4,1));
        jp2.add(new JRadioButton("html"));
        jp2.add(new JRadioButton("xml"));
        jp2.add(new JRadioButton("json"));
        jp2.add(new JRadioButton("text"));
        container.add(jp2, BorderLayout.EAST);

        setTitle("GridLayout ");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class Swing10 {
    public static void main(String[] args) {
        new JPanelTest();
    }
}
