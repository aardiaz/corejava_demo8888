package objectwitharray;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		//store and print data of 5 students
		
		//create array
		Student[] students = getStudentArray();  
		
		printStudentArray(students);
		
	}

	private static void printStudentArray(Student[] students) {
		for(Student s : students) {
			
			System.out.println(s);
			
//			 if(s.getCollege().equals("IT")) {
//			         // System.out.println(s);
//				// cnt++;
//				// tsalary = tsalary + s.getAge();
//			 }
		}
	}

	private static Student[] getStudentArray() {
		Student  students[] = new Student[5];
		
		//write data in array
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<students.length; i++) {
			
		    Student s = new Student();
		    
		    System.out.println("Enter id ");
		    s.setId(sc.nextInt());
		    
		    System.out.println("Enter fname ");
		    s.setFname(sc.next());
		    
		    s.setLname("Sha");
		    s.setAge(20);
		    s.setCollege("KEC");
		    s.setCity("Pokhara");
		    
		    students[i] = s;
		}
		return students;
	}

	
}
