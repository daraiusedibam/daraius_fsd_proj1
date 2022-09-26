package run;

import java.util.Random;
import java.util.Scanner;

//Email Administrator Application
//scenario: task of creating email accounts for new hires.
public class Setup {
	
	private String email;
	private String password;
	
	public String Email(String firstName,String lastName,String department) { 
		email=firstName+lastName+"@"+department+".company.com";
		password=Password();
		return firstName+lastName+"@"+department+".company.com";
		
		
	}



	public String Password() {             
		
		String setpass = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxys0123456789!@#$%*&^()";
		Random random = new Random();
		char [] password = new char[8];
		for(int i=0;i<8;i++) {
			
			int rand=(int) (Math.random()*setpass.length());
			password[i]=setpass.charAt(rand);
			
	}
		 	
	return new String (password);  
		
	}
	
	
	public void display(Employee emp,String email,String password) {   
		
		System.out.println("Email--->>>"+email);
		System.out.println("Password--->>>"+password);
	}
	
	

}