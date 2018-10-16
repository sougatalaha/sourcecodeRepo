package com.mycorp;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /** 
     * Overwhelming complex test, which covers my
     * product requirement #1
     */
    // Trace(GitHub:sougatalaha/sourcecodeRepo#1)
    public void testApp() {
        assertTrue(true);
    }

    // Trace(GitHub:sougatalaha/sourcecodeRepo#2)
    public void testApp2() {
        assertTrue(false);
    }
}
