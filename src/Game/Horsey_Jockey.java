package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Class, where game will start
 */
public class Horsey_Jockey {

    private JFrame frame;

    public Horsey_Jockey(){
        this.frame = new JFrame("Horsey Jockey");
    }

    public void Title(){
        this.frame.setSize(980,800);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
