public class Employee {
    private String name;
    private  String surname;
    private String patronymic;
    private int section;
    private int salary;
    private int id;

    private static int counter;

    public Employee(String name, String surname, String patronymic, int section, int salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.section = section;
        this.salary = salary;
        this.id = counter++;
    }

    public String toString() {
        return "Id: " + id + " FIO: " + name + surname + patronymic;
    }


}
