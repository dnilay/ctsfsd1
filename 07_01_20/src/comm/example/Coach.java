package comm.example;

public class Coach {
	private String coachId;
	private String firstName;
	private String lastName;
	private String coachesFor;

	public Coach() {
		super();
	}

	public Coach(String coachId, String firstName, String lastName, String coachesFor) {
		super();
		this.coachId = coachId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.coachesFor = coachesFor;
	}

	@Override
	public String toString() {
		return "Coach Details: \ncoachId=" + coachId + " firstName=" + firstName + "" + " lastName=" + lastName
				+ " coachesFor=" + coachesFor;
	}

	@Override
	public boolean equals(Object object) {

		Coach theCoach = null;
		boolean isEqual=false;
		if (object instanceof Coach) {
			theCoach = (Coach) object;
		}
		if((this.getFirstName()==theCoach.getFirstName()) &&
				(this.getLastName()==theCoach.getLastName()) &&(this.getCoachesFor()==theCoach.getCoachesFor()))
		{
			isEqual=true;
		}
		return isEqual;

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCoachesFor() {
		return coachesFor;
	}

	public void setCoachesFor(String coachesFor) {
		this.coachesFor = coachesFor;
	}

}
