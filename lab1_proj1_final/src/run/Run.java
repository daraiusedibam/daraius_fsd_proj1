package run;
import java.util.Scanner;

public class Run {
public static void main(String[] args) {
		
		Employee ep1 = new Employee("firstname", "lastname");      
		Setup sp = new Setup();            
		String finalEmail;                                                 
		String finalPassword;        
		
	
		
		System.out.println("Choose your Department from the following list:");
		System.out.println("1. Technical\n2. Admin\n3. Human Resources\n4. Legal");
		
		Scanner sc = new Scanner(System.in);  
		int input = sc.nextInt();
		
		
		switch (input) {
		
		case 1:{ 
			finalEmail=sp.Email(ep1.FirstName(), ep1.LastName(), "tech");
			finalPassword=sp.Password();
			sp.display(ep1, finalEmail, finalPassword);
			break;
		}
		case 2:{ 
			finalEmail=sp.Email(ep1.FirstName(), ep1.LastName(), "admin");
			finalPassword=sp.Password();
			sp.display(ep1, finalEmail, finalPassword);
			break;

}
			
		case 3 :{ 
			finalEmail=sp.Email(ep1.FirstName(), ep1.LastName(), "hr");
			finalPassword=sp.Password();
			sp.display(ep1, finalEmail, finalPassword);
			break;
}
			
		case 4:{ 
			finalEmail=sp.Email(ep1.FirstName(), ep1.LastName(), "legal");
			finalPassword=sp.Password();
			sp.display(ep1, finalEmail, finalPassword);
			break;
}
			
	}

}
}
