package personStuff;

public class Occupation {

	private String companyName;
	private String jobTitle;
	
	public Occupation(){
		companyName = "Mr.O Inc";
		jobTitle = "Computer Programmer";
	}
	
	public String nameTag(){
		return companyName+ "\n"+ jobTitle;
	}
}
