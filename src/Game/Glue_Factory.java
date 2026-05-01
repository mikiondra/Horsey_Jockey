package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Class, where can player sold dead bodies of horsies and enhanced their horsies
 */
public class Glue_Factory {

    private JFrame frame;

    public Glue_Factory() {
        this.frame = new JFrame("Glue factory");
    }

    public void show(Player p,Horsey h){
        this.frame.setSize(1280,1000);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton towncenter = new JButton("Go to the Towncenter");
        CustomButtons.goButton(towncenter);
        this.frame.add(towncenter,BorderLayout.WEST);

        JButton enhance = new JButton("Enhance the Horsey");
        CustomButtons.actionButton(enhance);
        this.frame.add(enhance,BorderLayout.SOUTH);

        JButton sell = new JButton("Sell the dead Horsey");
        CustomButtons.actionButton(sell);
        this.frame.add(sell,BorderLayout.EAST);

        JLabel info = new JLabel("Money: " + p.getMoney() + " ; Food: " + p.getFood() + " ; Lassos: " + p.getLasso() + " ; Day: " + p.getDay() + " Horsey:" + p.getHorsey().getName() + " ; Str: " + p.getHorsey().getStr() + " ; Hunger: " + p.getHorsey().getHunger() + " ; Status: " + p.getHorsey().isAlive() ,JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        towncenter.addActionListener(e ->{
            new Towncenter().show(p,h);
            this.frame.dispose();
        });

        enhance.addActionListener(e ->{

        });

        sell.addActionListener(e ->{

        });

        this.frame.setVisible(true);
    }
}
