package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Class, where game will begin and where player can feed the horsey and skip days
 */
public class Ranch {

    private JFrame frame;

    public Ranch(){
     this.frame = new JFrame("Ranch");
    }

    /**
     * Method, which features three actions:
     * 'plains' moves player to 'Plains' window
     * 'feed' allows player to feed their Horsey
     * 'sleep' allows player to sleep to next day, which will affect 'Market', 'Arena' and 'Glue_Factory'
     * @param p is player entity
     */
    public void show(Player p){
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

        JLabel info = new JLabel("Money: " + p.getMoney() + " ; Food: " + p.getFood() + " ; Lassos: " + p.getLasso() + " ; Day: " + p.getDay() + " Horsey: " + p.getHorsey().getName() + " ; Str: " + p.getHorsey().getStr() + " ; Hunger: " + p.getHorsey().getHunger() + " ; Status: " + p.getHorsey().isAlive() ,JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        plains.addActionListener(e ->{
            new Plains().show(p);
            this.frame.dispose();
        });

        feed.addActionListener(e ->{
            if(!p.getHorsey().getName().isEmpty()){
                if(p.getHorsey().isAlive()){
                    if(p.getHorsey().getHunger() < 5){
                        if(p.getFood() != 0){
                            p.getHorsey().setHunger(p.getHorsey().getHunger()+1);
                            p.setFood(p.getFood()-1);
                            JOptionPane.showMessageDialog(this.frame, "You have fed your Horsey.");
                        }else{
                            JOptionPane.showMessageDialog(this.frame, "You don't have any food to feed Horsey.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(this.frame, "Your Horsey is well fed.");
                    }
                }else{
                    JOptionPane.showMessageDialog(this.frame, "You don't have any Horsey to feed.");
                }
            }else{
                JOptionPane.showMessageDialog(this.frame, "You don't have Horsey to feed.");
            }
        });

        sleep.addActionListener(e ->{
            Random rd = new Random();
            p.setDay(p.getDay()+1);
            p.setLassoAvailability(5);
            p.setFoodAvailability(5);
            p.setEnhancePrice(p.getEnhancePrice()+1);
            p.setRaces(3);
            if(p.getLassoPrice() <= 0){
                p.setLassoPrice(13);
            }else{
                p.setLassoPrice(p.getLassoPrice() + rd.nextInt(-5,11));
            }
            if(p.getFoodPrice() <= 0){
                p.setFoodPrice(7);
            }else{
                p.setFoodPrice(p.getFoodPrice() + rd.nextInt(-3, 6));
            }
            JOptionPane.showMessageDialog(this.frame,"You have slept to next day.  " + p.getDay() + ". is today.");
        });

        this.frame.setVisible(true);
    }
}
