package level2;

import level2.abstractFactories.AbstractDiaryFactory;
import level2.abstractProducts.AddressAbstract;
import level2.abstractProducts.TelephoneAbstract;
import level2.concreteFactories.ArgentinaDiaryFactory;
import level2.concreteFactories.SpainDiaryFactory;

public class Main {
    public static void main(String[] args) {
        AbstractDiaryFactory argentinaFactory = new ArgentinaDiaryFactory();
        TelephoneAbstract argentinaTelephone = argentinaFactory.createTelephone();

        System.out.println(argentinaTelephone.getFullTelephone("1234-5678"));

        AbstractDiaryFactory spainFactory = new SpainDiaryFactory();
        AddressAbstract spainAddress = spainFactory.createAddress();

        String spainFullAddress = spainAddress.getFullAddress("Calle Falsa", "Madrid");
        System.out.println(spainFullAddress);
    }
}