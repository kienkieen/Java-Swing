package DemoMVC_Task2.Controller;

import DemoMVC_Task2.View.LastButtonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastButtonListener implements ActionListener {

    private LastButtonView lastButtonView;

    public LastButtonListener(LastButtonView lastButtonView) {
        this.lastButtonView = lastButtonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nguonSuKien = e.getActionCommand();
        System.out.println("Ban da nhan nut: "+nguonSuKien);
        switch (nguonSuKien) {
            case "1" -> this.lastButtonView.changeTo_1();
            case "2" -> this.lastButtonView.changeTo_2();
            case "3" -> this.lastButtonView.changeTo_3();
            case "4" -> this.lastButtonView.changeTo_4();
        }

    }
}
