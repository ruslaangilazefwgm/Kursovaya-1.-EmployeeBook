public class Main {
    public static void fullRosterPrint(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

    public static int salaryMonthSum(Employee[] s) {
        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            sum = sum + s[i].getSalary();
        }
        return sum;
    }

    public static int salaryMin(Employee[] minS) {
        int minSalary = minS[0].getSalary();
        for (int i = 0; i < minS.length; i++) {
            if (minS[i].getSalary() <= minSalary) {
                minSalary = minS[i].getSalary();
            }
        }
        return minSalary;
    }public static int salaryMax(Employee[] maxS) {
        int maxSalary = maxS[0].getSalary();
        for (int i = 0; i < maxS.length; i++) {
            if (maxS[i].getSalary() >= maxSalary) {
                maxSalary = maxS[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static void main(String[] args) {
        Employee[] empl = new Employee[2];  // Сделать [10]!
        empl [0] = new Employee("R ","G ","E ",1,40000);
        empl [1] = new Employee("R1 ","G1 ","E1 ",1,30000);

        fullRosterPrint(empl);
        System.out.println(salaryMonthSum(empl));
        System.out.println(salaryMin(empl));
        System.out.println(salaryMax(empl));


    }
}