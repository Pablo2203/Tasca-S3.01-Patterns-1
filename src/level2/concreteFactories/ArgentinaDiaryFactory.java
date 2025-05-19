package level2.concreteFactories;

import level2.abstractFactories.AbstractDiaryFactory;
import level2.abstractProducts.AddressAbstract;
import level2.abstractProducts.TelephoneAbstract;
import level2.concreteProducts.ArgentinaAddress;
import level2.concreteProducts.ArgentinaTelephone;

public class ArgentinaDiaryFactory extends AbstractDiaryFactory {
    @Override
    public AddressAbstract createAddress() {
        return new ArgentinaAddress();
    }

    @Override
    public TelephoneAbstract createTelephone() {
        return new ArgentinaTelephone();
    }
}