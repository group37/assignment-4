import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Frame_Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTabbedPane TabbedPane = null;
	private JPanel Panel_Schedule = null;
	private JPanel Panel_Team = null;
	private JPanel Panel_Rankings = null;
	private JPanel Panel_Scores = null;
	private JPanel Panel_Checklist = null;
	private JLabel Label_Schedule_GameID = null;
	private JLabel Label_Schedule_Week = null;
	private JLabel Label_Schedule_Time = null;
	private JLabel Label_Schedule_Venue = null;
	private JLabel Label_Schedule_Teams = null;
	private JComboBox ComboBox_Team_Division = null;
	private JComboBox ComboBox_Team_TeamName = null;
	private JLabel Label_Team_TeamName = null;
	private JLabel Label_Team_All_Divisions = null;
	private JLabel Label_Team_Details = null;
	private JLabel Label_Team_TeamID = null;
	private JLabel Label_Team_Name = null;
	private JLabel Label_Team_Division = null;
	private JLabel Label_Team_Contact_Info = null;
	private JButton Button_Team_Edit_Name = null;
	private JButton Button_Team_Edit_Division = null;
	private JLabel Label_Team_Contact_Person = null;
	private JLabel Label_Team_Contact_Email = null;
	private JLabel Label_Team_Contact_HomeNumber = null;
	private JLabel Label_Team_Contact_MobileNumber = null;
	private JButton Button_Team_Edit_Person = null;
	private JButton Button_Team_Edit_Email = null;
	private JButton Button_Team_Edit_HomeNumber = null;
	private JButton Button_Team_Edit_MobileNumber = null;
	private JLabel Label_Scores_GameID = null;
	private JComboBox ComboBox_Scores_GameID = null;
	private JLabel Label_Scores_Match = null;
	private JComboBox ComboBox_Scores_TeamA = null;
	private JLabel Label_Scores_Vs = null;
	private JComboBox ComboBox_Scores_TeamB = null;
	private JLabel Label_Scores_Scores = null;
	/**
	 * This method initializes TabbedPane	
	 * 	
	 * @return javax.swing.JTabbedPane	
	 */
	private JTabbedPane getTabbedPane() {
		if (TabbedPane == null) {
			TabbedPane = new JTabbedPane();
			TabbedPane.addTab("Schedules", null, getPanel_Schedule(), "View and orgainise the schedules");
			TabbedPane.addTab("Teams", null, getPanel_Team(), "View team information");
			TabbedPane.addTab("Scores", null, getPanel_Scores(), "View and change scores");
			TabbedPane.addTab("Rankings", null, getPanel_Rankings(), "View the rankings");
			TabbedPane.addTab("Checklist", null, getPanel_Checklist(), "Checklist of what you need to remember");
		}
		return TabbedPane;
	}

	/**
	 * This method initializes Panel_Schedule	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanel_Schedule() {
		if (Panel_Schedule == null) {
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 4;
			gridBagConstraints11.gridy = 1;
			Label_Schedule_Teams = new JLabel();
			Label_Schedule_Teams.setText("Team Matchup");
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 3;
			gridBagConstraints3.gridy = 1;
			Label_Schedule_Venue = new JLabel();
			Label_Schedule_Venue.setText("Venue");
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 2;
			gridBagConstraints2.gridy = 1;
			Label_Schedule_Time = new JLabel();
			Label_Schedule_Time.setText("Time");
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.gridy = 1;
			Label_Schedule_Week = new JLabel();
			Label_Schedule_Week.setText("Week");
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
			gridBagConstraints.gridy = 1;
			Label_Schedule_GameID = new JLabel();
			Label_Schedule_GameID.setText("Game ID");
			Panel_Schedule = new JPanel();
			Panel_Schedule.setLayout(new GridBagLayout());
			Panel_Schedule.setName("Schedule");
			Panel_Schedule.add(Label_Schedule_GameID, gridBagConstraints);
			
			Panel_Schedule.add(Label_Schedule_Week, gridBagConstraints1);
			Panel_Schedule.add(Label_Schedule_Time, gridBagConstraints2);
			Panel_Schedule.add(Label_Schedule_Venue, gridBagConstraints3);
			Panel_Schedule.add(Label_Schedule_Teams, gridBagConstraints11);
		}
		return Panel_Schedule;
	}

	/**
	 * This method initializes Panel_Team	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanel_Team() {
		if (Panel_Team == null) {
			GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
			gridBagConstraints23.gridx = 19;
			gridBagConstraints23.gridy = 12;
			GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
			gridBagConstraints22.gridx = 19;
			gridBagConstraints22.gridy = 11;
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.gridx = 19;
			gridBagConstraints21.gridy = 10;
			GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
			gridBagConstraints20.gridx = 19;
			gridBagConstraints20.gridy = 9;
			GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
			gridBagConstraints19.gridx = 1;
			gridBagConstraints19.gridy = 12;
			Label_Team_Contact_MobileNumber = new JLabel();
			Label_Team_Contact_MobileNumber.setText("Mobile Number:");
			GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
			gridBagConstraints18.gridx = 1;
			gridBagConstraints18.gridy = 11;
			Label_Team_Contact_HomeNumber = new JLabel();
			Label_Team_Contact_HomeNumber.setText("Home Number:");
			GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
			gridBagConstraints17.gridx = 1;
			gridBagConstraints17.gridy = 10;
			Label_Team_Contact_Email = new JLabel();
			Label_Team_Contact_Email.setText("Email:");
			GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
			gridBagConstraints16.gridx = 1;
			gridBagConstraints16.gridy = 9;
			Label_Team_Contact_Person = new JLabel();
			Label_Team_Contact_Person.setText("Contact Person:");
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			gridBagConstraints15.gridx = 19;
			gridBagConstraints15.gridy = 7;
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			gridBagConstraints14.gridx = 19;
			gridBagConstraints14.gridy = 6;
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			gridBagConstraints13.gridx = 0;
			gridBagConstraints13.gridy = 8;
			Label_Team_Contact_Info = new JLabel();
			Label_Team_Contact_Info.setText("Contact Information:");
			GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
			gridBagConstraints12.gridx = 1;
			gridBagConstraints12.gridy = 7;
			Label_Team_Division = new JLabel();
			Label_Team_Division.setText("Team Division");
			GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
			gridBagConstraints10.gridx = 1;
			gridBagConstraints10.gridy = 6;
			Label_Team_Name = new JLabel();
			Label_Team_Name.setText("Team Name");
			GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
			gridBagConstraints9.gridx = 1;
			gridBagConstraints9.gridy = 5;
			Label_Team_TeamID = new JLabel();
			Label_Team_TeamID.setText("Team ID");
			GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
			gridBagConstraints8.gridx = 0;
			gridBagConstraints8.gridy = 4;
			Label_Team_Details = new JLabel();
			Label_Team_Details.setText("Details:");
			GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
			gridBagConstraints7.gridx = 0;
			gridBagConstraints7.gridy = 2;
			Label_Team_All_Divisions = new JLabel();
			Label_Team_All_Divisions.setText("Division");
			GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
			gridBagConstraints6.gridx = 0;
			gridBagConstraints6.gridy = 3;
			Label_Team_TeamName = new JLabel();
			Label_Team_TeamName.setText("Team Name");
			GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
			gridBagConstraints5.gridy = 3;
			gridBagConstraints5.gridx = 14;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridy = 2;
			gridBagConstraints4.gridx = 14;
			Panel_Team = new JPanel();
			Panel_Team.setLayout(new GridBagLayout());
			Panel_Team.setName("Teams");
			Panel_Team.add(getComboBox_Team_Division(), gridBagConstraints4);
			Panel_Team.add(getComboBox_Team_TeamName(), gridBagConstraints5);
			Panel_Team.add(Label_Team_TeamName, gridBagConstraints6);
			Panel_Team.add(Label_Team_All_Divisions, gridBagConstraints7);
			Panel_Team.add(Label_Team_Details, gridBagConstraints8);
			Panel_Team.add(Label_Team_TeamID, gridBagConstraints9);
			Panel_Team.add(Label_Team_Name, gridBagConstraints10);
			Panel_Team.add(Label_Team_Division, gridBagConstraints12);
			Panel_Team.add(Label_Team_Contact_Info, gridBagConstraints13);
			Panel_Team.add(getButton_Team_Edit_Name(), gridBagConstraints14);
			Panel_Team.add(getButton_Team_Edit_Division(), gridBagConstraints15);
			Panel_Team.add(Label_Team_Contact_Person, gridBagConstraints16);
			Panel_Team.add(Label_Team_Contact_Email, gridBagConstraints17);
			Panel_Team.add(Label_Team_Contact_HomeNumber, gridBagConstraints18);
			Panel_Team.add(Label_Team_Contact_MobileNumber, gridBagConstraints19);
			Panel_Team.add(getButton_Team_Edit_Person(), gridBagConstraints20);
			Panel_Team.add(getButton_Team_Edit_Email(), gridBagConstraints21);
			Panel_Team.add(getButton_Team_Edit_HomeNumber(), gridBagConstraints22);
			Panel_Team.add(getButton_Team_Edit_MobileNumber(), gridBagConstraints23);
			
		}
		return Panel_Team;
	}

	/**
	 * This method initializes Panel_Rankings	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanel_Rankings() {
		if (Panel_Rankings == null) {
			Panel_Rankings = new JPanel();
			Panel_Rankings.setLayout(new GridBagLayout());
			Panel_Rankings.setName("Rankings");
		}
		return Panel_Rankings;
	}

	/**
	 * This method initializes Panel_Scores	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanel_Scores() {
		if (Panel_Scores == null) {
			GridBagConstraints gridBagConstraints30 = new GridBagConstraints();
			gridBagConstraints30.gridx = 0;
			gridBagConstraints30.gridy = 2;
			Label_Scores_Scores = new JLabel();
			Label_Scores_Scores.setText("Scores:");
			GridBagConstraints gridBagConstraints29 = new GridBagConstraints();
			gridBagConstraints29.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints29.gridy = 2;
			gridBagConstraints29.weightx = 1.0;
			gridBagConstraints29.gridx = 3;
			GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
			gridBagConstraints28.gridx = 2;
			gridBagConstraints28.gridy = 2;
			Label_Scores_Vs = new JLabel();
			Label_Scores_Vs.setText("VS");
			GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
			gridBagConstraints27.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints27.gridy = 2;
			gridBagConstraints27.weightx = 1.0;
			gridBagConstraints27.gridx = 1;
			GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
			gridBagConstraints26.gridx = 2;
			gridBagConstraints26.gridy = 1;
			Label_Scores_Match = new JLabel();
			Label_Scores_Match.setText("Team Match:");
			GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
			gridBagConstraints25.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints25.gridy = 0;
			gridBagConstraints25.weightx = 1.0;
			gridBagConstraints25.gridx = 1;
			GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
			gridBagConstraints24.gridx = 0;
			gridBagConstraints24.gridy = 0;
			Label_Scores_GameID = new JLabel();
			Label_Scores_GameID.setText("Game ID:");
			Panel_Scores = new JPanel();
			Panel_Scores.setLayout(new GridBagLayout());
			Panel_Scores.setName("Scores");
			Panel_Scores.add(Label_Scores_GameID, gridBagConstraints24);
			Panel_Scores.add(getComboBox_Scores_GameID(), gridBagConstraints25);
			Panel_Scores.add(Label_Scores_Match, gridBagConstraints26);
			Panel_Scores.add(getComboBox_Scores_TeamA(), gridBagConstraints27);
			Panel_Scores.add(Label_Scores_Vs, gridBagConstraints28);
			Panel_Scores.add(getComboBox_Scores_TeamB(), gridBagConstraints29);
			Panel_Scores.add(Label_Scores_Scores, gridBagConstraints30);
		}
		return Panel_Scores;
	}

	/**
	 * This method initializes Panel_Checklist	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getPanel_Checklist() {
		if (Panel_Checklist == null) {
			Panel_Checklist = new JPanel();
			Panel_Checklist.setLayout(new GridBagLayout());
			Panel_Checklist.setName("Checklist");
		}
		return Panel_Checklist;
	}

	/**
	 * This method initializes ComboBox_Team_Division	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_Team_Division() {
		if (ComboBox_Team_Division == null) {
			ComboBox_Team_Division = new JComboBox();
		}
		return ComboBox_Team_Division;
	}

	/**
	 * This method initializes ComboBox_Team_TeamName	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_Team_TeamName() {
		if (ComboBox_Team_TeamName == null) {
			ComboBox_Team_TeamName = new JComboBox();
		}
		return ComboBox_Team_TeamName;
	}

	/**
	 * This method initializes Button_Team_Edit_Name	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Team_Edit_Name() {
		if (Button_Team_Edit_Name == null) {
			Button_Team_Edit_Name = new JButton();
			Button_Team_Edit_Name.setText("Edit");
		}
		return Button_Team_Edit_Name;
	}

	/**
	 * This method initializes Button_Team_Edit_Division	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Team_Edit_Division() {
		if (Button_Team_Edit_Division == null) {
			Button_Team_Edit_Division = new JButton();
			Button_Team_Edit_Division.setText("Edit");
		}
		return Button_Team_Edit_Division;
	}

	/**
	 * This method initializes Button_Team_Edit_Person	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Team_Edit_Person() {
		if (Button_Team_Edit_Person == null) {
			Button_Team_Edit_Person = new JButton();
			Button_Team_Edit_Person.setText("Edit");
		}
		return Button_Team_Edit_Person;
	}

	/**
	 * This method initializes Button_Team_Edit_Email	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Team_Edit_Email() {
		if (Button_Team_Edit_Email == null) {
			Button_Team_Edit_Email = new JButton();
			Button_Team_Edit_Email.setText("Edit");
		}
		return Button_Team_Edit_Email;
	}

	/**
	 * This method initializes Button_Team_Edit_HomeNumber	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Team_Edit_HomeNumber() {
		if (Button_Team_Edit_HomeNumber == null) {
			Button_Team_Edit_HomeNumber = new JButton();
			Button_Team_Edit_HomeNumber.setText("Edit");
		}
		return Button_Team_Edit_HomeNumber;
	}

	/**
	 * This method initializes Button_Team_Edit_MobileNumber	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Team_Edit_MobileNumber() {
		if (Button_Team_Edit_MobileNumber == null) {
			Button_Team_Edit_MobileNumber = new JButton();
			Button_Team_Edit_MobileNumber.setText("Edit");
		}
		return Button_Team_Edit_MobileNumber;
	}

	/**
	 * This method initializes ComboBox_Scores_GameID	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_Scores_GameID() {
		if (ComboBox_Scores_GameID == null) {
			ComboBox_Scores_GameID = new JComboBox();
			ComboBox_Scores_GameID.set
		}
		return ComboBox_Scores_GameID;
	}

	/**
	 * This method initializes ComboBox_Scores_TeamA	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_Scores_TeamA() {
		if (ComboBox_Scores_TeamA == null) {
			ComboBox_Scores_TeamA = new JComboBox();
		}
		return ComboBox_Scores_TeamA;
	}

	/**
	 * This method initializes ComboBox_Scores_TeamB	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_Scores_TeamB() {
		if (ComboBox_Scores_TeamB == null) {
			ComboBox_Scores_TeamB = new JComboBox();
		}
		return ComboBox_Scores_TeamB;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Frame_Main thisClass = new Frame_Main();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public Frame_Main() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(607, 357);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getTabbedPane(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"