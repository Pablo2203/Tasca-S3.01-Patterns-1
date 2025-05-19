package level2.concreteProducts;

import level2.abstractProducts.AddressAbstract;

public class ArgentinaAddress extends AddressAbstract {

    @Override
    public String getFullAddress() {
        return "Av. Corrientes 1234, Buenos Aires, Argentina";
    }


}