/*
 * Responsible for listening the events sent to the client
 */
package Connect;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import java.io.IOException;

/**
 *
 * @author Elina
 */
public class KryoClientListener {

    public KryoClientListener() throws IOException {
        KryoClient kClient = new KryoClient();
        
        kClient.getClient().addListener(new Listener() {
                        public void recieved(Connection connection, Object obj) {
                            if(obj instanceof String) {
                                String response = (String) obj;
                                System.out.println(response);
                            }
                        }
                    });
    }
    
}
