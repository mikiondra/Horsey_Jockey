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

    public void show(Player p,Horsey h){
        this.frame.setSize(1280,1000);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton towncenter = new JButton("Go to the Towncenter");
        CustomButtons.goButton(towncenter);
        this.frame.add(towncenter,BorderLayout.CENTER);

        JButton buy_lasso = new JButton("Buy lassos");
        CustomButtons.actionButton(buy_lasso);
        this.frame.add(buy_lasso,BorderLayout.WEST);

        JButton buy_food = new JButton("Buy food");
        CustomButtons.actionButton(buy_food);
        this.frame.add(buy_food,BorderLayout.EAST);

        JLabel info = new JLabel("Money: " + p.getMoney() + " ; Food: " + p.getFood() + " ; Lassos: " + p.getLasso() + " ; Day: " + p.getDay() + " Horsey: " + p.getHorsey().getName() + " ; Str: " + p.getHorsey().getStr() + " ; Hunger: " + p.getHorsey().getHunger() + " ; Status: " + p.getHorsey().isAlive() ,JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        towncenter.addActionListener(e ->{
            new Towncenter().show(p,h);
            this.frame.dispose();
        });

        buy_lasso.addActionListener(e ->{
            int availability = 5;
            int price = 10;
            if(availability != 0){
                if(p.getMoney() > price){
                    p.setMoney(p.getMoney()-price);
                    p.setLasso(p.getLasso()+1);
                    availability = availability-1;
                    JOptionPane.showMessageDialog(this.frame, "You have bought one piece of lasso.");
                }else{
                    JOptionPane.showMessageDialog(this.frame, "You don't have enough to buy this stuff");
                }
            }else{
                JOptionPane.showMessageDialog(this.frame, "There isn't more of this stuff.");
            }
        });

        buy_food.addActionListener(e ->{
            int availability = 5;
            int price = 4;
            if(availability >0){
                if(p.getMoney() > price){
                    p.setMoney(p.getMoney()-price);
                    p.setFood(p.getFood()+1);
                    availability = availability-1;
                    JOptionPane.showMessageDialog(this.frame, "You have bought one piece of food.");
                }else{
                    JOptionPane.showMessageDialog(this.frame, "You don't have enough to buy this stuff");
                }
            }else{
                JOptionPane.showMessageDialog(this.frame, "There isn't more of this stuff.");
            }
        });

        this.frame.setVisible(true);
    }
}
