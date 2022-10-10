public class Main {
    public static void fullRosterPrint(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }

    public static int salaryMonthSum(Employee[] s) {
        int sum = 0;
        for (Employee employee : s) {
            sum += employee.getSalary();
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
    }
    public static int salaryMax(Employee[] maxS) {
        int maxSalary = maxS[0].getSalary();
        for (int i = 0; i < maxS.length; i++) {
            if (maxS[i].getSalary() >= maxSalary) {
                maxSalary = maxS[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static void fioPrint(Employee[] e) {
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].getName() + e[i].getSurname() + e[i].getPatronymic());
        }
    }
    public static void salaryIndexation (Employee[] index, double procentIndexation) {
        for (int i = 0; i < index.length; i++) {
            index[i].setSalary((int) (index[i].getSalary() + index[i].getSalary() * procentIndexation));
            System.out.println(index[i].getSalary());
        }
    }

    public static int workerMinSalaryOfDepartment(Employee[] minD, int sectionNumber) {
        int minSalary = 0;
        for (int i = 0; i < minD.length; i++) {
            minSalary = minD[2].getSalary();
            if (minD[i].getSection() == sectionNumber && minD[i].getSalary() < minD[2].getSalary()) {
                minSalary = minD[i].getSalary();
            }
        }
        return minSalary;
    }
    public static int workerMaxSalaryOfDepartment(Employee[] maxD, int sectionNumber) {
        int maxSalary = 0;
        for (int i = 0; i < maxD.length; i++) {
            maxSalary = maxD[2].getSalary();
            if (maxD[i].getSection() == sectionNumber && maxD[i].getSalary() > maxD[2].getSalary()) {
                maxSalary = maxD[i].getSalary();
            }
        }
        return maxSalary;
    }


       public static void main(String[] args) {
        Employee[] empl = new Employee[10];
        empl[0] = new Employee("Руслан ", "Эльфатович ", "Гилязев ", 1, 40000);
        empl[1] = new Employee("Артур ", "Робертович ", "Мясников ", 2, 30000);
        empl[2] = new Employee("Вячеслав ", "Игоревич ", "Крутильников ", 3, 50000);
        empl[3] = new Employee("Лидия ", "Рустемовна ", "Курицына ", 1, 60000);
        empl[4] = new Employee("Альберт ", "Иосифович ", "Месильников ", 2, 70000);
        empl[5] = new Employee("Гарик ", "Артурович ", "Шнеков ", 3, 50000);
        empl[6] = new Employee("Людмила ", "Александровна ", "Швабрина ", 1, 30000);
        empl[7] = new Employee("Александр ", "Ааронович ", "Евреев ", 2, 40000);
        empl[8] = new Employee("Аарон ", "Александрович ", "Русских ", 3, 60000);
        empl[9] = new Employee("Егор ", "Игоревич ", "Лесников ", 1, 30000);

        fullRosterPrint(empl);
        System.out.println("Сумма затрат на зарплату в месяц: " + salaryMonthSum(empl));
        System.out.println("Минимальная зарплата: " + salaryMin(empl));
        System.out.println("Максимальная зарплата: " + salaryMax(empl));

        int average = 0;
        average = salaryMonthSum(empl) / empl.length;
        System.out.println("Средняя зарплата: " + average);

        System.out.println("ФИО всех сотрудников: ");
        fioPrint(empl);

        salaryIndexation(empl, 0.05);

        System.out.println(workerMinSalaryOfDepartment(empl, 3));
           System.out.println(workerMaxSalaryOfDepartment(empl, 3));


       }
}