package level2.concreteProducts;

import level2.abstractProducts.TelephoneAbstract;

public class SpainTelephone extends TelephoneAbstract {
    @Override
    public String getCountryCode() {
        return "+34";
    }

    @Override
    public String getAreaCode() {
        return "600";

    }

}


