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
    private Client client = new Client();
    
    public KryoClientListener() {

    }
    
    public void connected(Connection c) {
        JOptionPane.showMessageDialog(null, "Connected!");
    }
    
    public void disconnected(Connection c){
        c.close();
        JOptionPane.showMessageDialog(null, "Disconnected!");
    }
    
    public void received(Connection c, Object o){
        if (o instanceof Packet.Packet02Message) {
            JOptionPane.showMessageDialog(null, "Variation recieved "+((Packet.Packet02Message) o).message.selectedNumbers.toString());
        }
    }
    
}
