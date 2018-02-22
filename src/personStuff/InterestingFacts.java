package personStuff;
import java.util.ArrayList;
public class InterestingFacts {

	private ArrayList <String> funFacts;
	
	public InterestingFacts(){
		funFacts = new ArrayList<String>();
		funFacts.add("I like ice cream");
		funFacts.add("I have never been to Europe");
	}
	public String aboutMe(){
		String full = "";
		int counter = 1;
		for(String temp : funFacts){
			full = full + counter + ". " + temp + '\n';
			counter++;
		}
		return full;
	}
}
