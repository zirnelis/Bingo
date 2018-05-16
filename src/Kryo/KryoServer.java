/*
 * Responsible for server connection
 */
package Kryo;

import LatLoto.Variation;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Server;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * @author Elina
 */
public class KryoServer implements Serializable {
    Server server = new Server();
    Kryo kryo = new Kryo();
    KryoServerListener ksl = new KryoServerListener();
    
    
    public KryoServer() throws IOException {
        server.bind(54555, 54777);
        registerPackets();
        server.start();
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
    
    private void registerPackets() {
        kryo.register(Packet.class);
    }
}
