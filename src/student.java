import java.util.Scanner;
public class student {
    String name, pw;
    int age, select;

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Student Registration Form\n");
        System.out.println("Name :");
        name = in.next();
        System.out.println("Password :");
        pw = in.next();
        System.out.println("age :");
        age = in.nextInt();
        System.out.println("\nSelect Course Number from following list");
        System.out.println("[1] SENG 11111 - Introduction to Programming");
        System.out.println("[2] SENG 11112 - Fundamentals of Engineering");
        System.out.println("[3] SENG 11113 - Data Structures and Algorithms");
        select = in.nextInt();
    }

    public void Display() {
        System.out.println("Welcome to University Management System\n\n.............................\nStudent Registration Completed\n");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        switch(select) {
            case 1:
                System.out.println("Subject: SENG 11111 - Introduction to Programming");
                break;
            case 2:
                System.out.println("Subject: SENG 11112 - Fundamentals of Engineering");
                break;
            case 3:
                System.out.println("Subject: SENG 11113 - Data Structures and Algorithms");
                break;
        }
    }
}
