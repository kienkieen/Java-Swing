package DemoMVC_Task2.View;

import DemoMVC_Task2.Controller.LastButtonListener;
import DemoMVC_Task2.Module.LastButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastButtonView extends JFrame {
    private LastButton lastButton;
    private JLabel jLabel;
    public LastButtonView(){
        this.lastButton = new LastButton();
        this.init();
    }

    private void init() {
        this.setTitle("Last Button");
        this.setLocationRelativeTo(null);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(2,2));

        // Tao listener
        LastButtonListener lastButtonListener = new LastButtonListener(this);


        // Tao font chu
        Font font = new Font("Arial", Font.BOLD, 20);
        // Gan font chu
        JButton jb1 = new JButton("1");
        jb1.addActionListener(lastButtonListener);
        JButton jb2 = new JButton("2");
        jb2.addActionListener(lastButtonListener);
        JButton jb3 = new JButton("3");
        jb3.addActionListener(lastButtonListener);
        JButton jb4 = new JButton("4");
        jb4.addActionListener(lastButtonListener);
        jb1.setFont(font);
        jb2.setFont(font);
        jb3.setFont(font);
        jb4.setFont(font);

        jPanel_center.add(jb1);
        jPanel_center.add(jb2);
        jPanel_center.add(jb3);
        jPanel_center.add(jb4);

        JPanel jPanel_footer = new JPanel();
        jLabel = new JLabel("----------");
        jLabel.setFont(font);

        jPanel_footer.add(jLabel);

        this.setLayout(new BorderLayout());
        this.add(jPanel_center, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);

        this.setVisible(true);

    }

    public void changeTo_1(){
        this.lastButton.setValue_1();
        this.jLabel.setText("Last Button: " +this.lastButton.getValue());
    }
    public void changeTo_2(){
        this.lastButton.setValue_2();
        this.jLabel.setText("Last Button: " +this.lastButton.getValue());
    }
    public void changeTo_3(){
        this.lastButton.setValue_3();
        this.jLabel.setText("Last Button: " +this.lastButton.getValue());
    }
    public void changeTo_4(){
        this.lastButton.setValue_4();
        this.jLabel.setText("Last Button: " +this.lastButton.getValue());
    }
}
