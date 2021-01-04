package payments;

import Interfaces.IPayment;


public class CreditDebitCard implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made by credit/debit card transaction!\n\n", amount);
        return(true);
    }
    
}
