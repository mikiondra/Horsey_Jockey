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
     * Changes button to yellow with green, for actions regarding Horseys
     * @param button changes the button
     */
    public static void HorseyButton(JButton button){
        button.setBackground(new Color(120, 106, 45, 242));
        button.setForeground(new Color(86, 147, 62));
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }

    /**
     * Changes button to brownish red with bright cyan, for buying stuff actions
     * @param button changes the button
     */
    public static void buyButton(JButton button){
        button.setBackground(new Color(120, 45, 45, 242));
        button.setForeground(new Color(99, 205, 211));
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }

    /**
     * Changes button to purple with bright yellow, for arena racing action
     * @param button changes the button
     */
    public static void raceButton(JButton button){
        button.setBackground(new Color(57, 39, 89, 242));
        button.setForeground(new Color(244, 226, 3));
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }

    /**
     * Changes button to black with yellowish orange, for disposing bodies actions
     * @param button changes the button
     */
    public static void deadBodyButton(JButton button){
        button.setBackground(new Color(7, 6, 3, 242));
        button.setForeground(new Color(244, 150, 10));
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }

    /**
     * Changes button to dark purple with cyan, for sleeping action
     * @param button changes the button
     */
    public static void nightButton(JButton button){
        button.setBackground(new Color(39, 17, 66, 242));
        button.setForeground(new Color(83, 119, 214));
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }

    /**
     * Changes button to red with blue, for going into market
     * @param button changes the button
     */
    public static void marketButton(JButton button){
        button.setBackground(new Color(135, 28, 28, 242));
        button.setForeground(new Color(29, 99, 129));
        button.setFont(new Font("Arial", Font.BOLD,20));
        button.setFocusPainted(false);
        button.setBorderPainted(false);
    }
}
