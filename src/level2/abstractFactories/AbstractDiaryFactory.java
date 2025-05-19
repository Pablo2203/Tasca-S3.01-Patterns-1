package level2.abstractFactories;

import level2.abstractProducts.AddressAbstract;
import level2.abstractProducts.TelephoneAbstract;

public abstract class AbstractDiaryFactory {
     public abstract AddressAbstract createAddress();
     public abstract TelephoneAbstract createTelephone();
}