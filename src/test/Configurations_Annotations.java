package test;

import org.testng.annotations.*;

public class Configurations_Annotations {

    @Test
    public void searchCostumer(){
        System.out.println("Search for Costumer");
    }

    @Test
    public void searchProduct(){
        System.out.println("Search for Product");
    }
    @BeforeMethod
    public  void beforeMethod(){
        System.out.println("Sign in");
    }
    @AfterMethod
    public  void afterMethod(){
        System.out.println("Sign out");
    }
    @BeforeClass
    public  void beforeClass(){
        System.out.println("Open test application");
    }
    @AfterClass
    public  void afterClass(){
        System.out.println("Close test application");
    }
    @BeforeTest
    public  void beforeTest(){
        System.out.println("Open Chrome");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("Close Chrome");
    }
    @BeforeSuite
    public  void beforeSuite(){
        System.out.println("Chrome - Set Up System Property");
    }
    @AfterSuite
    public  void afterSuite(){
        System.out.println("Chrome - Clean Up System Property");
    }
}
