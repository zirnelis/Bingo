/*
 * Rakstits iepriekseja Java kura laika, sogad papildinats
 */
package GUI;


import LatLoto.Variation;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 *
 * @author Elina
 */
public class VariationGUI extends JPanel implements ActionListener {
    JButton[] ticketButtons = new JButton[35];
    Variation variation = new Variation();
    Random rand = new Random();

    public VariationGUI(){
        this.setLayout(new GridLayout(10,6));

        for (int i=0; i<35; i++){
            ticketButtons[i] = new JButton(i+1 + "");            
            
            this.add(ticketButtons[i]);
            ticketButtons[i].addActionListener(this);
        }
    }

    public void randomVariation(){
        if (variation.selectedNumbers.size() < 5) {
            variation.selectedNumbers.clear();

            for (int i = 0; i < 35; i++) {
                ticketButtons[i].setBackground(null);
            }

            for (int i = 0; i < 5; i++) {

                int sk = rand.nextInt(35) + 1;

                //Don't allow equal numbers to be generated for the ticket variant
                while (variation.selectedNumbers.contains(sk)){
                    sk = rand.nextInt(35) + 1;
                }

                variation.selectedNumbers.add(sk);
                ticketButtons[sk - 1].setBackground(Color.blue);
                this.repaint();
                this.revalidate();
            }
        }
    }

    public void actionPerformed(ActionEvent e) {

        for (int i=0; i<35; i++){
            if (e.getSource().equals(ticketButtons[i])){
                if(!(ticketButtons[i].getBackground().equals(Color.blue)) && variation.selectedNumbers.size()<5){
                    variation.selectedNumbers.add(Integer.parseInt(ticketButtons[i].getText()));
                    ticketButtons[i].setBackground(Color.blue);
                }
                else{
                    int tmp = i+1;
                    if(variation.selectedNumbers.contains(new Integer(tmp))){
                        variation.selectedNumbers.remove(variation.selectedNumbers.indexOf(tmp));
                        ticketButtons[i].setBackground(null);
                    }
                }
            }
        }
    }    

    public JButton[] getTicketButtons() {
        return ticketButtons;
    }

    public Variation getVariation() {
        return variation;
    }

    public Random getRand() {
        return rand;
    }

    public void setTicketButtons(JButton[] ticketButtons) {
        this.ticketButtons = ticketButtons;
    }

    public void setVariation(Variation variation) {
        this.variation = variation;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }
    
    
}
