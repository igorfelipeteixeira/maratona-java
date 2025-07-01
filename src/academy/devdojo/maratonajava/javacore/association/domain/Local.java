package academy.devdojo.maratonajava.javacore.association.domain;

public class Local {

    private String address;

    public void imprime() {
        System.out.println("----- Local -----");
        System.out.println(address);
    }

    public Local(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
