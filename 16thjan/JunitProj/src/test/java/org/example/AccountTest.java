package org.example;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
   Account ob;

   @BeforeAll
   static void setupOnlyOnceAtStart()
   {
       System.out.println("This setup code exceuted only once at the start");
   }
    @BeforeEach
    void setup()
    {
        System.out.println("setup method called..account object created");
         ob = new Account("Namrata",1,5000);
    }

    @DisplayName("Test Account class withdraw method")
    @Test
    public void testWithdraw()
    {
     //   Account ob = new Account("Namrata",1,5000);
        try {
            ob.withdraw(2000);
        }
        catch(InsufficientBalanceException ex)
        {
            System.out.println(ex.getMessage());
        }

        double balance = ob.getBalance();
       // assertEquals(3000.0,balance);
        assertEquals(3000.0,balance,"withdraw method not " +
                "working as expected!");
    }

    @DisplayName("Test Account's withdraw method when amt same as balance")
    @Test
    public void testWithdraw1()
    {
       // Account ob = new Account("Namrata",1,5000);
        try {
            ob.withdraw(5000);
        }
        catch(InsufficientBalanceException ex)
        {
            System.out.println(ex.getMessage());
        }

        double balance = ob.getBalance();
        assertEquals(0.0,balance,"withdraw method not " +
                "working as expected when amt is same as bal!");
    }


    @DisplayName("Test Account's withdraw method for account overdrawn")
    @Test
    public void testWithdraw2()
    {
       //Account ob = new Account("Namrata",1,5000);
          Executable r = ()->{ob.withdraw(6000); };
            assertThrows(InsufficientBalanceException.class,r,
                    "exception InsufficientBalance not thrown even if " +
                            "account is overdrawn!");
        }

    @AfterEach
    void teardown()
    {
        System.out.println("tear down:close all resources that are opened after each test-case");
    }

    @AfterAll
    static void tearOnceInEnd()
    {
        System.out.println("runs once in the end:write cleanup code to close all resources here!");
    }
}
