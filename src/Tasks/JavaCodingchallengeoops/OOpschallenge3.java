package Tasks.JavaCodingchallengeoops;

public class OOpschallenge3 {
    public static void main(String[] args) {
        Employee emp=new Employee();
         emp.setId("1");
         emp.setName("John Doe");
          emp.setSalary(50000.0);
          emp.display();
    }

}
class  Employee{

    private  String id;
    private String name;
    private double salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void display(){

        System.out.println("Employee ID:"+id+"Employee Name:"+name+"Employee Salary:"+salary);
    }
}