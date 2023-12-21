package Layout;

import javax.swing.*;
import java.awt.*;

public class DemoFlowLayout extends JFrame {
    public DemoFlowLayout(){
        this.setTitle("Demo Layout");
        this.setSize(800, 600);
        // Cang giua cua so chuong trinh
        this.setLocationRelativeTo(null);

        // Set Layout
        FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 50, 50);
        this.setLayout(flowLayout);
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");

        // add thanh phan
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);



        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DemoFlowLayout();
    }
}
