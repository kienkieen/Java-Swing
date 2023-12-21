package DemoMVC.Controller;


import DemoMVC.View.CounterView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountListener implements ActionListener {
    private CounterView ctv;

    public CountListener(CounterView ctv) {
        this.ctv = ctv;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("Ban da nhan nut!");
        String src = e.getActionCommand();
        System.out.println("Ban da nhan nut: " +src);

        switch (src) {
            case "UP" -> this.ctv.increment();
            case "DOWN" -> this.ctv.decrement();
            case "RESET" -> this.ctv.resets();
        }
    }
}
