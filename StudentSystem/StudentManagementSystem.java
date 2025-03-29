package StudentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem implements StudentServices{

    private List<Student> students;
    private Student student;
    private final String SYSTEM_NAME = "StudentManagementSystem";
    private static  volatile StudentManagementSystem SMS;


    // apply singleton pattern
    private StudentManagementSystem()
    {
        students = new ArrayList<>();
    }

    // create obj
    public static StudentManagementSystem getInstanc()
    {
        if (SMS == null)
        {
            synchronized (StudentManagementSystem.class)
            {
                if (SMS == null)
                    SMS = new StudentManagementSystem();
            }
        }
        return  SMS;
    }

    @Override
    public void AddStudent(String name, String email, String age, String department)
    {
        this.student = new Student(name, email ,age , department);
        students.add(student);
        System.out.println("Student added successfully with ID: "+student.getId());
    }

    @Override
    public void ViewAllStudents()
    {
        if (students.isEmpty()) {
            System.out.println("is empty");
            return;
        }
        students.stream().forEach(System.out::println);
    }

    @Override
    public void SearchStudentbyID(int id)
    {
        System.out.println("=== result ===");
        students.stream().filter(n -> n.getId() == id).forEach(System.out::println);
    }

    @Override
    public void UpdateStudent(int id, String... args) {
        Student student = students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null); // Returns null if not found

        if (student == null) {
            System.out.println("Not Found!");
            return;
        }

        if (args.length > 0 && args[0] != null) {
            student.setName(args[0]);
        }
        if (args.length > 1 && args[1] != null) {
            student.setEmail(args[1]);
        }
        if (args.length > 2 && args[2] != null) {
            student.setAge(args[2]);
        }
        if (args.length > 3 && args[3] != null) {
            student.setDepartment(args[3]);
        }

        System.out.println("Updated Student: " + student);




    }


    public boolean isExist(int id)
    {
        return students.stream().anyMatch(n -> n.getId() == id );
    }

    @Override
    public void DeleteStudent(int id)
    {

        if (!students.isEmpty())
        {
            if (!isExist(id))
            {
                System.out.println("Not Found");
                return;
            }
        }
        Student student = students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        students.remove(student);
        System.out.println("Student deleted successfully.");




    }

    public String getSYSTEM_NAME() {
        return SYSTEM_NAME;
    }

    @Override
    public void optionMenu()
    {
        System.out.println("===== Student Management System =====\n" +
                "1. Add Student\n" +
                "2. View All Students\n" +
                "3. Search Student by ID\n" +
                "4. Update Student\n" +
                "5. Delete Student\n" +
                "6. Exit\n" +
                "Enter your choice: ");
    }

    public void startApp()
    {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int choice;

        while (flag)
        {
            optionMenu();
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1 -> {
                    scanner.nextLine();
                    System.out.println("Enter Student Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Student Email:");

                    String email = scanner.next();
                    System.out.println("Enter Student Age:");
                    String age = scanner.next();
                    System.out.println("Enter Department");
                    scanner.nextLine();
                    String depart = scanner.nextLine();
                    AddStudent(name , email , age , depart);
                }
                case 2 -> {
                    System.out.println("===== Student List =====");
                    ViewAllStudents();
                }
                case 3 -> {
                    System.out.println("Enter Student ID to search: 101");
                    int id = scanner.nextInt();
                    SearchStudentbyID(id);
                }
                case 4 -> {
                    System.out.println("Enter Student ID to update:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume leftover newline

                    System.out.println("Enter Name (leave blank to keep current) :");
                    String name = scanner.nextLine();

                    System.out.println("Enter Email (leave blank to keep current):");
                    String email = scanner.nextLine(); // Use nextLine() to read full email

                    System.out.println("Enter Student Age (leave blank to keep current):");
                    String age = scanner.nextLine(); // Read as String (to check for empty input)

                    System.out.println("Enter Department (leave blank to keep current):");
                    String depart = scanner.nextLine();

                    UpdateStudent(id, name, email, age, depart);

                }
                case 5 -> {
                    System.out.println("Enter Student ID to delete:");
                    int id = scanner.nextInt();
                    DeleteStudent(id);
                }
                case 6 -> {
                    System.out.println("Thank you for using the Student Management System!\n");
                    flag = false;
                }
                default -> {
                    System.out.println("invalid");
                }
            }
        }
    }
}
