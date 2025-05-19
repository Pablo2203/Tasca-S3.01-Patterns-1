package level2;

import level2.abstractProducts.AddressAbstract;
import level2.abstractProducts.TelephoneAbstract;
import level2.concreteFactories.ArgentinaDiaryFactory;
import level2.concreteFactories.SpainDiaryFactory;

public class Main {
    public static void main(String[] args) {
        ArgentinaDiaryFactory argentinaFactory = new ArgentinaDiaryFactory();
        SpainDiaryFactory spainFactory = new SpainDiaryFactory();

        AddressAbstract argentinaAddress = argentinaFactory.createAddress();
        TelephoneAbstract argentinaTelephone = argentinaFactory.createTelephone();

        AddressAbstract spainAddress = spainFactory.createAddress();
        TelephoneAbstract spainTelephone = spainFactory.createTelephone();

        System.out.println("Argentina Address: " + argentinaAddress.getFullAddress());
        System.out.println("Argentina Telephone: " + argentinaTelephone.getFullTelephone());
        System.out.println("Spain Address: " + spainAddress.getFullAddress());
        System.out.println("Spain Telephone: " + spainTelephone.getFullTelephone());
    }
}