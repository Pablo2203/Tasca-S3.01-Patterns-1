package level2.abstractProducts;

public abstract class AddressAbstract {
    public abstract String getPostalCode();
    public abstract String getProvince();
    public abstract String getCommunity();

    public String getFullAddress(String street, String city) {
        return street + ", " + city + ", " + getProvince() + ", " + getCommunity()
                + ". Código Postal: " + getPostalCode();
    }
}