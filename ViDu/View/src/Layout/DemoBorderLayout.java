package Layout;

import javax.swing.*;
import java.awt.*;

public class DemoBorderLayout extends JFrame{

        public DemoBorderLayout(){
            this.setTitle("Demo Layout");
            this.setSize(800, 600);
            // Cang giua cua so chuong trinh
            this.setLocationRelativeTo(null);

            BorderLayout bd1 = new BorderLayout();
            BorderLayout bd2 = new BorderLayout(12, 12);
            this.setLayout(bd2);

            JButton jb1 = new JButton("1");
            JButton jb2 = new JButton("2");
            JButton jb3 = new JButton("3");
            JButton jb4 = new JButton("4");
            JButton jb5 = new JButton("5");

            // add thanh phan
            this.add(jb1, BorderLayout.NORTH);
            this.add(jb2, BorderLayout.SOUTH);
            this.add(jb3, BorderLayout.WEST);
            this.add(jb4, BorderLayout.EAST);
            this.add(jb5, BorderLayout.CENTER);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }

        public static void main(String[] args) {
            new DemoBorderLayout();
        }

}
