package Layout;

import javax.swing.*;
import java.awt.*;


public class DemoJPanel extends JFrame {
    public DemoJPanel(){
        this.setTitle("My Calculator");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField = new JTextField();
        JPanel jPanel_head = new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField, BorderLayout.CENTER);

        JButton jb0 = new JButton("0");
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        JButton jbCong = new JButton("+");
        JButton jbTru = new JButton("-");
        JButton jbNhan = new JButton("*");
        JButton jbChia = new JButton("/");
        JButton jbBang = new JButton("=");

        JPanel jp_button = new JPanel();
        jp_button.setLayout(new GridLayout(5, 3));

        this.setLayout(new BorderLayout());
        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jp_button, BorderLayout.CENTER);

        jp_button.add(jb0);
        jp_button.add(jb1);
        jp_button.add(jb2);
        jp_button.add(jb3);
        jp_button.add(jb4);
        jp_button.add(jb5);
        jp_button.add(jb6);
        jp_button.add(jb7);
        jp_button.add(jb8);
        jp_button.add(jb9);
        jp_button.add(jbCong);
        jp_button.add(jbTru);
        jp_button.add(jbNhan);
        jp_button.add(jbChia);
        jp_button.add(jbBang);


        this.setVisible(true);
    }

    public static void main(String[] args) {
//            com.sun.java.swing.plaf.gtk.GTKLookAndFeel
//            com.sun.java.swing.plaf.motif.MotifLookAndFeel
//            com.sun.java.swing.plaf.windows.WindowsLookAndFeel
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new DemoJPanel();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
