package Game;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Class, where can player sold dead bodies of horsies and enhanced their horsies
 */
public class Glue_Factory {

    private JFrame frame;

    public Glue_Factory() {
        this.frame = new JFrame("Glue factory");
    }

    /**
     * Method, which features three actions:
     * 'towncenter' moves player to 'Towncenter' window
     * 'enhance' enhances player's Horsey, but it can kill him too, for price
     * 'sell' enables player to sell their Horsey's dead body for price
     * @param p is player entity
     */
    public void show(Player p){
        this.frame.setSize(1280,1000);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton towncenter = new JButton("Go to the Towncenter");
        CustomButtons.goButton(towncenter);
        this.frame.add(towncenter,BorderLayout.WEST);

        JButton enhance = new JButton("Enhance the Horsey: " + p.getEnhancePrice());
        CustomButtons.actionButton(enhance);
        this.frame.add(enhance,BorderLayout.SOUTH);

        JButton sell = new JButton("Sell the dead Horsey");
        CustomButtons.actionButton(sell);
        this.frame.add(sell,BorderLayout.EAST);

        JLabel info = new JLabel("Money: " + p.getMoney() + " ; Food: " + p.getFood() + " ; Lassos: " + p.getLasso() + " ; Day: " + p.getDay() + " Horsey: " + p.getHorsey().getName() + " ; Str: " + p.getHorsey().getStr() + " ; Hunger: " + p.getHorsey().getHunger() + " ; Status: " + p.getHorsey().isAlive() ,JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        towncenter.addActionListener(e ->{
            new Towncenter().show(p);
            this.frame.dispose();
        });

        enhance.addActionListener(e ->{
            Random rd = new Random();
            int chance;
            int strGain;
            if(!p.getHorsey().getName().isEmpty()){
                if(p.getHorsey().isAlive()){
                    if(p.getHorsey().getStr() <= 90){
                        if(p.getMoney() > p.getEnhancePrice()){
                            p.setMoney(p.getMoney() - p.getEnhancePrice());
                            if(p.getHorsey().getHunger() > 2){
                                chance = rd.nextInt(0,101);
                                if(chance > 50){
                                    strGain = rd.nextInt(1,11);
                                    p.getHorsey().setStr(p.getHorsey().getStr() + strGain);
                                    p.getHorsey().setHunger(p.getHorsey().getHunger() - 2);
                                    JOptionPane.showMessageDialog(this.frame, "Your Horsey has been enhanced by: " + strGain);
                                }else{
                                    p.getHorsey().setAlive(false);
                                    JOptionPane.showMessageDialog(this.frame, "Your Horsey died during the enhancing process.");
                                }
                            }else{
                                p.getHorsey().setAlive(false);
                                JOptionPane.showMessageDialog(this.frame, "Your Horsey died during the enhancing process.");
                            }
                        }else{
                            JOptionPane.showMessageDialog(this.frame, "You don't have money to enhance your Horsey.");
                        }
                    }else{
                        JOptionPane.showMessageDialog(this.frame, "Your Horsey is strong enough.");
                    }
                }else{
                    JOptionPane.showMessageDialog(this.frame, "You can't enhance dead Horsey.");
                }
            }else{
                JOptionPane.showMessageDialog(this.frame, "You don't have Horsey to enhance.");
            }
        });

        sell.addActionListener(e ->{
            if(!p.getHorsey().getName().isEmpty()){
                if(!p.getHorsey().isAlive()){
                    String name = p.getHorsey().getName();
                    Horsey h = new Horsey("",0,0,false);
                    p.setHorsey(h);
                    p.setMoney(p.getMoney()+15);
                    JOptionPane.showMessageDialog(this.frame, "You have sold " + name + " dead body and gained 10 money.");
                }else{
                    JOptionPane.showMessageDialog(this.frame, "You can't sell living Horsey.");
                }
            }else{
                JOptionPane.showMessageDialog(this.frame, "You don't have Horsey to sell.");
            }
        });

        this.frame.setVisible(true);
    }
}
