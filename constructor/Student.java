package constructor;

public class Student {
	int studenId;
	String studentName;
	String courseName;
	int mark;

	public Student() {
		System.out.println(" default constructor");
	}

	public Student(int studenId, String studentName, String courseName, int mark) {
		super();
		this.studenId = studenId;
		this.studentName = studentName;
		this.courseName = courseName;
		this.mark = mark;
	}
	public String grade(){
		String result=" ";
				if(mark>90){
					result="grade A";
				}else if(mark>70){
					result="Grade B";
				}else{
					result="grade c";
				}return result;
				
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1=new Student(18,"A Rahman","MCA",91);
System.out.println("studentId: "+s1.studenId);

System.out.println("studentName: "+s1.studentName);
System.out.println("Student course:"+s1.courseName);
System.out.println("Grade:"+s1.grade());

	}

}
