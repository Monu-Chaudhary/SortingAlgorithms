/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;


public class Main
{
	public static void main(String[] args) {
	    List<Person> lst = new ArrayList<>();
	    lst.add(new Person("Monu", "Chaudhary"));
	    lst.add(new Person("Ranjana", "Chaudhary"));
	    lst.add(new Person("Raju", "Chaudhary"));
	    lst.add(new Person("Yogesh", "Chaudhary"));
	    lst.add(new Person("Richa", "Chaudhary"));
	    lst.add(new Person("Ranjeet", "Jaiswal"));
	    lst.add(new Person("Manoj", "Agrahari"));
	    lst.add(new Person("Bishal", "Baaniya"));
	    lst.add(new Person("Nabin", "Bhandari"));
	    lst.add(new Person("Shova", "Thapa"));
	    lst.add(new Person("Anish", "Shrestha"));
	    lst.add(new Person("Alisha", "Sharma"));
	    
	   // Collections.sort(lst, (a,b)->{
	   //     return a.lastName.compareTo(b.lastName);
	   // });
	   
	   Collections.sort(lst);
	    
	    for (Person p: lst) {
	        		System.out.println(p.toString());
	    }
	}
}
