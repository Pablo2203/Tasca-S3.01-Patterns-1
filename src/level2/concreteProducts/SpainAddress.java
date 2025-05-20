package level2.concreteProducts;

import level2.abstractProducts.AddressAbstract;

public class SpainAddress extends AddressAbstract {
    @Override
    public String getPostalCode() {
        return "28001";  // Código postal de Madrid.
    }

    @Override
    public String getProvince() {
        return "Madrid";
    }

    @Override
    public String getCommunity() {
        return "Comunidad de Madrid";
    }
}

