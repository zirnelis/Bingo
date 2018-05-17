/*
 * Responsible for server connection
 */
package Kryo;

import LatLoto.Variation;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Server;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Elina
 */
public class KryoServer {
    Server server = new Server();
    Kryo kryo = new Kryo();
    //KryoServerListener ksl = new KryoServerListener();
    
    public KryoServer() throws IOException {
        
        server.start();
        server.bind(54555);
        
        registerPackets();
        
        server.addListener(new KryoServerListener());
        System.out.println("Kryo server started");
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
