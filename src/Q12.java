import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Q12 {
}

class Employee {
    private int empNo;
    private String empName;
    private int empBasic;

    Employee(int empNo, String empName, int empBasic) {
        this.empNo = empNo;
        this.empName = empName;
        this.empBasic = empBasic;
    }

    int getEmpNo() {
        return empNo;
    }

    String getEmpName() {
        return empName;
    }

    int getEmpBasic() {
        return empBasic;
    }
}

class WriteEmployee {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int no = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter basic salary: ");
        int basic = sc.nextInt();

        Employee e = new Employee(no, name, basic);

        FileWriter fw = new FileWriter("emp.txt");

        fw.write(e.getEmpNo() + "\n");
        fw.write(e.getEmpName() + "\n");
        fw.write(e.getEmpBasic() + "\n");

        fw.close();

        Scanner file = new Scanner(new File("emp.txt"));

        System.out.println("\nEmployee Details:");
        System.out.println("Employee No = " + file.nextLine());
        System.out.println("Employee Name = " + file.nextLine());
        System.out.println("Basic Salary = " + file.nextLine());

        file.close();
    }
}
