// stuff to put in test data for teams
// array of teams?
//import src.Team;
public class Database {
	public enum Division { JUNIOR, ADULT_BEGINNER, ADULT_INTERMEDIATE, ADULT_ADVANCED, SENIOR }
	Team[] teams = new Team[10];
	
	teams[0] = new Team("1", "Team One", Division.JUNIOR, "Mr X", "x@email.com", "123 4567", "765 4321");

}

