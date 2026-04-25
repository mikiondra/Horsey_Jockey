package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Class, where horsies will race for fame and glory
 */
public class Arena {

    private JFrame frame;

    public Arena() {
        this.frame = new JFrame("Arena");
    }

    public void show(){
        this.frame.setSize(1280,1000);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton towncenter = new JButton("Go to the Towncenter");
        CustomButtons.goButton(towncenter);
        this.frame.add(towncenter,BorderLayout.SOUTH);

        JButton race = new JButton("Sign your Horsey for the race");
        CustomButtons.actionButton(race);
        this.frame.add(race,BorderLayout.CENTER);

        JLabel info = new JLabel("HORSEY",JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        towncenter.addActionListener(e ->{
            new Towncenter().show();
            this.frame.dispose();
        });

        race.addActionListener(e ->{

        });

        this.frame.setVisible(true);
    }
}
