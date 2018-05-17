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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Elina
 */


public final class KryoClient {
    
    
    Client client = new Client();
    KryoClientListener kcl;

    Kryo kryo = client.getKryo();
    
    public KryoClient() throws IOException  {
        Thread startThread = new Thread (new Runnable() {
            public void run() {
                client.start();
            }
        }); 
        
        registerPackets();
        
        Thread connectThread = new Thread (new Runnable() {
            public void run() {
                try {
                    client.connect(5000, "localhost", 54555 );
                } catch (IOException ex) {
                    Logger.getLogger(KryoClient.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 

        
        
//        
//        this.kcl = new KryoClientListener();
//        client.addListener(kcl);
         
        System.out.println("Kryo client started");
    }

    public Client getClient() {
        return client;
    }

   /*public Kryo getKryo() {
        return kryo;
    }*/

    public void setClient(Client client) {
        this.client = client;
    }

    public void setKryo(Kryo kryo) {
       // this.kryo = kryo;
    }
    
    private void registerPackets() {
        kryo.register(Packet.class);
    }
    
    public void sendMessage(String s)
    {
        //Packet.Packet01Message first = new Packet.Packet01Message();
        //first.message =testMessage;
        
        Packet.Packet01Message varPacket = new Packet.Packet01Message();
        
        varPacket.message = s;
        
        client.sendTCP(varPacket); //send test message
        
        System.out.println("Variation sent!");

    }
    
}
