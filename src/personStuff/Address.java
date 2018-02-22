package personStuff;

public class Address {

	private String streetAddress; //house number and street
	private String city;
	private String state;
	private String zipCode;
	
	public Address(){
		streetAddress = "123 Main Street";
		city = "Brookfield";
		state = "Wisconsin";
		zipCode = "53005";
	}
	
	public String mailingAddress(){
		return streetAddress + " " + city + " " + state + " " + zipCode;
	}
}
