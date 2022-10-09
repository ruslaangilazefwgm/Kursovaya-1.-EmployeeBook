public class Employee {
    private String name;
    private String patronymic;
    private  String surname;
    private int section;
    private int salary;
    private int id;

    private static int counter;

    public Employee(String name, String patronymic, String surname, int section, int salary) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
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
        return "Id: " + id + "; ФИО: " + name + patronymic + surname + "; Отдел: " + section + "; Зарплата: " + salary;
    }


}
