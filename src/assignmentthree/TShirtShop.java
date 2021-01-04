package assignmentthree;

import Interfaces.IPayment;
import java.util.List;
import models.TShirt;
import payments.BankPayment;
import payments.CashPayment;
import payments.CreditDebitCard;
import pseudofactory.TShirtPseudoFactory;

public final class TShirtShop {

    public TShirtShop() {
        TShirtPseudoFactory printer = new TShirtPseudoFactory();
        List<TShirt> allTheShirts = printer.printShirts();
        
        // CreditDebitCard
        System.out.println("CREDIT/DEBIT CARD PAYMENTS");
        IPayment payment = new CreditDebitCard();
        orderPayment(allTheShirts, payment);

        // MoneyBankTransfer
        System.out.println("BANK TRANSFER PAYMENTS");
        payment = new BankPayment();
        orderPayment(allTheShirts, payment);

        // Cash
        System.out.println("CASH PAYMENTS");
        payment = new CashPayment();
        orderPayment(allTheShirts, payment);
    }

    public void orderPayment(List<TShirt> tshirts, IPayment payment) {

        for (TShirt tshirt : tshirts) {
            System.out.println(tshirt);
            if (payment.getClass().getName().equals("payments.CreditDebitCard")) {
                payment.pay(tshirt.getFabric().getUnitPrice() + tshirt.getColor().getUnitPrice()
                        + tshirt.getSize().getUnitPrice() + 5.0f);
            }

            if (payment.getClass().getName().equals("payments.BankPayment")) {
                payment.pay(tshirt.getFabric().getUnitPrice() + tshirt.getColor().getUnitPrice()
                        + tshirt.getSize().getUnitPrice() + 3.0f);
            }

            if (payment.getClass().getName().equals("payments.CashPayment")) {
                payment.pay(tshirt.getFabric().getUnitPrice() + tshirt.getColor().getUnitPrice()
                        + tshirt.getSize().getUnitPrice());
            }
        }
    }
}
