package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Class, where game will begin and where player can feed the horsey and skip days
 */
public class Ranch {

    private JFrame frame;

    public Ranch(){
     this.frame = new JFrame("Ranch");
    }

    public void show(){
        this.frame.setSize(1280,1000);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton plains = new JButton("Go to the Plains");
        CustomButtons.goButton(plains);
        this.frame.add(plains,BorderLayout.WEST);

        JButton feed = new JButton("Feed the Horsey");
        CustomButtons.actionButton(feed);
        this.frame.add(feed,BorderLayout.SOUTH);

        JButton sleep = new JButton("Sleep to next day");
        CustomButtons.actionButton(sleep);
        this.frame.add(sleep,BorderLayout.EAST);

        JLabel info = new JLabel("HORSEY",JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        plains.addActionListener(e ->{
            new Plains().show();
            this.frame.dispose();
        });

        feed.addActionListener(e ->{

        });

        sleep.addActionListener(e ->{

        });

        this.frame.setVisible(true);
    }
}
