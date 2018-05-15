/*
 * Responsible for server connection
 */
package Connect;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Server;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Elina
 */
public class KryoServer implements Serializable {
    Server server = new Server();
    Kryo kryo = server.getKryo();

    public KryoServer() throws IOException {
        
        kryo.register(String.class);
        server.start();
        
        server.bind(54555, 54777);
    }

    public Server getServer() {
        return server;
    }

    public Kryo getKryo() {
        return kryo;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public void setKryo(Kryo kryo) {
        this.kryo = kryo;
    }
    
    
}
