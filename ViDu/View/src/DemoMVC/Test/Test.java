package DemoMVC.Test;

import DemoMVC.Module.CounterModel;
import DemoMVC.View.CounterView;

public class Test {
    public static void main(String[] args) {
        CounterModel ct = new CounterModel();
        ct.increase();
        ct.increase();
        ct.increase();
        System.out.println(ct.getValue());

        CounterView ctv = new CounterView();
        ctv.init();
    }
}
