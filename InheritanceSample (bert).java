public class InheritanceSample {
    public static void main(String[] args) {
        Student student = new Student (Name, Address, Program, Year)("Angel", " Caybunga", "Information Technology ", 2);
        
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Program: " + student.getProgram());
        System.out.println("Year: " + student.getYear());

        Staff staff = new Staff (Name, Address, School, Salary)("Berto", "Balayan", "Batangas State University - Balayan Campus", 50000.0);

        System.out.println("\nStaff Details:");
        System.out.println("Name: " + staff.getName());
        System.out.println("Address: " + staff.getAddress());
        System.out.println("School: " + staff.getSchool());
        System.out.println("Salary: " + staff.getSalary());
    }
}


