/*
 * Responsible for server connection
 */
package Connect;

import java.io.Serializable;

/**
 *
 * @author Elina
 */
public class KryoServer implements Serializable {
    private String serverName;
    private String serverHostname;
    private int port;

    public KryoServer() {
        this.serverName = "";
        this.port = 0;
        this.serverHostname = "";
    }

    public KryoServer(String serverName, String serverHostname, int port) {
        this.serverName = serverName;
        this.port = port;
        this.serverHostname = serverHostname;
    }

    public String getServerName() {
        return serverName;
    }

    public String getServerHostname() {
        return serverHostname;
    }

    public int getPort() {
        return port;
    }
}
