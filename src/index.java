package myproject;

import java.util.Scanner;
import.java.sql.*;

public class index {

	public static void main(String[] args) {
		index pro = new index();
		pro.createconnection();
		int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Select, [1] SIGN UP,  [2] SIGN IN");
        a = in.nextInt();
        switch (a){
            case 2:
            	System.out.println("Please Select Your registration role [1] Lecturer,  [2] Student.");
                b = in.nextInt();
                student stu = new student();
                switch (b){
                    case 2:
                        stu.signin();
                        stu.getdetail();
                        break;
                    case 1:
                        System.out.println("System is not developed yet!!!");
                        break;
                	}
            case 1:
                System.out.println("Please Select Your registration role [1] Lecturer,  [2] Student.");
                b = in.nextInt();
                student stu = new student();
                switch (b){
                    case 2:
                        stu.input();
                        stu.Display();
                        stu.adddetails();
                        break;
                    case 1:
                        System.out.println("System is not developed yet!!!");
                        break;
                	}

        		}

		}
	
}
