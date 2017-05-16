package pattern.creational.abstractfactory.factory;

import pattern.creational.abstractfactory.CardType;
import pattern.creational.abstractfactory.CreditCard;
import pattern.creational.abstractfactory.factory.card.amex.AmexFactory;
import pattern.creational.abstractfactory.factory.card.visa.VisaFactory;
import pattern.creational.abstractfactory.validator.Validator;

//abstract factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int score)
    {
        if(score >500)
        {
            return new AmexFactory();
        }
        else
        {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
