package DemoMVC_Task3.Controller;

import DemoMVC_Task3.View.MyColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener {
    private MyColorView myColorView;

    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        switch (src){
            case "Red Text" -> this.myColorView.changeTextColor(Color.RED);
            case "Yellow Text" -> this.myColorView.changeTextColor(Color.YELLOW);
            case "Green Text" -> this.myColorView.changeTextColor(Color.GREEN);
            case "Red Background" -> this.myColorView.changeBackgroundColor(Color.RED);
            case "Yellow Background" -> this.myColorView.changeBackgroundColor(Color.YELLOW);
            case "Green Background" -> this.myColorView.changeBackgroundColor(Color.GREEN);

        }
    }
}
