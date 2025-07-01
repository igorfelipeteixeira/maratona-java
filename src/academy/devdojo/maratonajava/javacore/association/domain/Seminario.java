package academy.devdojo.maratonajava.javacore.association.domain;

public class Seminario {

    private String title;
    private Local address;
    private Aluno[] students;

    public void imprime() {
        System.out.println("----- Seminário -----");
        System.out.println(title);
        System.out.println(address.getAddress());
        if (students != null) {
            for (Aluno student : students) {
                System.out.println(student.getName());
            }
        }
    }

    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(String title, Local address, Aluno[] students) {
        this.title = title;
        this.address = address;
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Local getAddress() {
        return address;
    }

    public void setAddress(Local address) {
        this.address = address;
    }

    public Aluno[] getStudents() {
        return students;
    }

    public void setStudents(Aluno[] students) {
        this.students = students;
    }
}
