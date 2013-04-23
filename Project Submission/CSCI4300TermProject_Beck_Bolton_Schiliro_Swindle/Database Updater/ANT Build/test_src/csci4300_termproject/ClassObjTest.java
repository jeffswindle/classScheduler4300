/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csci4300_termproject;

import java.math.BigDecimal;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import junit.framework.TestCase;

/**
 * Auto-Generated Test cases for ClassObj.java
 */
public class ClassObjTest extends TestCase {
    
    public ClassObjTest() {
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
     * Test of getTerm method, of class ClassObj.
     */
    @Test
    public void testGetTerm() {
        System.out.println("getTerm");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        int expResult = 201308;
        int result = instance.getTerm();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCallNumber method, of class ClassObj.
     */
    @Test
    public void testGetCallNumber() {
        System.out.println("getCallNumber");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        int expResult = 21642;
        int result = instance.getCallNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCoursePrefix method, of class ClassObj.
     */
    @Test
    public void testGetCoursePrefix() {
        System.out.println("getCoursePrefix");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "CHEM";
        String result = instance.getCoursePrefix();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCourseNumber method, of class ClassObj.
     */
    @Test
    public void testGetCourseNumber() {
        System.out.println("getCourseNumber");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "4000L";
        String result = instance.getCourseNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCourseTitle method, of class ClassObj.
     */
    @Test
    public void testGetCourseTitle() {
        System.out.println("getCourseTitle");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "CHEM INTERNSHIP";
        String result = instance.getCourseTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getInstructor method, of class ClassObj.
     */
    @Test
    public void testGetInstructor() {
        System.out.println("getInstructor");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "";
        String result = instance.getInstructor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getAvailable method, of class ClassObj.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "Available";
        String result = instance.getAvailable();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCreditHours method, of class ClassObj.
     */
    @Test
    public void testGetCreditHours() {
        System.out.println("getCreditHours");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        BigDecimal expResult = new BigDecimal(15);
        BigDecimal result = instance.getCreditHours();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSession method, of class ClassObj.
     */
    @Test
    public void testGetSession() {
        System.out.println("getSession");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "Thru";
        String result = instance.getSession();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDays method, of class ClassObj.
     */
    @Test
    public void testGetDays() {
        System.out.println("getDays");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "VR";
        String result = instance.getDays();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPeriodBegin method, of class ClassObj.
     */
    @Test
    public void testGetPeriodBegin() {
        System.out.println("getPeriodBegin");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "";
        String result = instance.getPeriodBegin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPeriodEnd method, of class ClassObj.
     */
    @Test
    public void testGetPeriodEnd() {
        System.out.println("getPeriodEnd");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "";
        String result = instance.getPeriodEnd();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCasTaken method, of class ClassObj.
     */
    @Test
    public void testGetCasTaken() {
        System.out.println("getCasTaken");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        int expResult = 0;
        int result = instance.getCasTaken();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCasReq method, of class ClassObj.
     */
    @Test
    public void testGetCasReq() {
        System.out.println("getCasReq");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        int expResult = 60;
        int result = instance.getCasReq();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDasTaken method, of class ClassObj.
     */
    @Test
    public void testGetDasTaken() {
        System.out.println("getDasTaken");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        int expResult = 10;
        int result = instance.getDasTaken();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDasReq method, of class ClassObj.
     */
    @Test
    public void testGetDasReq() {
        System.out.println("getDasReq");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        int expResult = 20;
        int result = instance.getDasReq();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTotTaken method, of class ClassObj.
     */
    @Test
    public void testGetTotTaken() {
        System.out.println("getTotTaken");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        int expResult = 12;
        int result = instance.getTotTaken();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTotReq method, of class ClassObj.
     */
    @Test
    public void testGetTotReq() {
        System.out.println("getTotReq");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        int expResult = 50;
        int result = instance.getTotReq();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTotAllow method, of class ClassObj.
     */
    @Test
    public void testGetTotAllow() {
        System.out.println("getTotAllow");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        int expResult = 72;
        int result = instance.getTotAllow();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBldg method, of class ClassObj.
     */
    @Test
    public void testGetBldg() {
        System.out.println("getBldg");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "1001";
        String result = instance.getBldg();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getRoom method, of class ClassObj.
     */
    @Test
    public void testGetRoom() {
        System.out.println("getRoom");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "VR";
        String result = instance.getRoom();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSchedule method, of class ClassObj.
     */
    @Test
    public void testGetSchedule() {
        System.out.println("getSchedule");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        BigDecimal expResult = new BigDecimal(01);
        BigDecimal result = instance.getSchedule();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCurrentProgram method, of class ClassObj.
     */
    @Test
    public void testGetCurrentProgram() {
        System.out.println("getCurrentProgram");
        ClassObj instance = new ClassObj(201308, 21642, "CHEM", "4000L", "CHEM INTERNSHIP", "", "Available", new BigDecimal(15), "Thru", "VR", "","", 0, 60, 10, 20, 12, 50, 72, "1001","VR", new BigDecimal(01), "UNIV");
        String expResult = "UNIV";
        String result = instance.getCurrentProgram();
        assertEquals(expResult, result);
        
    }
}
