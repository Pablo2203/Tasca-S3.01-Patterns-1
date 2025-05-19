package level2.concreteProducts;

import level2.abstractProducts.TelephoneAbstract;

public class ArgentinaTelephone extends TelephoneAbstract {
    @Override
    public String getFullTelephone() {
        return "+54 11 3456 7890";
    }

}