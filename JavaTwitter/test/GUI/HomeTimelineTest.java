/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionListener;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ihsan Fajri
 */
public class HomeTimelineTest {
    
    public HomeTimelineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getBtnCompose method, of class HomeTimeline.
     */
    @Test
    public void testGetBtnCompose() {
        System.out.println("getBtnCompose");
        HomeTimeline instance = new HomeTimeline();
        Object expResult = null;
        Object result = instance.getBtnCompose();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnExit method, of class HomeTimeline.
     */
    @Test
    public void testGetBtnExit() {
        System.out.println("getBtnExit");
        HomeTimeline instance = new HomeTimeline();
        Object expResult = null;
        Object result = instance.getBtnExit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnFollow method, of class HomeTimeline.
     */
    @Test
    public void testGetBtnFollow() {
        System.out.println("getBtnFollow");
        HomeTimeline instance = new HomeTimeline();
        Object expResult = null;
        Object result = instance.getBtnFollow();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnRefresh method, of class HomeTimeline.
     */
    @Test
    public void testGetBtnRefresh() {
        System.out.println("getBtnRefresh");
        HomeTimeline instance = new HomeTimeline();
        Object expResult = null;
        Object result = instance.getBtnRefresh();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTimeline method, of class HomeTimeline.
     */
    @Test
    public void testSetTimeline() {
        System.out.println("setTimeline");
        String s = "";
        HomeTimeline instance = new HomeTimeline();
        instance.setTimeline(s);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addListener method, of class HomeTimeline.
     */
    @Test
    public void testAddListener() {
        System.out.println("addListener");
        ActionListener e = null;
        HomeTimeline instance = new HomeTimeline();
        instance.addListener(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisible method, of class HomeTimeline.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean b = false;
        HomeTimeline instance = new HomeTimeline();
        instance.setVisible(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
