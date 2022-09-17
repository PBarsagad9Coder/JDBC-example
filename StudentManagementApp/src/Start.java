import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.mysql.cj.conf.IntegerPropertyDefinition;
import com.student.manager.Student;
import com.student.manager.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome sir Prince");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
        	System.out.println("press 1 to Add student");
        	System.out.println("press 2 to Deleta student");
        	System.out.println("press 3 to Display student");
        	System.out.println("press 4 to Update student");
        	System.out.println("press 5 to Exit App");
        	int c=Integer.parseInt(br.readLine());
        	if (c==1) 
        	{
				//add student
        		System.out.println("Enter student name: ");
        		String name=br.readLine();
        		
        		System.out.println("Enter student phone: ");
        		String phone=br.readLine();
        		
        		System.out.println("Enter student city: ");
        		String city=br.readLine();
        		
        		//creating object to store student
        		Student st=new Student(name,phone,city);
        		boolean answer=StudentDao.insertStudentIntoDb(st);
        		if(answer) {
        			System.out.println("student added successfully");
        		}else {
					System.out.println("something went wrong");
				}
			}
        	else if (c==2) 
        	{
				// delete student
				System.out.println("Enter student id to delete the entry");
				int id=Integer.parseInt(br.readLine());
				boolean answer2=StudentDao.deleteStudent(id);
				if(answer2) {
        			System.out.println("student deleted successfully");
        		}else {
					System.out.println("something went wrong");
				}
				
			}
			else if (c==3) 
			{
				// display student
				System.out.println("These is the Student Data");
	        StudentDao.displayStudent();
			}
			else if (c==4)
			{
				System.out.println("Enter student id where you want to change data ");
        		int id=Integer.parseInt(br.readLine());
        		
				System.out.println("Enter updated student name: ");
        		String name=br.readLine();
        		
        		System.out.println("Enter updated student phone: ");
        		String phone=br.readLine();
        		
        		System.out.println("Enter updated student city: ");
        		String city=br.readLine();
        		Student st=new Student(id,name,phone,city);
				boolean b1=StudentDao.updateStudent(st);
				if(b1) {
        			System.out.println("student Updated successfully");
        		}else {
					System.out.println("something went wrong");
				}
			}
			else if (c==5)
			{
				break;
			}
			else
			{
				System.out.println("Wrong choice");
			}
        }
		System.out.println("Thanks for using my application");
		System.out.println("see you later sir....bye bye");
	}

}
