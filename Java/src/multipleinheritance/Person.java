package multipleinheritance;

public class Person implements Family , Friends {

	@Override
	public void belongsToFamily() {
		System.out.println("person has family");
		
	}
	@Override
	public void haveFriends() {
		System.out.println("person has friends");
		
	}

}
