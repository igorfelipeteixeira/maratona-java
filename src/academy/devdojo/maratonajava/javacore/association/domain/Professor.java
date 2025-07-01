package academy.devdojo.maratonajava.javacore.association.domain;

public class Professor {

    private String name;
    private String specialty;
    private Seminario[] seminaries;

    public void imprime() {
        System.out.println("----- Professor -----");
        System.out.println(name);
        System.out.println(specialty);
        if (seminaries != null) {
            for (Seminario seminary : seminaries) {
                System.out.println(seminary.getTitle());
            }
        }
    }

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Professor(String name, String specialty, Seminario[] seminaries) {
        this.name = name;
        this.specialty = specialty;
        this.seminaries = seminaries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Seminario[] getSeminaries() {
        return seminaries;
    }

    public void setSeminaries(Seminario[] seminaries) {
        this.seminaries = seminaries;
    }
}
