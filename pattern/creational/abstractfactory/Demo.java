package pattern.creational.abstractfactory;

import pattern.creational.abstractfactory.factory.CreditCardFactory;

public class Demo {
    public static void main(String... args)
    {
        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCardFactory(220);
        CreditCard card1 = creditCardFactory.getCreditCard(CardType.GOLD);
        CreditCard card2 = creditCardFactory.getCreditCard(CardType.PLATINIUM);
        System.out.println(creditCardFactory.getClass());
        System.out.println(card1.getClass());
        System.out.println(card2.getClass());

        CreditCardFactory creditCardFactory1 = CreditCardFactory.getCreditCardFactory(550);
        CreditCard card3 = creditCardFactory.getCreditCard(CardType.GOLD);
        CreditCard card4 = creditCardFactory.getCreditCard(CardType.PLATINIUM);
        System.out.println(creditCardFactory1.getClass());
        System.out.println(card3.getClass());
        System.out.println(card4.getClass());
    }
}
