import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Conditions
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays
        Student[] students = new Student[n];

        // Loops
        for (int i = 0; i < n; i++) {

            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Specialization: ");
            String specialization = sc.nextLine();

            students[i] = new Graduatestudent(id, name, marks, specialization);
        }

        System.out.println("\n----------- Student Details -----------");

        for (Student s : students) {

            s.displayDetails();

            if (s.getMarks() >= 40)
                System.out.println("Result : Pass");
            else
                System.out.println("Result : Fail");

            System.out.println("---------------------------------------");
        }

        sc.close();
    }
}