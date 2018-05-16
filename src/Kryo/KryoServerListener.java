/*
 * Responsible for listening the events sent to the server
 */
package Kryo;

import Kryo.Packet.*;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Elina
 */
public class KryoServerListener extends Listener {

    ArrayList<Integer> winningNumbers = new ArrayList<Integer>();
    Random rand = new Random();
    Connection conn;
    KryoServer kserver = new KryoServer();
    
    public KryoServerListener() throws IOException {
        
        for(int i = 0; i < 5; i++) {
            winningNumbers.add(rand.nextInt(35)+1);
        }

    }
    
    @Override
    public void connected(Connection c) {
        System.out.println("Numbers: ");
        for (int i = 0; i < winningNumbers.size(); i++) {
            System.out.println(winningNumbers.get(i)+" ");
        }
        System.out.println("\n");
    }
    
    public void disconnected(Connection c){
        c.close();
        JOptionPane.showMessageDialog(null, "Disconnected!");
    }
    
    public void received(Connection c, Object o){
        int count = 0;
        if(o instanceof Packet01Message) {
            String request = (String)o;
            System.out.println("Server"+request);
                    
            c.sendTCP(winningNumbers); 
        }

        if (o instanceof Packet02Message){
            for (int i = 0; i <= winningNumbers.size() - 1; i++) {
                for (int j = 0; j <= ((Packet02Message) o).message.selectedNumbers.size() - 1; j++) {
                    if (Objects.equals(winningNumbers.get(i), ((Packet02Message) o).message.selectedNumbers.get(j))) {
                        System.out.println("Matching number: " + ((Packet02Message) o).message.selectedNumbers.get(j));
                        count++;
                        break;
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "You have guessed " + count + " numbers!");
        }
        
    }
 
}
