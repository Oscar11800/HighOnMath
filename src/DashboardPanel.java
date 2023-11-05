import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {
    //    Screen Settings
    final int SCREEN_WIDTH = 1080;
    final int SCREEN_HEIGHT = 720;

    public DashboardPanel(){
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
        this.setBackground(Color.DARK_GRAY);
        this.setDoubleBuffered(true);
    }

    public displayDashboard(){
        
    }

}
