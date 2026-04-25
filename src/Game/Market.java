package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Class, where player can but food and lassos
 */
public class Market {

    private JFrame frame;

    public Market() {
        this.frame = new JFrame("Market");
    }

    public void show(){
        this.frame.setSize(1280,1000);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton towncenter = new JButton("Go to the Towncenter");
        CustomButtons.goButton(towncenter);
        this.frame.add(towncenter,BorderLayout.CENTER);

        JButton buy_lasso = new JButton("Buy lassos");
        CustomButtons.actionButton(buy_lasso);
        this.frame.add(buy_lasso,BorderLayout.EAST);

        JButton buy_food = new JButton("Buy food");
        CustomButtons.actionButton(buy_food);
        this.frame.add(buy_food,BorderLayout.WEST);

        JLabel info = new JLabel("HORSEY",JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        towncenter.addActionListener(e ->{
            new Towncenter().show();
            this.frame.dispose();
        });

        buy_lasso.addActionListener(e ->{

        });

        buy_food.addActionListener(e ->{

        });

        this.frame.setVisible(true);
    }
}
