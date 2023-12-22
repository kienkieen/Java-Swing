package DemoMVC_Task3.Module;

import java.awt.*;

public class MyColor {
    private Color foreground;
    private Color background;
    private boolean opague;

    public MyColor(){
        this.foreground = Color.BLACK;
        this.background = Color.WHITE;
        this.opague = true;
    }

    public Color getForeground() {
        return foreground;
    }

    public void setForeground(Color foreground) {
        this.foreground = foreground;
    }

    public Color getBackground() {
        return background;
    }

    public void setBackground(Color background) {
        this.background = background;
    }

    public boolean isOpague() {
        return opague;
    }

    public void setOpague(boolean opague) {
        this.opague = opague;
    }


}
