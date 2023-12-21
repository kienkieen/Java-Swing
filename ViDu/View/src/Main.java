import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        // Gan ten
        jf.setTitle("Vi Du ve JFrame");
        // Gan kich co
        jf.setSize(600, 400);

//        while ((true)) {
//            System.out.println("Chuong trinh dang chay!");
//        }

        // Gan vi tri hien thi
        jf.setLocation(300, 300);

        // Thoat chuong trinh
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Cho phep hien thi
        jf.setVisible(true);
    }
}