package personStuff;
import java.util.ArrayList;
public class Projects{

	private ArrayList<String> completedProjects;
	
	public Projects(){
		completedProjects = new ArrayList<String>();
		completedProjects.add("Project1");
		completedProjects.add("Project2");

	}
	
	public String projectSummary(){
		String everything = "";
		for (String temp : completedProjects){
			everything += temp;
			everything += '\n';
		}
		return everything;
	}
	
}