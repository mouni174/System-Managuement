import java.util.Scanner;
import java.util.ArrayList;
public class StudentManagementConsole  {
			 static ArrayList<Student> students =new ArrayList<>();
			 static Scanner sc=new Scanner(System.in);
			public static void main(String[] args) { 
				int choice;
				do {
					System.out.println("====StudentManagementConsole====");
					System.out.println("1.Add Student");
					System.out.println("2.View Students");
					System.out.println("3.Search Student by Id");	
					System.out.println("4.Remove Student ");
					System.out.println("Enter choice:");
					choice=sc.nextInt();
				switch(choice) {
				case 1 -> addStudent();
				case 2 -> viewStudent();
				case 3 -> searchStudent();
				case 4 -> deleteStudent();
				case 5->System.out.println("Exiting");
				default->System.out.println("Invalid choice");
				}
			} while(choice!=5);
       }
           static void addStudent() {
			System.out.print("Enter id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter name:");
			String name = sc.nextLine();
			System.out.print("Enter course:");
			String course=sc.nextLine();
students.add(new Student(id,name,course));
System.out.println("Student added succesfully");
}
            static void viewStudent() {
	if(students.isEmpty()) {
		System.out.println("no students to display");
	}else {
		System.out.println("List of students:");
		for(Student stu:students) {
			stu.displayInfo();
		}
	}
}
		
      static void searchStudent() {
		System.out.println("Enter id to search:");
		int id = sc.nextInt();
		for(Student stu:students) {
			if(stu.getId()==id) {
				System.out.println("Student found");
				stu.displayInfo();
				return;
			}
}
		System.out.println("Student not found");
			}

	static void deleteStudent() {
		System.out.println("Enter id to delete:");
		int id = sc.nextInt();
		for(Student stu:students) {
			if(stu.getId()==id) {
				students.remove(stu);
				System.out.println("Student delete succesfully ");
				stu.displayInfo();
				return;
		
	}
			}
	System.out.println("Student not found");
}
}

