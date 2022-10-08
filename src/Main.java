public class Main {
    public static void fullRosterPrint(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

    public static int salaryMonthSum(int s) {
        int sum = 0;
        sum = sum + s;
        return sum;
    }

    public static void main(String[] args) {
        Employee[] empl = new Employee[2];  // Сделать [10]!
        empl [0] = new Employee("R ","G ","E ",1,20000);
        empl [1] = new Employee("R1 ","G1 ","E1 ",1,30000);

        fullRosterPrint(empl);

        for (int i = 0; i < empl.length; i++) {
            salaryMonthSum(empl[i].getSalary());
        }




    }
}