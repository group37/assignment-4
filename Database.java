import java.util.ArrayList;

// stuff to put in test data for teams
// array of teams?

public class Database {
	//public enum Division { JUNIOR, ADULT_BEGINNER, ADULT_INTERMEDIATE, ADULT_ADVANCED, SENIOR }
	ArrayList<Team> juniors = new ArrayList<Team>(6);
	ArrayList<Team> begginers = new ArrayList<Team>(6);
	ArrayList<Team> intermediates = new ArrayList<Team>(6);
	ArrayList<Team> advanced = new ArrayList<Team>(6);
	ArrayList<Team> seniors = new ArrayList<Team>(6);
	
	Database(){

		juniors.add(new Team("1", "Team One", Team.Division.JUNIOR, "Alice", "alice@email.com", "123 4567", "765 4321"));
		juniors.add(new Team("2", "Team 2", Team.Division.JUNIOR, "Ben", "ben@mail.com", "123 4567", "765 4321"));
		juniors.add(new Team("3", "Team 3", Team.Division.JUNIOR, "Chris", "chris@gmail.com", "123 4567", "765 4321"));
		juniors.add(new Team("4", "Team 4", Team.Division.JUNIOR, "David", "david@gmail.com", "123 4567", "765 4321"));
		juniors.add(new Team("5", "Team 5", Team.Division.JUNIOR, "Ed", "ed@hotmail.com", "123 4567", "765 4321"));
<<<<<<< HEAD
		juniors.add(new Team("6", "Team 6", Team.Division.JUNIOR, "F", "f@email.com", "123 4567", "765 4321"));
=======
<<<<<<< HEAD
		juniors.add(new Team("6", "Team 6", Team.Division.JUNIOR, "F", "f@email.com", "123 4567", "765 4321"));
=======
		juniors.add(new Team("6", "Team 6", Team.Division.JUNIOR, "Fred", "fred@email.com", "123 4567", "765 4321"));
>>>>>>> origin/master
>>>>>>> origin/master
		//seniors.addAll(c);
			
//		teamSenior[7] = new Team("7", "Team 7", Team.Division.ADULT_ADVANCED, "Dr X", "x@email.com", "123 4567", "765 4321");
//		teamSenior[8] = new Team("8", "Team 8", Team.Division.ADULT_ADVANCED, "Dr Y", "x@email.com", "123 4567", "765 4321");
//		teamSenior[9] = new Team("9", "Team 9", Team.Division.SENIOR, "X", "x@email.com", "123 4567", "765 4321");
//		teamSenior[10] = new Team("10", "Team 10", Team.Division.SENIOR, "Y", "x@email.com", "123 4567", "765 4321");
	}
}
/*
 * 



 * 
 * */
