/*
 * Responsible for client connection
 */
package Kryo;

import LatLoto.Variation;
import com.esotericsoftware.kryo.*;
import com.esotericsoftware.kryonet.*;
import com.esotericsoftware.minlog.Log;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Elina
 */


public class KryoClient {
    
    
    Client client = new Client();
    KryoClientListener kcl;

    Kryo kryo = client.getKryo();
    
    public KryoClient(Packet.Packet02Message msg) throws IOException  {
        this.kcl = new KryoClientListener();
        client.addListener(kcl);
        registerPackets();
        client.start();
        
        client.connect(500, "localhost", 8070);
        
        Packet.Packet01Message first = new Packet.Packet01Message();
        first.message = "First test message (String type)";
        
        client.sendTCP(first); //send test message
        
        client.sendTCP(msg); //send variation
    }

    public KryoClient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Client getClient() {
        return client;
    }

    public Kryo getKryo() {
        return kryo;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setKryo(Kryo kryo) {
        this.kryo = kryo;
    }
    
    private void registerPackets() {
        kryo.register(Packet.class);
        kryo.register(String.class);
        kryo.register(ArrayList.class);
        kryo.register(Variation.class);
        
    }
    
    
}
