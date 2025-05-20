package level2.concreteProducts;

import level2.abstractProducts.AddressAbstract;

public class ArgentinaAddress extends AddressAbstract {

    @Override
    public String getPostalCode() {
        return "C1000";  // Código postal de Buenos Aires.
    }

    @Override
    public String getProvince() {
        return "Buenos Aires";
    }

    @Override
    public String getCommunity() {
        return "CABA";
    }
}
