package pattern.creational.abstractfactory.factory.card.visa;

import pattern.creational.abstractfactory.CardType;
import pattern.creational.abstractfactory.CreditCard;
import pattern.creational.abstractfactory.factory.CreditCardFactory;
import pattern.creational.abstractfactory.factory.card.visa.type.VisaGoldCreditCard;
import pattern.creational.abstractfactory.factory.card.visa.type.VisaPlatiniumCreditCard;
import pattern.creational.abstractfactory.validator.Validator;

//Visa Card Factory: Factory Pattern
public class VisaFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType)
        {
            case GOLD:      return new VisaGoldCreditCard();
            case PLATINIUM: return new VisaPlatiniumCreditCard();
            default:        return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
