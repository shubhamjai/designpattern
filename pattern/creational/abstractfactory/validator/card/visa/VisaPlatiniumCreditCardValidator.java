package pattern.creational.abstractfactory.validator.card.visa;

import pattern.creational.abstractfactory.CreditCard;
import pattern.creational.abstractfactory.validator.Validator;

public class VisaPlatiniumCreditCardValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
