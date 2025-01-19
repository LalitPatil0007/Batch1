package stringfromjava;

import java.util.ArrayList;
import java.util.List;

public class GetUniqueWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Pune Pune Nashik Mumbai Mumbai Pune";
		String[] s1 = s.split(" ");  // s1 = {"Pune", "Pune", "Nashik", "Mumbai", "Mumbai", "Pune"}
		int count = 0;
		
	
		ArrayList<String> al = new ArrayList<String>();  // String[] al = {"Pune","Mumbai","Nashik"};
		for(int i = 0;i<s1.length;i++) {
			String word = s1[i];
			// add char if its not a space and it should not be already present in list
			if(!al.contains(word) && word != "") {
			al.add(word);
			}
		}
		
	
		
		for(int i = 0 ; i<al.size();i++) {
			String stral = al.get(i);   // for i=0 charFromList=A
			
			for(int j=0 ;j<s1.length;j++) {
				if(stral.equals(s1[j])) {
					count++;
				}
			}
			
			if(count==1) {
				System.out.println("Non-repeating words:"+stral);
			}
			count = 0;
		}
		
		
		
		System.out.println("_____________________________________2nd way easy to get ______________________________________");

        // Input string
        String input = "Pune Pune Nashik Mumbai Mumbai Pune";

        // Split the string into words
        String[] words = input.split(" ");  // words = {"Pune","Pune","Nashik","Mumbai","Mumbai"};  


        for (int i = 0; i < words.length; i++) { // i = 2 , word[i] = Nashik
            boolean isUnique = true;

            for (int j = 0; j < words.length; j++) {  //   j = 4 , i!=j => true , word[j]=word[4] = Mumbai
                if (i != j && words[i].equals(words[j])) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.print("Non-repeating words:"+words[i]);
            }
        }
    
	}




	
}
