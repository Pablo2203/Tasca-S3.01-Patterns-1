package level2.concreteProducts;

import level2.abstractProducts.TelephoneAbstract;

public class ArgentinaTelephone extends TelephoneAbstract {
    @Override
    public String getCountryCode() {
        return "+54";
    }

    @Override
    public String getAreaCode() {
        return "11";
    }
}

