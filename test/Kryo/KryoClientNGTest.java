/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kryo;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.Client;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Elina
 */
public class KryoClientNGTest {
    
    public KryoClientNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getClient method, of class KryoClient.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        KryoClient instance = new KryoClient();
        Client expResult = null;
        Client result = instance.getClient();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getKryo method, of class KryoClient.
     */
    @Test
    public void testGetKryo() {
        System.out.println("getKryo");
        KryoClient instance = new KryoClient();
        Kryo expResult = null;
        Kryo result = instance.getKryo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClient method, of class KryoClient.
     */
    @Test
    public void testSetClient() {
        System.out.println("setClient");
        Client client = null;
        KryoClient instance = new KryoClient();
        instance.setClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setKryo method, of class KryoClient.
     */
    @Test
    public void testSetKryo() {
        System.out.println("setKryo");
        Kryo kryo = null;
        KryoClient instance = new KryoClient();
        instance.setKryo(kryo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
