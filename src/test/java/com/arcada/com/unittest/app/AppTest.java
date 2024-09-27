package com.arcada.com.unittest.app;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    /**
     * Rigorous Test :-)
     */ 
	App app = new App();
    
    // Positive tests
    @Test
    public void testFetchFriendsExists() 
    {
    	assertNotNull(app.fetch("Hermes"), "The array should exist");
    }
    
    @Test
    public void testFetchEquals() 
    {
    	String[] expectedFriends = {"Olivia Miller", "Ethan Johnson", "Ava Roberts", "Liam Walker", "Sophia Thompson", "Jackson Davis", "Mia White", "James Anderson", "Amelia Lewis", "Lucas Moore", "Isabella Harris", "Benjamin Clark", "Emily Young", "Alexander Hall", "Charlotte Allen", "Henry Wright", "Abigail Scott", "Daniel King","Harper Green", "William Baker"};
    	assertArrayEquals(expectedFriends, app.fetch("Hermes"), "The arrays should be identical.");
    }
    
    @Test
    public void testPersonExistsInArray() 
    {
    	String[] friends = app.fetch("Hermes");
    	assertTrue(Arrays.asList(friends).contains("Ava Roberts"), "The person should exist in the array");
    }
    
    // Negative tests
    @Test
    public void testFetchWrongName() 
    {
    	assertNull(app.fetch("Petra"), "Petra does not have friends so fetch() returns null/nothing so the result should be false/null");
    }
    
    @Test
    public void testFetchEmpty() 
    {
    	assertNull(app.fetch(), "Leaving fetch() empty should return null");
    }
    
    @Test
    public void testFetchNotEquals() 
    {
    	String[] alteredFriends = {"Olivia Moller", "Ethan Johnson", "Ava Roberts", "Liam Walker", "Sophia Thompson", "Jackson Davis", "Mia White", "James Anderson", "Amelia Lewis", "Lucas Moore", "Isabella Harris", "Benjamin Clark", "Emily Young", "Alexander Hall", "Charlotte Allen", "Henry Wright", "Abigail Scott", "Daniel King","Harper Green", "William Baker"};
    	assertFalse(alteredFriends == app.fetch("Hermes"), "alteredFriends has been changed slightly from the original friends array and as such should not be the same and return false.");
    }
    
    @Test
    public void testPersonDoesNotExistInArray() 
    {
    	String friends[] = app.fetch("hermes");
    	assertFalse(Arrays.asList(friends).contains("John Malkovich"), "The person should not exist in the array");
    }
    
    // Performance test
    @Test
    public void testFetchPerformance() 
    {
    	/*
    	 * Starts out by taking the time and storing it in a variable, then it executes the basic fetch method,
    	 * then it takes the time and again stores it in a variable, calculate the difference in time between the
    	 * two variables and from that check if the duration is less than 1 ms (could be anything) and if it is 
    	 * return true.
    	*/
    	
    	long startTime = System.nanoTime();
    	app.fetch("Hermes");
    	long endTime = System.nanoTime();
    	
    	long duration = endTime - startTime; 
    	
    	assertTrue(duration < 1000000, "Fetch should execute within 1 ms.");
    }
    @Test
    public void testFetchPerformanceFail() 
    {
    	/*
    	 * Same principle except in the fetch method there is case for performancefail which
    	 * causes the method to wait for 0.5 seconds.
    	 */
    	
    	long startTime = System.nanoTime();
    	app.fetch("performancefail");
    	long endTime = System.nanoTime();
    	
    	long duration = endTime - startTime; 
    	
    	assertFalse(duration < 1000000, "Fetch should execute within 1 ms but won't.");
    }
    
}
