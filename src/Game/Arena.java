package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Class, where horsies will race for fame and glory
 */
public class Arena {

    private JFrame frame;

    public Arena() {
        this.frame = new JFrame("Arena");
    }

    /**
     * Method, which features two actions:
     * 'towncenter' move player to 'Towncenter' window
     * 'race' allows player to race with their Horsey and bet on them, tho Horsey can die there too
     * @param p is player entity
     */
    public void show(Player p){
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

        JLabel info = new JLabel("Money: " + p.getMoney() + " ; Food: " + p.getFood() + " ; Lassos: " + p.getLasso() + " ; Day: " + p.getDay() + " Horsey: " + p.getHorsey().getName() + " ; Str: " + p.getHorsey().getStr() + " ; Hunger: " + p.getHorsey().getHunger() + " ; Status: " + p.getHorsey().isAlive() ,JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        towncenter.addActionListener(e ->{
            new Towncenter().show(p);
            this.frame.dispose();
        });

        race.addActionListener(e ->{
            Random rd = new Random();
            int bet;
            int earnings;
            int chance;
            int death;
            if(!p.getHorsey().getName().isEmpty()){
                if(p.getHorsey().isAlive()){
                   if(p.getMoney() > 10){
                       String betInput = JOptionPane.showInputDialog(this.frame, "How much are you betting.");
                       if(betInput == null || betInput.trim().isEmpty()){
                           JOptionPane.showMessageDialog(this.frame, "You have decided to not race.");
                       }else{
                           try{
                               bet = Integer.parseInt(betInput.trim());
                               if(bet > 10){
                                   earnings = bet*2;
                                   death = rd.nextInt(1,3);
                                   p.setMoney(p.getMoney() - bet);
                                   p.getHorsey().setHunger(p.getHorsey().getHunger() - 2);
                                   p.setRaces(p.getRaces()-1);
                                   chance = rd.nextInt(25,101);
                                   if(p.getHorsey().getStr() > chance){
                                       p.setMoney(p.getMoney() + earnings);
                                       JOptionPane.showMessageDialog(this.frame, "You have won " + earnings + " money.");
                                   }else{
                                       JOptionPane.showMessageDialog(this.frame, "You have lost your bet.");
                                   }
                                   if(p.getHorsey().getHunger() < death){
                                       p.getHorsey().setAlive(false);
                                       JOptionPane.showMessageDialog(this.frame, "Your Horsey didn't survived the race.");
                                   }
                               }else{
                                   JOptionPane.showMessageDialog(this.frame, "You bet is too small to count.");
                               }
                           }catch(NumberFormatException _){
                                JOptionPane.showMessageDialog(this.frame, "You need to bet with numbers, not gibberish.");
                           }
                       }
                   }else{
                       JOptionPane.showMessageDialog(this.frame, "You are too broke to race.");
                   }
                }else{
                    JOptionPane.showMessageDialog(this.frame, "You can't race with dead Horsey.");
                }
            }else{
                JOptionPane.showMessageDialog(this.frame, "You need Horsey to race here.");
            }
        });

        this.frame.setVisible(true);
    }
}
