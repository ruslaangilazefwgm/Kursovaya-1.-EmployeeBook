import java.util.Objects;

public class Employee {
    private String name;
    private String patronymic;
    private  String surname;
    private int section;
    private int salary;
    private int id;

    private static int counter = 1;

    public Employee(String name, String patronymic, String surname, int section, int salary) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.section = section;
        this.salary = salary;
        this.id = counter++;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPatronymic() {
        return patronymic;
    }
    public int getSection() {
        return section;
    }
    public int getSalary() {
        return salary;
    }
    public int getId() {
        return id;
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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(patronymic, employee.patronymic) && Objects.equals(surname, employee.surname)  && Objects.equals(section, employee.section)  && Objects.equals(salary, employee.salary)  && Objects.equals(id, employee.id);
    }

    public int hashCode() {
        return Objects.hash(name, patronymic, surname, section, salary, id);
    }


}
