  package com.tcs.fresco;

import static junit.framework.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class SolutionTest extends TestCase{
    Map<Integer, String> customerTag = null;
	int custId = 0;
	Solution solution = new Solution();
    
    @Before
	public void setUp() throws Exception {
		custId = 10511;
		customerTag = new HashMap<Integer, String>();
	}
    
    //Write your test cases here
    
    public void test() {
    	assertTrue( true );
    }
    
    
    @After
	public void tearDown() throws Exception {

		customerTag.clear();
	}
}