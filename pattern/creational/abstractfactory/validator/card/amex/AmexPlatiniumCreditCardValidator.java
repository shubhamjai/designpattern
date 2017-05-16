package pattern.creational.abstractfactory.validator.card.amex;

import pattern.creational.abstractfactory.CreditCard;
import pattern.creational.abstractfactory.validator.Validator;

public class AmexPlatiniumCreditCardValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
