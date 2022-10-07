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

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getPatronymic() {
        return this.patronymic;
    }
    public int getSection() {
        return this.section;
    }
    public int getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }

    public void setSection( int section) {
        this.section = section;
    }
    public void setSalary( int salary) {
        this.salary = salary;
    }


    public String toString() {
        return "Id: " + id + "; FIO: " + name + surname + patronymic + "; Department: " + section + "; Salary: " + salary;
    }


}
