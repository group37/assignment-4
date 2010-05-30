//test
public class Team {
	public enum Division { JUNIOR, ADULT_BEGINNER, ADULT_INTERMEDIATE, ADULT_ADVANCED, SENIOR }
	public String teamID;
	public String teamName;
	public Division division; //use enum?
	public String leader;
	public String email;
	public String homeNumber;
	public String mobileNumber;
	
	public Team (String teamID, String teamName, Division division, String leader,String email, String homeNumber, String mobileNumber){
		this.teamID = teamID;
		this.teamName = teamName;
		this.division = division;
		this.leader = leader;
		this.email = email;
		this.homeNumber = homeNumber;
		this.mobileNumber = mobileNumber;
	}
}
