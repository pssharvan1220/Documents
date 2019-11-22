import java.util.Scanner;
public class student {
	String name,uname, pw;
    int age, select;

    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Student Registration Form\n");
        System.out.println("Name :");
        name = in.next();
        System.out.println("Username: ");
        uname = sc.next();
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
    
    public void signin() {
        Scanner in = new Scanner(System.in);
        System.out.println("Username: ");
        uname = sc.next();
        System.out.println("Password :");
        pw = in.next();
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
    
    void adddetails() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = Drivermanager.getConnection("jdbc:mysql://localhost:3306/unidb","root","1234");
			
			Statement st=con.createStatement();
			
			PreparedStatement sts = con.prepareStatement("INSERT INTO student (uname, name, age,password) VALUES (?, ?, ?,?)");
					 sts.setString(1, uname);
					 sts.setString(2, name);
					 sts.setInt(3, pw);
					 sts.setString(4, age);
					 sts.executeUpdate();
					 
					 con.close();
			
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(index.class.getName()).log(Level.SEVERE,null,ex);
		} catch (SQLException ex) {
			Logger.getLogger(index.class.getName()).log(Level.SEVERE,null,ex);
		}
	}
    
    void Display() {
    	 System.out.println("You have successfully registered for the followuing course: ");
    	 try {
    		 Class.forName("com.mysql.jdbc.Driver");
 			 Connection con = Drivermanager.getConnection("jdbc:mysql://localhost:3306/unidb","root","1234");
 
 			 Statement sta = con.createStatement();
 			 PreparedStatement sts = con.prepareStatement("INSERT INTO course (uname,course) VALUES (?,?)");
 			 switch(select) {
 			 case 1:
 				 System.out.println("Subject: SENG 11111 - Introduction to Programming");
 				 sts.setString(1,uname);
 				 sts.setString(2,"SENG 1111 - Introduction to Programming");
 				 sts.executeUpdate();
 				 break;
 			 case 2:
 				 System.out.println("Subject: SENG 11112 - Fundamentals of Engineering");
 				 sts.setString(1,uname);
 				 sts.setString(2,"SENG 1112 - Fundamentals of Engineering");
 				 sts.executeUpdate();
 				 break;

 			 case 3:
 				 System.out.println("Subject: SENG 11113 - Data Structures and Algorithms");
 				 sts.setString(1,uname);
 				 sts.setString(2,"SENG 1113 - Data Structures and Algorithm");
 				 sts.executeUpdate();
 				 break;
 			 }
 			 con.close();
    		} catch (ClassNotFoundException ex) {
 			Logger.getLogger(index.class.getName()).log(Level.SEVERE,null,ex);
 			} catch (SQLException ex) {
 			Logger.getLogger(index.class.getName()).log(Level.SEVERE,null,ex);
 			}
    	}
    
    void getdetail() {
    	Class.forName("com.mysql.jdbc.Driver");
		Connection con = Drivermanager.getConnection("jdbc:mysql://localhost:3306/unidb","root","1234");
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from course where uname="+unmae);
		
		String userdata=rs.getString(1)+"\n\n"+rs.getString(2);
		
		System.out.print("Welcome\n\n");
		System.out.print(userdata);
		
		
    }
}
