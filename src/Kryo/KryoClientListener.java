/*
 * Responsible for listening the events sent to the client
 */
package Kryo;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import java.io.IOException;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Elina
 */
public class KryoClientListener extends Listener{
 
    public KryoClientListener() {
        System.out.println("Listener also added");
    }
    
    public void connected(Connection c) {
        System.out.println("Client connected!");
        //JOptionPane.showMessageDialog(null, "Connected!");
    }
    
    public void disconnected(Connection c){
        System.out.println("Client disconnected");
        //c.close();
        //JOptionPane.showMessageDialog(null, "Disconnected!");
    }
    
    public void received(Connection c, Object o){
       /* if (o instanceof Packet.Packet02Message) {
            JOptionPane.showMessageDialog(null, "Variation recieved "+((Packet.Packet02Message) o).message.selectedNumbers.toString());
        }*/
    }
    
}
