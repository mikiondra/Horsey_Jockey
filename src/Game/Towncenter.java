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

    public void show(){
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
        CustomButtons.goButton(market);
        this.frame.add(market,BorderLayout.CENTER);

        JLabel info = new JLabel("HORSEY",JLabel.CENTER);
        this.frame.add(info,BorderLayout.NORTH);

        plains.addActionListener(e ->{
            new Plains().show();
            this.frame.dispose();
        });

        glue_factory.addActionListener(e ->{
            new Glue_Factory().show();
            this.frame.dispose();
        });

        arena.addActionListener(e ->{
            new Arena().show();
            this.frame.dispose();
        });

        market.addActionListener(e ->{
            new Market().show();
            this.frame.dispose();
        });

        this.frame.setVisible(true);
    }
}
