package level2.concreteFactories;

import level2.abstractFactories.AbstractDiaryFactory;
import level2.abstractProducts.AddressAbstract;
import level2.abstractProducts.TelephoneAbstract;
import level2.concreteProducts.SpainAddress;
import level2.concreteProducts.SpainTelephone;

public class SpainDiaryFactory extends AbstractDiaryFactory {

    @Override
    public AddressAbstract createAddress() {
        return new SpainAddress();
    }

    @Override
    public TelephoneAbstract createTelephone() {
        return new SpainTelephone();
    }
}