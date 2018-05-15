/*
 * Responsible for listening the events sent to the server
 */
package Connect;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import java.io.IOException;

/**
 *
 * @author Elina
 */
public class KryoServerListener {

    public KryoServerListener() throws IOException {
        KryoServer kserver = new KryoServer();
        kserver.getServer().addListener(new Listener() {
            public void recieved (Connection conn, Object obj) {
                if(obj instanceof String) {
                    String request = (String)obj;
                    System.out.println("Server"+request);
                    
                    conn.sendTCP("server sent Client a message.."); 
                }
            }
        });
    
    }
    
}
