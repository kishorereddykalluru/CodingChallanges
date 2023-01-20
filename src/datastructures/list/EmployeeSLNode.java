package datastructures.list;

public class EmployeeSLNode {

    private Employee employee;
    private EmployeeSLNode next;

    public EmployeeSLNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeSLNode getNext() {
        return next;
    }

    public void setNext(EmployeeSLNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
