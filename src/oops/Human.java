package oops;

public class Human {
	
	//Constructor concept

	String clr;
	String height;
	String bloodGrp;
	String weight;

	Human(String clr, String height, String bloodGrp, String weight) {
		this.clr = clr;
		this.height = height;
		this.bloodGrp = bloodGrp;     // this used to reffer current class instance variable 
		this.weight = weight;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human lalit = new Human("black", "158", "O+ve", "58");

		Human shiv = new Human("black", "190", "B+ve", "90");
		Human ajay = new Human("black", "130", "B-ve", "-90");

//		lalit.clr = "black";
//		lalit.height = "158";
//		lalit.bloodGrp = "O+ve";
//		lalit.weight = "58";
//
//		shiv.clr = "black";
//		shiv.height = "158";
//		shiv.bloodGrp = "O+ve";
//		shiv.weight = "O+ve";
//
//		ajay.clr = "black";
//		ajay.height = "158";
//		ajay.bloodGrp = "O+ve";
//		ajay.weight = "O+ve";

		System.out.println("For lalit " + "clr is " + lalit.clr + " weight " + lalit.weight + " bloodGrp "
				+ lalit.bloodGrp + " height " + lalit.height);
	}

}
