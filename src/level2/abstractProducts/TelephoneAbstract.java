package level2.abstractProducts;

public abstract class TelephoneAbstract {
    public abstract String getCountryCode();
    public abstract String getAreaCode();

    public String getFullTelephone(String number) {
        return getCountryCode() + " " + getAreaCode() + " " + number;
    }
}