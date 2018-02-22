package personStuff;

public class Person {
	private String name;
	private double salary;
	private Occupation job;
	private Address place;
	private InterestingFacts boring;
	private Projects cool;
	private Schedule wierd;

	public Person() {
		name = "Dave Ryan";
		salary = 80282.0;
		job = new Occupation();
		place = new Address();
		boring = new InterestingFacts();
		cool = new Projects();
		wierd = new Schedule();
	}

	public void moreMoney() {
		salary += 1000.0;
	}
	
}
