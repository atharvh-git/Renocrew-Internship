// Create a class Employee with following properties and methods:
// salary (property) (int)
// getSalary (method returning int)
// name (property)(String)
// getName(method returning String)
// setName(method changing name)

public class Employee {
   int salary = 64500; // salary property
   String name; // name property

   public int getSalary() {
      return salary;
   }

   public String getName() {
      return name;
   }

   public void setName(String n) {
      name = n;
   }

   public static void main(String[] args) {
      Employee em = new Employee();
      em.setName("Suresh Pande");
      System.out.println("Name of employee is " + em.getName());
      System.out.println("Salary of employee: Rs. " + em.getSalary());
   }
}
