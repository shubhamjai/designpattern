package pattern.creational.abstractfactory.factory.card.amex;

import pattern.creational.abstractfactory.CardType;
import pattern.creational.abstractfactory.CreditCard;
import pattern.creational.abstractfactory.factory.CreditCardFactory;
import pattern.creational.abstractfactory.factory.card.amex.type.AmexGoldCreditCard;
import pattern.creational.abstractfactory.factory.card.amex.type.AmexPlatiniumCreditCard;
import pattern.creational.abstractfactory.validator.Validator;

//Amex Card Factory : Factory Pattern
public class AmexFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        switch (cardType)
        {
            case GOLD:      return new AmexGoldCreditCard();
            case PLATINIUM: return new AmexPlatiniumCreditCard();
            default:        return null;
        }
    }

    @Override
    public Validator getValidator(CardType cardType) {
        return null;
    }
}
