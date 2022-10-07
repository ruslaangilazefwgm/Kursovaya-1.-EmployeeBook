public class Main {
    public static void fullRosterPrint(Employee e) {
                System.out.println(e);

    }
    public static void main(String[] args) {
        Employee[] empl = new Employee[2];
        empl [0] = new Employee("R ","G ","E ",1,20000);
        empl [1] = new Employee("R1 ","G1 ","E1 ",1,30000);
        fullRosterPrint(empl[1]);


    }
}