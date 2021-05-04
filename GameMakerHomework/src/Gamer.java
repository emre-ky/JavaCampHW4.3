
public class Gamer {
	
	private int id;
	private String FirstName;
	private String LastName;
	private int BirthDate;
	private long NationalIdentity;
	
	
	public Gamer() {
	
	}


	public Gamer(int id, String firstName, String lastName, int birthDate, long nationalIdentity) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		BirthDate = birthDate;
		NationalIdentity = nationalIdentity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public int getBirthDate() {
		return BirthDate;
	}


	public void setBirthDate(int birthDate) {
		BirthDate = birthDate;
	}


	public long getNationalIdentity() {
		return NationalIdentity;
	}


	public void setNationalIdentity(long nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
	
	
	
	
	
	
	}


