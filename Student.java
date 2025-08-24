
public class Student {
	int id;
    String Name;
    String Course;
Student(int id,String Name,String Course){
	this.Course=Course;
	this. Name= Name;
	this.id=id;
}
public int getId() {
	return id;
}
public void displayInfo() {
	System.out.println("ID:" +id+",Name:"+Name +", Course:"+ Course);
}
}