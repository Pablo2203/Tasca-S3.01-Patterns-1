package level2.concreteProducts;

import level2.abstractProducts.AddressAbstract;

public class SpainAddress extends AddressAbstract {
    @Override
    public String getFullAddress() {
        return "Calle Mayor 45, Madrid, España";
    }
}

