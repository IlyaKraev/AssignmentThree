package payments;

import Interfaces.IPayment;


public class BankPayment implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made by bank transfer transaction!\n\n", amount);
        return(true);
    }
    
}
