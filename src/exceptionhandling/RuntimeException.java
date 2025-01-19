package exceptionhandling;

public class RuntimeException {

public static void main(String[] args) throws UnAuthorisedUser  {

	String userName = "Shiv";  // authentic user 
	String userWhoTriesToLogin = "Shiv";
	
	if(userName.equals(userWhoTriesToLogin)) {
		System.out.println("Access Granted");
	}else {
	
		throw new UnAuthorisedUser("User is unauthorised");
		
	}

	System.out.println("Able to access payments page");



	}

}
