class employee {
    String employeeid;
    String name;
    String role;
    Double salary;
    Double finalsalary;

    void calculatesalary() {
        switch (role) {
            case "manager":
                finalsalary = salary + (0.20 * salary);
                break;

            case "developer":
                finalsalary = salary + (0.10 * salary);   // fixed bonus
                break;

            case "intern":
                finalsalary = 1000.0;   // fixed salary as per question
                break;

            default:
                finalsalary = salary;
        }
    }

    void applydeduction(double amount) {
        finalsalary = finalsalary - amount;
    }

    void displayemployeedetails() {
        System.out.println("employee id: " + employeeid);
        System.out.println("name: " + name);
        System.out.println("role: " + role);
        System.out.println("final salary: " + finalsalary);
        System.out.println("------------------------");
    }
}

class payroll {
    employee[] employees = new employee[20];
    int count = 0;

    void addemployee(employee employee) {
        employees[count] = employee;
        count++;
    }

    employee findemployeebyid(String employeeid) {
        for (int i = 0; i < count; i++) {
            if (employees[i].employeeid.equals(employeeid)) {
                return employees[i];
            }
        }
        return null;
    }

    void calculateAllSalaries() {
        for (int i = 0; i < count; i++) {
            employees[i].calculatesalary();
            employees[i].displayemployeedetails();
        }
    }
}

public class case5 {

    public static void main(String[] args) {

        employee employee1 = new employee();
        employee1.employeeid = "E001";
        employee1.name = "Alice";
        employee1.role = "manager";
        employee1.salary = 5000.0;

        employee employee2 = new employee();
        employee2.employeeid = "E002";
        employee2.name = "Bob";
        employee2.role = "developer";
        employee2.salary = 4000.0;

        employee employee3 = new employee();
        employee3.employeeid = "E003";
        employee3.name = "Charlie";
        employee3.role = "intern";
        employee3.salary = 2000.0;

        payroll payroll1 = new payroll();

        payroll1.addemployee(employee1);
        payroll1.addemployee(employee2);
        payroll1.addemployee(employee3);

        payroll1.calculateAllSalaries();
    }
}
