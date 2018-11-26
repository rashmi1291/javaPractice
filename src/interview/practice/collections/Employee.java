package interview.practice.collections;

public class Employee implements Comparable<Employee> {

    String employeeName;

    int salary;

    /**
     * @param employeeName
     * @param salary
     */
    public Employee(String employeeName, int salary) {
        super();
        this.employeeName = employeeName;
        this.salary = salary;
    }

    //for Comparable interface
    @Override
    public int compareTo(Employee emp) {
        if (salary == emp.salary)
            return 0;
        else if (salary > emp.salary)
            return 1;
        else
            return -1;
    }

}
