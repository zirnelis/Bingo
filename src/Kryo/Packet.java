/*
 * Message wrapper when sending it accross the net
 */
package Kryo;

import LatLoto.Variation;

/**
 *
 * @author Elina
 */
public class Packet {
    
    public static class Packet01Message {
        String message;
    }
    
    public static class Packet02Message {
        Variation message;
    }
    
}
