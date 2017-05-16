package pattern.creational.abstractfactory.validator;

import pattern.creational.abstractfactory.CreditCard;

public interface Validator {
    public boolean isValid(CreditCard creditCard);
}
