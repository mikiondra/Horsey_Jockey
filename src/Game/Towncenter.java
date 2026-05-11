package Game;

import javax.swing.*;
import java.awt.*;

/**
 * Class, where player can go to stores, arena and many more
 */
public class Towncenter {

    private JFrame frame;

    public Towncenter() {
        this.frame = new JFrame("Towncenter");
    }

    /**
     * Method, which features four actions:
     * 'plains' moves player to 'Plains' window
     * 'glue_factory' moves player to 'Glue_Factory' window
     * 'arena' moves player to 'Arena' window
     * 'market' moves player to 'Market' window
     * @param p is player entity
     */
    public void show(Player p){
        this.frame.setSize(1280,1000);
        this.frame.setLayout(new BorderLayout());
        this.frame.setLocationRelativeTo(null);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton plains = new JButton("Go to the Plains");
        CustomButtons.goButton(plains);
        this.frame.add(plains,BorderLayout.EAST);

        JButton glue_factory = new JButton("Go to the Glue Factory");
        CustomButtons.goButton(glue_factory);
        this.frame.add(glue_factory,BorderLayout.WEST);

        JButton arena = new JButton("Go to the Arena");
        CustomButtons.goButton(arena);
        this.frame.add(arena,BorderLayout.SOUTH);

        JButton market = new JButton("Go to the Market");
        CustomButtons.marketButton(market);
        this.frame.add(market,BorderLayout.CENTER);

        JLabel info = new JLabel("Money: " + p.getMoney() + " ; Food: " + p.getFood() + " ; Lassos: " + p.getLasso() + " ; Day: " + p.getDay() + " Horsey: " + p.getHorsey().getName() + " ; Str: " + p.getHorsey().getStr() + " ; Hunger: " + p.getHorsey().getHunger() + " ; Status: " + p.getHorsey().isAlive() ,JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        plains.addActionListener(e ->{
            new Plains().show(p);
            this.frame.dispose();
        });

        glue_factory.addActionListener(e ->{
            new Glue_Factory().show(p);
            this.frame.dispose();
        });

        arena.addActionListener(e ->{
            new Arena().show(p);
            this.frame.dispose();
        });

        market.addActionListener(e ->{
            new Market().show(p);
            this.frame.dispose();
        });

        this.frame.setVisible(true);
    }
}
