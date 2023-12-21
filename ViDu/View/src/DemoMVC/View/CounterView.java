package DemoMVC.View;


import DemoMVC.Controller.CountListener;
import DemoMVC.Module.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_Up;
    private JButton jButton_Down;
    private JButton jButton_Reset;
    private JLabel jLabel_value;

    public CounterView(){
        this.counterModel = new CounterModel();
    }
    public void init(){
        this.setTitle("Counter");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac = new CountListener(this);


        jButton_Up = new JButton("UP");
        jButton_Up.addActionListener(ac);
        jButton_Down = new JButton("DOWN");
        jButton_Down.addActionListener(ac);
        jButton_Reset = new JButton("RESET");
        jButton_Reset.addActionListener(ac);


        jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add(jButton_Up, BorderLayout.WEST);
        jPanel.add(jLabel_value, BorderLayout.CENTER);
        jPanel.add(jButton_Down, BorderLayout.EAST);
        jPanel.add(jButton_Reset, BorderLayout.SOUTH);

        this.setLayout(new BorderLayout());
        this.add(jPanel, BorderLayout.CENTER);




        this.setVisible(true);
    }
    public void increment(){
        this.counterModel.increase();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }
    public void decrement(){
        this.counterModel.decrease();
        this.jLabel_value.setText(this.counterModel.getValue() + "");
    }
    public void resets(){
        this.counterModel.reset();
        this.jLabel_value.setText(this.counterModel.getValue()+ "");
    }

}
