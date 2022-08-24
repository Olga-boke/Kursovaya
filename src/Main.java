public class Main {

    static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee( "Иванов Иван Иванович",2, 50125.05 );
        employees[1] = new Employee( "Алексеев Алексей Алексеевич",1, 37220.87 );
        employees[2] = new Employee( "Петров Петр Петрович",3, 70269.45 );
        employees[3] = new Employee( "Иванов Александр Иванович",4, 95758.25 );
        employees[4] = new Employee( "Иванов Василий Иванович",5, 49050.61 );
        employees[6] = new Employee( "Иванов Иван Иванович",2, 50899.97 );

        printAllEmployee();
        System.out.println(getAndCalculateSalarySum());
        System.out.println(getEmptoyeeMinSalary());
        System.out.println(getEmptoyeeMaxSalary());
        System.out.println(getAndCalculateAverageSalary());
        printAllFullNameEmployee();


    }
    public static void printAllEmployee(){
        for (Employee employee : employees) {
            System.out.println(employee);

        }

    }
    public static double getAndCalculateSalarySum() {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
               sum = sum + employees[i].getSalary();
            }
        }
        return sum;

    }
    public static Employee getEmptoyeeMinSalary(){
        double minSalary = -1;
        Employee minSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++)  {
            if (employees[i] != null) {
                minSalary = employees[i].getSalary();
                minSalaryEmpl = employees[i];
                index = i;
                break;
            }

        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (minSalary > employees[i].getSalary()){
                    minSalary = employees[i].getSalary();
                    minSalaryEmpl = employees[i];

                }
            }

        }
        return minSalaryEmpl;


    }
    public static Employee getEmptoyeeMaxSalary(){
        double maxSalary = -1;
        Employee maxSalaryEmpl = null;
        int index = 0;
        for (int i = 0; i < employees.length; i++)  {
            if (employees[i] != null) {
                maxSalary = employees[i].getSalary();
                maxSalaryEmpl = employees[i];
                index = i;
                break;
            }

        }

        for (int i = index; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()){
                    maxSalary = employees[i].getSalary();
                    maxSalaryEmpl = employees[i];

                }
            }

        }
        return maxSalaryEmpl;
    }
    public static double getAndCalculateAverageSalary() {
        double sumAllSalaryEmpl = getAndCalculateSalarySum();
        if (employees.length != 0) {
            return sumAllSalaryEmpl / employees.length;
        } else {
            return 0;
        }
    }

    public static void printAllFullNameEmployee(){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                System.out.println(employees[i].getFullName());
            }

        }
    }


}