package DemoMVC_Task3.View;

import DemoMVC_Task3.Controller.MyColorListener;
import DemoMVC_Task3.Module.MyColor;

import javax.swing.*;
import java.awt.*;

public class MyColorView extends JFrame {
    private MyColor myColor;
    private JLabel jLabel;

    public MyColorView(){
        this.myColor = new MyColor();
        this.init();
        
    }

    private void init() {

        this.setTitle("MY Color");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font_text = new Font("Arial", Font.BOLD, 100);
        jLabel = new JLabel("TEXT");
        jLabel.setFont(font_text);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,3));

        Font font = new Font("Arial", Font.ITALIC|Font.BOLD, 25);

        MyColorListener myColorListener = new MyColorListener(this);

        JButton jb_red_text = new JButton("Red Text");
        jb_red_text.setFont(font);
        jb_red_text.setForeground(Color.RED);
        jb_red_text.addActionListener(myColorListener);

        JButton jb_yellow_text = new JButton("Yellow Text");
        jb_yellow_text.setFont(font);
        jb_yellow_text.setForeground(Color.YELLOW);
        jb_yellow_text.addActionListener(myColorListener);

        JButton jb_green_text = new JButton("Green Text");
        jb_green_text.setFont(font);
        jb_green_text.setForeground(Color.GREEN);
        jb_green_text.addActionListener(myColorListener);

        JButton jb_red_background = new JButton("Red Background");
        jb_red_background.setFont(font);
        jb_red_background.setBackground(Color.RED);
        jb_red_background.addActionListener(myColorListener);

        JButton jb_yellow_background = new JButton("Yellow Background");
        jb_yellow_background.setFont(font);
        jb_yellow_background.setBackground(Color.YELLOW);
        jb_yellow_background.addActionListener(myColorListener);

        JButton jb_green_ground = new JButton("Green Background");
        jb_green_ground.setFont(font);
        jb_green_ground.setBackground(Color.GREEN);
        jb_green_ground.addActionListener(myColorListener);

        jPanel.add(jb_red_text);
        jPanel.add(jb_yellow_text);
        jPanel.add(jb_green_text);
        jPanel.add(jb_red_background);
        jPanel.add(jb_yellow_background);
        jPanel.add(jb_green_ground);

        this.setLayout(new BorderLayout());
        this.add(jLabel, BorderLayout.NORTH);
        this.add(jPanel, BorderLayout.CENTER);

        this.setVisible(true);

    }

    public void changeTextColor(Color color) {
        this.jLabel.setForeground(color);
    }
    public void changeBackgroundColor(Color color) {
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }
}
