package datastructures.list;

public class EmployeeDLNode {

    private Employee employee;
    private EmployeeDLNode next;
    private EmployeeDLNode previous;

    public EmployeeDLNode(Employee employee){
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeDLNode getNext() {
        return next;
    }

    public void setNext(EmployeeDLNode next) {
        this.next = next;
    }

    public EmployeeDLNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeDLNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
