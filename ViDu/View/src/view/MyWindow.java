package view;

import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showIt(){
        this.setVisible(true);
    }

    public void showIt(String title){
        this.setTitle(title);
        this.setVisible(true);
    }

    public void showIt(String title, int width, int height){
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow m1 = new MyWindow();
        m1.showIt();

        MyWindow m2 = new MyWindow();
        m2.showIt("Toi ten la: Le Trung Kien");

        MyWindow m3 = new MyWindow();
        m3.showIt("Hello, Swing", 600, 400);
    }
}
