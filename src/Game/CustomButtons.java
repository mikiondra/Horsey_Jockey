package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Class, where buttons will have custom faces
 */
public class CustomButtons {

    /**
     * Changes button to green with black, for starting the game
     * @param button changes the button
     */
    public static void startButton(JButton button){
        button.setBackground(new Color(0, 70, 0, 255));
        button.setForeground(new Color(0,0,0));
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }

    /**
     * Changes button to brown with cyan, for going into other parts
     * @param button changes the button
     */
    public static void goButton(JButton button){
        button.setBackground(new Color(43, 29, 29, 242));
        button.setForeground(new Color(70, 99, 91));
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }

    /**
     * Changes button to yellow with green, for actions
     * @param button changes the button
     */
    public static void actionButton(JButton button){
        button.setBackground(new Color(120, 106, 45, 242));
        button.setForeground(new Color(86, 147, 62));
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }
}
