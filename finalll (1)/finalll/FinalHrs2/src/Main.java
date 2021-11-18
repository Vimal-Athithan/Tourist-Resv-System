

import java.util.Scanner;



public class Main extends Menu{
	static boolean z;
	public static void main(String[] args) {
		
			Startpoint();

	}

	static void Startpoint(){
	
		System.out.print("\n1.Login \n2.Admin Login  \n3.Register \n\nEnter your choice :");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
    	int choice = scanner.nextInt();
    	scanner.nextLine();
switch(choice) {
    	
    	case 1 :
    		
    			LoginPart();
    			menu();
    			
    			
    		break;
			
    	case 2 :
    		AdminLogPart();
    		menu();
    		break;
    		
    	case 3 :
    		
    		RegPart();
    		
    		break;
    	default :
    			System.out.println("________________________________");
    			System.out.println("\n>>> Invalid choice <<<\n>>> Please try again <<< ");
    			System.out.println("________________________________\n");
    			Startpoint();
    		}
	}
	

	private static void AdminLogPart() {

		boolean AdmLogStatus = LoginClass.adminLogin();
		if(AdmLogStatus ==true) {
			System.out.println("You are successfully logged in !");
		
		}
		else {
			System.out.println("___________________________________");
			System.out.println("\n****** Invalid Credentials *******\n>>>>>> Please try again <<<<<<");
			System.out.println("___________________________________");
			AdminLogPart();
			
		}
		
	}

	private static void RegPart() {
	
			boolean RegStatus =LoginReg.registration();
			if(RegStatus==true) {
				System.out.println("Registered successfully :) ");
				System.out.println("\n>>> Redirecting to Home page <<<\n");
			menu();	
			}
			else {
			System.out.println("Registration unsuccessful :( \n Please try again...");
			
			RegPart();
			}
			
	}

	

	private static void LoginPart(){

		
		
			boolean LogStatus = LoginClass.login();
			if(LogStatus ==true) {
				System.out.println("You are successfully logged in !");
				
			}
			else {
				System.out.println("___________________________________");
				System.out.println("\n****** Invalid Credentials *******\n>>>>>> Please try again <<<<<<");
				System.out.println("___________________________________");
				LoginPart();
				
				
			} 
		
		
	}
}

