package Success;
import java.util.*;

public class Project2 {


	public static void main(String[] args) {
	
		ArrayList<College1> list=new ArrayList<>();
		ArrayList<College1> list1=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("\n");
		System.out.println("1.Enter the Student details");
		System.out.println("2.Diplay the Details");
		System.out.println("3.Display the entire list");
		System.out.println("4.Enter name to search");
		System.out.println("5.Exist");
		System.out.println(" \n");
		System.out.println("Enter the choice:");
		
	
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.println("");
		
		if(choice==1) {
			System.out.println("-----------------------");
			System.out.println("Name");
			String name=sc.nextLine();
			System.out.println("Rollno");
			String rollno=sc.nextLine();
			System.out.println("Department");
			String dept=sc.nextLine();
			
	  list.add(new College1(name, rollno, dept));

      System.out.println("Student added successfully!");
		System.out.println("-----------------------");
					
		}
		else if(choice==2){
			  if (list.isEmpty()) {
                  System.out.println("No student records available.");
              }
			  else {
			for(College1 student: list) {
				System.out.println("|-----------------------------------------|");
				System.out.println(student);
				System.out.println("|-----------------------------------------|");
			}}}
		
		else if(choice==3) {
			
			System.out.println("|--------------------Enter the list-------------------------|");
				System.out.println(" "+list+" ");
			System.out.println("|---------------------------------------------|");
			}
		
		else if(choice==4){
			
			System.out.println("Enter the name to search");
			
			String name=sc.nextLine();
			int count=0;
			for(int i=0;i<list.size();i++) {
				
				if(list.get(i).Name.equals(name)) {				
						System.out.println("Successfully find");
						count++;
				list1.add(list.get(i));	
				}
				
				
			}
			if(count==1) {
				System.out.println("|----------------------------------------|");
			System.out.println(list1.get(0));
			    System.out.println("|----------------------------------------|");
			}
			else if(count>1) {
				System.out.println(list1);
		}
			else  {
				System.out.println(" Name not fount! ");
			}
			}
		else if(choice==5) {
			System.out.println("Exiting program.");
		System.exit(0);
		}
		
//		
//		else {
//		System.out.println("choose the valid details");
//		}
			
		}
	
		}	
			
}
	

	class College1{
		String Name;
		String Rollno;
		String Dept;
		
		College1(String Name,String Rollno,String Dept){
			
		this.Name=Name;
		this.Rollno=Rollno;
		this.Dept=Dept;
		
	}
		public String toString() {
			return "  Name: "+Name+", Rollno: "+Rollno+", Dept: "+Dept;
		}

	}