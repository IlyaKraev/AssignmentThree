package payments;

import Interfaces.IPayment;


public class CashPayment implements IPayment {

    @Override
    public boolean pay(float amount) {
        System.out.printf("Payment of amount %s was made by cash transaction!\n\n", amount);
        return(true);
    }
    
}
