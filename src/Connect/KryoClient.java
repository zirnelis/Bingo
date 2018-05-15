/*
 * Responsible for client connection
 */
package Connect;

import com.esotericsoftware.kryo.*;
import com.esotericsoftware.kryonet.*;
import com.esotericsoftware.minlog.Log;
import java.io.IOException;

/**
 *
 * @author Elina
 */


public class KryoClient {

    
    Client client = new Client();
    Kryo kryo = client.getKryo();
    
    public KryoClient() throws IOException {
        
        
        kryo.register(String.class);
        
        client.start();
        
        new Thread() {
            public void run() {
                try {
                    client.connect(6000, "localhost", 54555, 54777); // ???
                    
                } catch (IOException ex) {
                    Log.warn("exception", ex);
                }
            }
        }.start();
        client.sendTCP("winningNumbers..");
        System.out.println("Client sent message to server");
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
    
    
    
    
}
