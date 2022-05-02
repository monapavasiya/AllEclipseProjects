
//encapsulation --> binding data with methods
class Student
{
    private int rollno;         // variable should always be private
    private String name;           
    
    
    
	public int getRollno() {
		System.out.println("user is accessing the value ");
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
		System.out.println("value of rollno changed");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
         //getters and setters
  
}


public class EncapsulationDemo
{

	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.setRollno(2);
		s1.setName("Navin");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());

	}

}
