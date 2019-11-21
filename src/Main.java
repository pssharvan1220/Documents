import java.util.Scanner;
import java.sql.*;
import java.util.*;

class Main {

        public static void main(String[] args) {
            int a,b;
            Scanner in = new Scanner(System.in);
            System.out.println("Select, [1] SIGN UP,  [2] SIGN IN");
            a = in.nextInt();
            switch (a){
                case 2:
                    System.out.println("System is not developed yet!!!");
                case 1:
                    System.out.println("Please Select Your registration role [1] Lecturer,  [2] Student.");
                    b = in.nextInt();
                    student stu = new student();
                    switch (b){
                        case 2:
                            stu.input();
                            stu.Display();
                            break;
                        case 1:
                            System.out.println("System is not developed yet!!!");
                            break;
                    }
            }




        }
    }
