package org.example;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@Disabled("The Account functionality is currently " +
        "being modified,so dont execute its testcases!")
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
    @RepeatedTest(2)
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


    @Disabled("Currently bug #123 is open on InsufficientBalanceException" +
            " classs, so this test diabled until bug is fixed!")
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

    @DisplayName("Test withdraw method with diff argument values")
    @ParameterizedTest
    @ValueSource(doubles = {1000,2500,500})
    public void testWithdrawWithParams(double amt)
    {
        try {
            ob.withdraw(amt);
        }
        catch(InsufficientBalanceException ex){
            System.out.println(ex.getMessage());
        }

        double bal = ob.getBalance();
        System.out.println("for amt="+amt+", bal="+bal);
        assertTrue(bal>0,"balance cant be less than zero");

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
