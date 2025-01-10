package exceptionhandling.userdefinedexception;

import java.time.LocalDateTime;

public class InsufficientBalanceException extends Exception {

  public InsufficientBalanceException(double amt,double bal)
    {
        super("Insufficient balance exception:amt="+amt+",bal:"+bal+
                "at date & time:"+LocalDateTime.now());

    }


}
