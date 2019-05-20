public class Student {
    private String name;
    private String facultate;

    public Student() {
    }

    public Student(String name, String facultate) {
        this.name = name;
        this.facultate = facultate;
    }

    public void display() {
        System.out.println("Studentul " + name + " este la facultatea " + facultate);
    }

    public void displayAge(Integer age) {
        System.out.println("Studentul " + name + " este la facultatea " + facultate + " si are varsta de " + age + " ani");
    }

    public void displayName(String name) {
        System.out.println("Numele studentului este " + name);
    }

    public String getName() {
        return "Name = " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }
}
