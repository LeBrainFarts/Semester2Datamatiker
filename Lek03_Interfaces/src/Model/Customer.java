package Model;

public class Customer implements Comparable<Customer> {
    private String forNavn;
    private String efterNavn;
    private int alder;

    public Customer(String forNavn, String efterNavn, int alder) {
        this.forNavn = forNavn;
        this.efterNavn = efterNavn;
        this.alder = alder;
    }

    public String getForNavn() {
        return forNavn;
    }

    public String getEfterNavn() {
        return efterNavn;
    }

    public int getAlder() {
        return alder;
    }

    @Override
    public int compareTo(Customer other) {
        if (efterNavn.compareTo(other.efterNavn) != 0) {
            return efterNavn.compareTo(other.efterNavn);
        }
        if (forNavn.compareTo(other.forNavn) != 0) {
            return forNavn.compareTo(other.forNavn);
        }
        return Integer.compare(this.alder, other.alder);
    }

}
