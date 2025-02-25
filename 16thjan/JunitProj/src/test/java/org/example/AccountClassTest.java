package org.example;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AccountClassTest {


    Account ob;


    @BeforeEach
    void setup()
    {
        ob = new Account("Prateek Joshi",1001,2000);
    }

    @DisplayName("withdraw testing")
    @Test
    void testWithdraw() {


        try
        {


            ob.withdraw(1500);

        }catch(Exception e)
        {
            e.printStackTrace();
        }

        double bal = ob.getBalance();
        assertEquals(500,bal,"withdraw of Account not working as expected");
    }



    @DisplayName("test deposit method of Account")
    @Test
    void testDeposit() {


        try
        {

            ob.deposit(1500);

        }catch(Exception e)
        {
            e.printStackTrace();
        }

        double bal = ob.getBalance();
        assertEquals(3500,bal,"deposit of Account not working as expected");
    }


    @DisplayName("test withdraw if bal  is equal to amount")
    @Test()
    void testNotInsufficientBalance()
    {
        try
        {
            ob.withdraw(2000);
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        double bal = ob.getBalance();
        assertEquals(0,bal,"withdraw method test failed for amt same as bal");
    }

    @DisplayName("test withdraw if bal  less than amount")
    @Test()
    void testInsufficientBalance()
    {
        System.out.println("balance before withdraw:"+ob.getBalance());
        assertThrows(InsufficientBalanceException.class,
                ()->ob.withdraw(2001));
    }




//	assertDoesNotThrow

}
