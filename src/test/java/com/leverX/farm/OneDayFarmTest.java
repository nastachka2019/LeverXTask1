package com.leverX.farm;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class OneDayFarmTest {

OneDayFarm oneDayFarm;
    @BeforeMethod
    public void setUp() {
        oneDayFarm=new OneDayFarm();
    }

    @AfterMethod
    public void tearDown() {
        oneDayFarm=null;
    }

    @Test
    public void testCreateOneDayFarm() {
        oneDayFarm.createOneDayFarm();
    }
}