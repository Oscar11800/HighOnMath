import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("HighOnMath");
        try {
            Image icon = ImageIO.read(new File("C:\\Desktop\\Programming\\HighOnMath\\resources\\HOMicon.png"));
            window.setIconImage(icon);
        } catch (IOException e) {
            System.err.println("Icon image not found."); // Print a specific error message.
            e.printStackTrace(); // Print the stack trace.
            // You might want to consider setting a default icon or handling this case accordingly.
        }

        DashboardPanel dashboardPanel = new DashboardPanel();
        window.add(dashboardPanel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }


}