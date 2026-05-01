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

    /**
     * Class, where the program will begin and where player can start the game
     */
    public void Title(){
        this.frame.setSize(1280,1000);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Welcome to HORSEY JOCKEY, I hope you will enjoy this experience.",JLabel.CENTER);
        this.frame.add(label,BorderLayout.CENTER);

        JButton button = new JButton("Start the game");
        CustomButtons.startButton(button);
        this.frame.add(button,BorderLayout.SOUTH);

        button.addActionListener(e ->{
            Horsey h = new Horsey("",0,0,false);
            Player p =new Player(50,10,3,1,h);
            new Ranch().show(p,h);
            this.frame.dispose();
        });

        this.frame.setVisible(true);
    }
}
