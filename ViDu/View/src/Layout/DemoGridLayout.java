package Layout;

import javax.swing.*;
import java.awt.*;

public class DemoGridLayout extends JFrame {
    public DemoGridLayout(){
        this.setTitle("Demo Layout");
        this.setSize(800, 600);
        // Cang giua cua so chuong trinh
        this.setLocationRelativeTo(null);

        // GridLayout
        GridLayout gl1 = new GridLayout();
        GridLayout gl2 = new GridLayout(4, 4);
        GridLayout gl3 = new GridLayout(4, 4, 25, 25);
        this.setLayout(gl3);
        for(int i = 0; i < 16; i++){
            JButton jb = new JButton(i+"");
            this.add(jb);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new DemoGridLayout();
    }
}
