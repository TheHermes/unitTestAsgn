package com.arcada.com.unittest.app;




import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */ 
	App app = new App();
    
    // Positive tests
    @Test
    public void existsFetchFriends() {
    	assertNotNull(app.fetch("Hermes"), "The array should exist");
    }
    
    @Test
    public void fetchEquals() {
    	String[] friends = {"Olivia Miller", "Ethan Johnson", "Ava Roberts", "Liam Walker", "Sophia Thompson", "Jackson Davis", "Mia White", "James Anderson", "Amelia Lewis", "Lucas Moore", "Isabella Harris", "Benjamin Clark", "Emily Young", "Alexander Hall", "Charlotte Allen", "Henry Wright", "Abigail Scott", "Daniel King","Harper Green", "William Baker"};
    	assertArrayEquals(friends,app.fetch("Hermes"), "The arrays should be identical.");
    }
    
    @Test
    public void personExistsInArray() {
    	String[] friends = {"Olivia Miller", "Ethan Johnson", "Ava Roberts", "Liam Walker", "Sophia Thompson", "Jackson Davis", "Mia White", "James Anderson", "Amelia Lewis", "Lucas Moore", "Isabella Harris", "Benjamin Clark", "Emily Young", "Alexander Hall", "Charlotte Allen", "Henry Wright", "Abigail Scott", "Daniel King","Harper Green", "William Baker"};
    	assertTrue(Arrays.asList(friends).contains("Ava Roberts"), "The person should exist in the array");
    }
    
    // Negative tests
    @Test
    public void notExistsFetchFriends() {
    	assertNull(app.fetch("Petra"));
    }
    
    @Test
    public void fetchNotEquals() {
    	String[] friends = {"Olivia Moller", "Ethan Johnson", "Ava Roberts", "Liam Walker", "Sophia Thompson", "Jackson Davis", "Mia White", "James Anderson", "Amelia Lewis", "Lucas Moore", "Isabella Harris", "Benjamin Clark", "Emily Young", "Alexander Hall", "Charlotte Allen", "Henry Wright", "Abigail Scott", "Daniel King","Harper Green", "William Baker"};
    	assertFalse(friends == app.fetch("Hermes"));
    }
    
    @Test
    public void personExistsNotInArray() {
    	String[] friends = {"Olivia Miller", "Ethan Johnson", "Ava Roberts", "Liam Walker", "Sophia Thompson", "Jackson Davis", "Mia White", "James Anderson", "Amelia Lewis", "Lucas Moore", "Isabella Harris", "Benjamin Clark", "Emily Young", "Alexander Hall", "Charlotte Allen", "Henry Wright", "Abigail Scott", "Daniel King","Harper Green", "William Baker"};
    	assertFalse(Arrays.asList(friends).contains("John Malkovich"), "The person should exist in the array");
    }
    
    // Performance test
    @Test
    public void testFetchPerformance() {
    	
    	long startTime = System.nanoTime();
    	app.fetch("Hermes");
    	long endTime = System.nanoTime();
    	
    	long duration = endTime - startTime; 
    	
    	assertTrue(duration < 1000000, "Fetch should execute within 1 ms.");
    }
    @Test
    public void testFetchPerformanceFail() {
    	
    	long startTime = System.nanoTime();
    	app.fetch("performancefail");
    	long endTime = System.nanoTime();
    	
    	long duration = endTime - startTime; 
    	
    	assertFalse(duration < 1000000, "Fetch should execute within 1 ms but won't.");
    }
    
}
