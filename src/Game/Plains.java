package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Class, where player can catch and bury horsies
 */
public class Plains {

    private JFrame frame;

    public Plains() {
        this.frame = new JFrame("Plains");
    }

    public void show(Player p ,Horsey h){
        this.frame.setSize(1280,1000);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton ranch = new JButton("Go to the Ranch");
        CustomButtons.goButton(ranch);
        this.frame.add(ranch,BorderLayout.WEST);

        JButton towncenter = new JButton("Go to the Towncenter");
        CustomButtons.goButton(towncenter);
        this.frame.add(towncenter,BorderLayout.EAST);

        JButton bury = new JButton("Bury the Horsey");
        CustomButtons.actionButton(bury);
        this.frame.add(bury,BorderLayout.SOUTH);

        JButton catched = new JButton("Catch the Horsey");
        CustomButtons.actionButton(catched);
        this.frame.add(catched,BorderLayout.CENTER);

        JLabel info = new JLabel("Money: " + p.getMoney() + " ; Food: " + p.getFood() + " ; Lassos: " + p.getLasso() + " ; Day: " + p.getDay() + " Horsey:" + p.getHorsey().getName() + " ; Str: " + p.getHorsey().getStr() + " ; Hunger: " + p.getHorsey().getHunger() + " ; Status: " + p.getHorsey().isAlive() ,JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        ranch.addActionListener(e ->{
            new Ranch().show(p,h);
            this.frame.dispose();
        });

        towncenter.addActionListener(e ->{
            new Towncenter().show(p,h);
            this.frame.dispose();
        });

        bury.addActionListener(e ->{
            if(!p.getHorsey().getName().isEmpty()){
                if(!p.getHorsey().isAlive()){
                    String deadName = p.getHorsey().getName();
                    p.setHorsey(new Horsey("",0,0,false));
                    JOptionPane.showMessageDialog(this.frame, "You have buried " + deadName + " here.");
                }else{
                    JOptionPane.showMessageDialog(this.frame, "Your Horsey isn't dead.");
                }
            }else{
                JOptionPane.showMessageDialog(this.frame, "You don't have Horsey to bury here.");
            }
        });

        catched.addActionListener(e ->{

        });
        this.frame.setVisible(true);
    }
}
