import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JTabbedPane;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;

public class Frame_Main extends JFrame {
	
	String[] DivisionStrings = { "U16", "Beginner", "Intermediate", "Advanced", "Senior" };
	
	//array of 2d arrays
	ArrayList<String[]>u16 = new ArrayList<String[]>(5);
	ArrayList<String[]>beginner = new ArrayList<String[]>(5);
	ArrayList<String[]>intermediate = new ArrayList<String[]>(5);
	ArrayList<String[]>advanced = new ArrayList<String[]>(5);
	ArrayList<String[]>senior = new ArrayList<String[]>(5);
	
/*	String[][] advanced = { 
			{"Ultimate Black","Advanced","2","Lisa Ellis","lisae745@hotmail.com","(09) 234 56 78","0212985630","Score"},
			{"WeGotThis","Advanced","3","John Ford","JFord12@msn.com","(09) 123 45 56","0273098126","Score"},
			};*/
	
/*	String[][][] teams = 
	{ 
			{//advanced teams
			{"Ultimate Black","Advanced","2","Lisa Ellis","lisae745@hotmail.com","(09) 234 56 78","0212985630","Score"},
			{"WeGotThis","Advanced","3","John Ford","JFord12@msn.com","(09) 123 45 56","0273098126","Score"},
			}
	};*/
	
	
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
	private JComboBox ComboBox_Rankings_Division = null;
	private JLabel Label_Rankings_Division = null;
	private JLabel Label_Rankings_Team = null;
	private JLabel Label_Rankings_Rank = null;
	private JLabel Label_Rankings_PointsFor = null;
	private JLabel Label_Rankings_PointsAgainst = null;
	private JButton Button_Organise = null;
	private JButton Button_Save = null;
	private JButton Button_Cancel = null;
	private JComboBox ComboBox_Schedules_Week = null;
	private JLabel Label_Schedule_WeekChoice = null;
	private JLabel Label_Schedule_Division = null;
	private JComboBox ComboBox_Schedules_Division = null;
	private JButton Button_PrintRules = null;
	private JButton Button_PrintChecklist = null;
	private JSplitPane jSplitPane_Checklists = null;
	private JEditorPane jEditorPane_Rules = null;
	private JEditorPane jEditorPane_Checklist = null;
	private JTextArea TextArea_Teams_Email = null;
	private JTextArea TextArea_Teams_HomeNumber = null;
	private JTextArea TextArea_Teams_MobileNumber = null;
	private JTextArea TextArea_Teams_Division = null;
	private JTextArea TextArea_Teams_TeamName = null;
	private JTextArea TextArea_Teams_TeamID = null;
	private JButton Button_Teams_RemoveTeam = null;
	private JTextArea TextArea_Teams_ContactPerson = null;
	
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
			GridBagConstraints gridBagConstraints181 = new GridBagConstraints();
			gridBagConstraints181.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints181.gridy = 2;
			gridBagConstraints181.weightx = 1.0;
			gridBagConstraints181.gridx = 1;
			GridBagConstraints gridBagConstraints171 = new GridBagConstraints();
			gridBagConstraints171.gridx = 0;
			gridBagConstraints171.gridy = 2;
			Label_Schedule_Division = new JLabel();
			Label_Schedule_Division.setText("Division:");
			GridBagConstraints gridBagConstraints161 = new GridBagConstraints();
			gridBagConstraints161.gridx = 0;
			gridBagConstraints161.gridy = 0;
			Label_Schedule_WeekChoice = new JLabel();
			Label_Schedule_WeekChoice.setText("Week:");
			GridBagConstraints gridBagConstraints151 = new GridBagConstraints();
			gridBagConstraints151.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints151.gridy = 0;
			gridBagConstraints151.weightx = 1.0;
			gridBagConstraints151.gridx = 1;
			GridBagConstraints gridBagConstraints37 = new GridBagConstraints();
			gridBagConstraints37.gridx = 8;
			gridBagConstraints37.gridy = 0;
			GridBagConstraints gridBagConstraints210 = new GridBagConstraints();
			gridBagConstraints210.gridx = 7;
			gridBagConstraints210.gridy = 0;
			GridBagConstraints gridBagConstraints110 = new GridBagConstraints();
			gridBagConstraints110.gridx = 6;
			gridBagConstraints110.gridy = 0;
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 4;
			gridBagConstraints11.gridy = 4;
			Label_Schedule_Teams = new JLabel();
			Label_Schedule_Teams.setText("Team Matchup");
			GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
			gridBagConstraints3.gridx = 3;
			gridBagConstraints3.gridy = 4;
			Label_Schedule_Venue = new JLabel();
			Label_Schedule_Venue.setText("Venue");
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 2;
			gridBagConstraints2.gridy = 4;
			Label_Schedule_Time = new JLabel();
			Label_Schedule_Time.setText("Time");
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.gridy = 4;
			Label_Schedule_Week = new JLabel();
			Label_Schedule_Week.setText("Week");
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
			gridBagConstraints.gridy = 4;
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
			Panel_Schedule.add(getButton_Organise(), gridBagConstraints110);
			Panel_Schedule.add(getButton_Save(), gridBagConstraints210);
			Panel_Schedule.add(getButton_Cancel(), gridBagConstraints37);
			Panel_Schedule.add(getComboBox_Schedules_Week(), gridBagConstraints151);
			Panel_Schedule.add(Label_Schedule_WeekChoice, gridBagConstraints161);
			Panel_Schedule.add(Label_Schedule_Division, gridBagConstraints171);
			Panel_Schedule.add(getComboBox_Schedules_Division(), gridBagConstraints181);
			
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
			GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
			gridBagConstraints41.fill = GridBagConstraints.BOTH;
			gridBagConstraints41.gridy = 10;
			gridBagConstraints41.weightx = 1.0;
			gridBagConstraints41.weighty = 1.0;
			gridBagConstraints41.gridx = 2;
			GridBagConstraints gridBagConstraints48 = new GridBagConstraints();
			gridBagConstraints48.gridx = 4;
			gridBagConstraints48.gridy = 14;
			GridBagConstraints gridBagConstraints47 = new GridBagConstraints();
			gridBagConstraints47.fill = GridBagConstraints.BOTH;
			gridBagConstraints47.gridy = 5;
			gridBagConstraints47.weightx = 1.0;
			gridBagConstraints47.weighty = 1.0;
			gridBagConstraints47.gridx = 2;
			GridBagConstraints gridBagConstraints46 = new GridBagConstraints();
			gridBagConstraints46.fill = GridBagConstraints.BOTH;
			gridBagConstraints46.gridy = 6;
			gridBagConstraints46.weightx = 1.0;
			gridBagConstraints46.weighty = 1.0;
			gridBagConstraints46.gridx = 2;
			GridBagConstraints gridBagConstraints45 = new GridBagConstraints();
			gridBagConstraints45.fill = GridBagConstraints.BOTH;
			gridBagConstraints45.gridy = 7;
			gridBagConstraints45.weightx = 1.0;
			gridBagConstraints45.weighty = 1.0;
			gridBagConstraints45.gridx = 2;
			GridBagConstraints gridBagConstraints44 = new GridBagConstraints();
			gridBagConstraints44.fill = GridBagConstraints.BOTH;
			gridBagConstraints44.gridy = 13;
			gridBagConstraints44.weightx = 1.0;
			gridBagConstraints44.weighty = 1.0;
			gridBagConstraints44.gridx = 2;
			GridBagConstraints gridBagConstraints43 = new GridBagConstraints();
			gridBagConstraints43.fill = GridBagConstraints.BOTH;
			gridBagConstraints43.gridy = 12;
			gridBagConstraints43.weightx = 1.0;
			gridBagConstraints43.weighty = 1.0;
			gridBagConstraints43.gridx = 2;
			GridBagConstraints gridBagConstraints42 = new GridBagConstraints();
			gridBagConstraints42.fill = GridBagConstraints.BOTH;
			gridBagConstraints42.gridy = 11;
			gridBagConstraints42.weightx = 1.0;
			gridBagConstraints42.weighty = 1.0;
			gridBagConstraints42.gridx = 2;
			GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
			gridBagConstraints23.gridx = 3;
			gridBagConstraints23.gridy = 13;
			GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
			gridBagConstraints22.gridx = 3;
			gridBagConstraints22.gridy = 12;
			GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
			gridBagConstraints21.gridx = 3;
			gridBagConstraints21.gridy = 11;
			GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
			gridBagConstraints20.gridx = 3;
			gridBagConstraints20.gridy = 10;
			GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
			gridBagConstraints19.gridx = 1;
			gridBagConstraints19.gridy = 13;
			
			Label_Team_Contact_MobileNumber = new JLabel();
			Label_Team_Contact_MobileNumber.setText("Mobile Number:");
			GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
			gridBagConstraints18.gridx = 1;
			gridBagConstraints18.gridy = 12;
			
			Label_Team_Contact_HomeNumber = new JLabel();
			Label_Team_Contact_HomeNumber.setText("Home Number:");
			GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
			gridBagConstraints17.gridx = 1;
			gridBagConstraints17.gridy = 11;
			
			Label_Team_Contact_Email = new JLabel();
			Label_Team_Contact_Email.setText("Email:");
			GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
			gridBagConstraints16.gridx = 1;
			gridBagConstraints16.gridy = 10;
			
			Label_Team_Contact_Person = new JLabel();
			Label_Team_Contact_Person.setText("Contact Person:");
			GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
			gridBagConstraints15.gridx = 3;
			gridBagConstraints15.gridy = 7;
			GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
			gridBagConstraints14.gridx = 3;
			gridBagConstraints14.gridy = 6;
			GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
			gridBagConstraints13.gridx = 0;
			gridBagConstraints13.gridy = 9;
			
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
			gridBagConstraints7.anchor = GridBagConstraints.CENTER;
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
			gridBagConstraints5.gridx = 2;
			GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
			gridBagConstraints4.gridy = 2;
			gridBagConstraints4.gridx = 2;
			
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
			Panel_Team.add(getTextArea_Teams_Email(), gridBagConstraints42);
			Panel_Team.add(getTextArea_Teams_HomeNumber(), gridBagConstraints43);
			Panel_Team.add(getTextArea_Teams_MobileNumber(), gridBagConstraints44);
			Panel_Team.add(getTextArea_Teams_Division(), gridBagConstraints45);
			Panel_Team.add(getTextArea_Teams_TeamName(), gridBagConstraints46);
			Panel_Team.add(getTextArea_Teams_TeamID(), gridBagConstraints47);
			Panel_Team.add(getButton_Teams_RemoveTeam(), gridBagConstraints48);
			Panel_Team.add(getTextArea_Teams_ContactPerson(), gridBagConstraints41);
			
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
			GridBagConstraints gridBagConstraints36 = new GridBagConstraints();
			gridBagConstraints36.gridx = 5;
			gridBagConstraints36.gridy = 1;
			Label_Rankings_PointsAgainst = new JLabel();
			Label_Rankings_PointsAgainst.setText("Points Against:");
			GridBagConstraints gridBagConstraints35 = new GridBagConstraints();
			gridBagConstraints35.gridx = 2;
			gridBagConstraints35.gridy = 1;
			Label_Rankings_PointsFor = new JLabel();
			Label_Rankings_PointsFor.setText("Points For:");
			GridBagConstraints gridBagConstraints34 = new GridBagConstraints();
			gridBagConstraints34.gridx = 0;
			gridBagConstraints34.gridy = 1;
			Label_Rankings_Rank = new JLabel();
			Label_Rankings_Rank.setText("Rank:");
			GridBagConstraints gridBagConstraints33 = new GridBagConstraints();
			gridBagConstraints33.gridx = 1;
			gridBagConstraints33.gridy = 1;
			Label_Rankings_Team = new JLabel();
			Label_Rankings_Team.setText("Team:");
			GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
			gridBagConstraints32.gridx = 0;
			gridBagConstraints32.gridy = 0;
			Label_Rankings_Division = new JLabel();
			Label_Rankings_Division.setText("Division:");
			GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
			gridBagConstraints31.fill = GridBagConstraints.VERTICAL;
			gridBagConstraints31.gridy = 0;
			gridBagConstraints31.weightx = 1.0;
			gridBagConstraints31.gridx = 1;
			Panel_Rankings = new JPanel();
			Panel_Rankings.setLayout(new GridBagLayout());
			Panel_Rankings.setName("Rankings");
			Panel_Rankings.add(getComboBox_Rankings_Division(), gridBagConstraints31);
			Panel_Rankings.add(Label_Rankings_Division, gridBagConstraints32);
			Panel_Rankings.add(Label_Rankings_Team, gridBagConstraints33);
			Panel_Rankings.add(Label_Rankings_Rank, gridBagConstraints34);
			Panel_Rankings.add(Label_Rankings_PointsFor, gridBagConstraints35);
			Panel_Rankings.add(Label_Rankings_PointsAgainst, gridBagConstraints36);
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
			//gridBagConstraints24.
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
			GridBagConstraints gridBagConstraints49 = new GridBagConstraints();
			gridBagConstraints49.fill = GridBagConstraints.BOTH;
			gridBagConstraints49.gridy = 1;
			gridBagConstraints49.weightx = 1.0;
			gridBagConstraints49.weighty = 1.0;
			gridBagConstraints49.gridx = 1;
			GridBagConstraints gridBagConstraints40 = new GridBagConstraints();
			gridBagConstraints40.fill = GridBagConstraints.BOTH;
			gridBagConstraints40.gridy = 1;
			gridBagConstraints40.weightx = 1.0;
			gridBagConstraints40.weighty = 1.0;
			gridBagConstraints40.gridwidth = 5;
			gridBagConstraints40.anchor = GridBagConstraints.CENTER;
			gridBagConstraints40.gridx = 8;
			GridBagConstraints gridBagConstraints39 = new GridBagConstraints();
			gridBagConstraints39.gridx = 12;
			gridBagConstraints39.anchor = GridBagConstraints.EAST;
			gridBagConstraints39.gridy = 0;
			GridBagConstraints gridBagConstraints38 = new GridBagConstraints();
			gridBagConstraints38.gridx = 1;
			gridBagConstraints38.anchor = GridBagConstraints.WEST;
			gridBagConstraints38.gridy = 0;
			Panel_Checklist = new JPanel();
			Panel_Checklist.setLayout(new GridBagLayout());
			Panel_Checklist.setName("Checklist");
			Panel_Checklist.add(getButton_PrintRules(), gridBagConstraints38);
			Panel_Checklist.add(getButton_PrintChecklist(), gridBagConstraints39);
			Panel_Checklist.add(getJSplitPane_Checklists(), gridBagConstraints40);
			Panel_Checklist.add(getJEditorPane_Rules(), gridBagConstraints49);
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
            
            ComboBox_Team_Division = new JComboBox(DivisionStrings);
            
            ComboBox_Team_Division.addItemListener(new ItemListener(){
            	public void itemStateChanged(ItemEvent e) {
            		//change item in other combobox
            		if(ComboBox_Schedules_Division.getSelectedIndex() != ComboBox_Team_Division.getSelectedIndex()){
            			ComboBox_Schedules_Division.setSelectedIndex(ComboBox_Team_Division.getSelectedIndex());
            		}
            		//change the array to the appropriate one e.g.advance, u16 etc
            	}
            });
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
			ComboBox_Team_TeamName = new JComboBox(beginner.toArray());
		}
		ComboBox_Team_TeamName.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				// save old value
				
				//get relevant array
				//int selectedIndex = ComboBox_Team_TeamName.getSelectedIndex();
				String[] teamInfo = (String[]) ComboBox_Team_TeamName.getSelectedItem();
				
				//change text boxes
				TextArea_Teams_TeamName.setText(teamInfo[0]);
				TextArea_Teams_Division.setText(teamInfo[1]);
				TextArea_Teams_TeamID.setText(teamInfo[2]);
				TextArea_Teams_ContactPerson.setText(teamInfo[3]);
				TextArea_Teams_Email.setText(teamInfo[4]);
				TextArea_Teams_HomeNumber.setText(teamInfo[5]);
				TextArea_Teams_MobileNumber.setText(teamInfo[6]);
				//score
				
				
				
			}
			
		});
		
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
			Button_Team_Edit_Name.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e) {
            		
            		String str = JOptionPane.showInputDialog(null, "Enter desired team name: ", 
            				"Edit Team Name", 1);
            		// use str to edit array values here
            		TextArea_Teams_TeamName.setText(str);
            		
            		
            	}
            });
			
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
			//ComboBox_Scores_GameID.set
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
	 * This method initializes ComboBox_Rankings_Division	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_Rankings_Division() {
		if (ComboBox_Rankings_Division == null) {
			ComboBox_Rankings_Division = new JComboBox();
		}
		return ComboBox_Rankings_Division;
	}

	/**
	 * This method initializes Button_Organise	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Organise() {
		if (Button_Organise == null) {
			Button_Organise = new JButton();
			Button_Organise.setText("Orgainise Teams");
		}
		return Button_Organise;
	}

	/**
	 * This method initializes Button_Save	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Save() {
		if (Button_Save == null) {
			Button_Save = new JButton();
			Button_Save.setText("Save");
		}
		return Button_Save;
	}

	/**
	 * This method initializes Button_Cancel	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Cancel() {
		if (Button_Cancel == null) {
			Button_Cancel = new JButton();
			Button_Cancel.setText("Cancel");
		}
		return Button_Cancel;
	}

	/**
	 * This method initializes ComboBox_Schedules_Week	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_Schedules_Week() {
		if (ComboBox_Schedules_Week == null) {
			ComboBox_Schedules_Week = new JComboBox();
		}
		return ComboBox_Schedules_Week;
	}

	/**
	 * This method initializes ComboBox_Schedules_Division	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getComboBox_Schedules_Division() {
		if (ComboBox_Schedules_Division == null) {
			
			ComboBox_Schedules_Division = new JComboBox(DivisionStrings);
			ComboBox_Schedules_Division.addItemListener(new ItemListener(){
            	public void itemStateChanged(ItemEvent e) {
            		//change item in other combobox
            		if(ComboBox_Team_Division.getSelectedIndex() != ComboBox_Schedules_Division.getSelectedIndex()){
            			ComboBox_Team_Division.setSelectedIndex(ComboBox_Schedules_Division.getSelectedIndex());
            			ComboBox_Team_Division.repaint();
            		}
            		
            	}
            });
		}
		return ComboBox_Schedules_Division;
	}

	/**
	 * This method initializes Button_PrintRules	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_PrintRules() {
		if (Button_PrintRules == null) {
			Button_PrintRules = new JButton();
			Button_PrintRules.setText("Print Rules");
		}
		return Button_PrintRules;
	}

	/**
	 * This method initializes Button_PrintChecklist	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_PrintChecklist() {
		if (Button_PrintChecklist == null) {
			Button_PrintChecklist = new JButton();
			Button_PrintChecklist.setText("Print Checklist");
		}
		return Button_PrintChecklist;
	}

	/**
	 * This method initializes jSplitPane_Checklists	
	 * 	
	 * @return javax.swing.JSplitPane	
	 */
	private JSplitPane getJSplitPane_Checklists() {
		if (jSplitPane_Checklists == null) {
			jSplitPane_Checklists = new JSplitPane();
			jSplitPane_Checklists.setContinuousLayout(true);
			jSplitPane_Checklists.setRightComponent(getJEditorPane_Checklist());
		}
		return jSplitPane_Checklists;
	}

	/**
	 * This method initializes jEditorPane_Rules	
	 * 	
	 * @return javax.swing.JEditorPane	
	 */
	private JEditorPane getJEditorPane_Rules() {
		if (jEditorPane_Rules == null) {
			jEditorPane_Rules = new JEditorPane();
			jEditorPane_Rules.setText("Ultimate in 10 simple rules"
   +"\n1. The Field -- A rectangular shape with endzones at each end. A regulation field is 64m by 37m, with endzones 18m deep."
   +"\n2. Initiate Play -- Each point begins with both teams lining up on the front of their respective endzone line. The defense throws (\"pulls\") the disc to the offense. A regulation game has seven players per team."
   +"\n3. Scoring -- Each time the offense completes a pass in the defense's endzone, the offense scores a point. Play is initiated after each score."
   +"\n4. Movement of the Disc -- The disc may be advanced in any direction by completing a pass to a teammate. Players may not run with the disc. The person with the disc (\"thrower\") has ten seconds to throw the disc. The defender guarding the thrower (\"marker\") counts out the stall count."
   +"\n5. Change of possession -- When a pass in not completed (e.g. out of bounds, drop, block, interception), the defense immediately takes possession of the disc and becomes the offense."
   +"\n6. Substitutions -- Players not in the game may replace players in the game after a score and during an injury timeout."
   +"\n7. Non-contact -- No physical contact is allowed between players. Picks and screens are also prohibited. A foul occurs when contact is made."
   +"\n8. Fouls -- When a player initiates contact on another player a foul occurs. When a foul disrupts possession, the play resumes as if the possession was retained. If the player committing the foul disagrees with the foul call, the play is redone."
   +"\n9. Self-Refereeing -- Players are responsible for their own foul and line calls. Players resolve their own disputes."
   +"\n10. Spirit of the Game -- Ultimate stresses sportsmanship and fair play. Competitive play is encouraged, but never at the expense of respect between players, adherence to the rules, and the basic joy of play.");
		}
		return jEditorPane_Rules;
	}

	/**
	 * This method initializes jEditorPane_Checklist	
	 * 	
	 * @return javax.swing.JEditorPane	
	 */
	private JEditorPane getJEditorPane_Checklist() {
		if (jEditorPane_Checklist == null) {
			jEditorPane_Checklist = new JEditorPane();
			jEditorPane_Checklist.setText("To do: "
					+"\n- Check venue location and game times"
					+"\n- Contact both teams contact person"
					+"\n- Organise referees for each game"
					+"\n- Bring rules sheet"
					+"\n- Bring score sheet"
					+"\n- Record and enter final scores in the system"
					+"\n\nEquipment:"
					+"\n- Frisbee"
					+"\n- Cones"
					+"\n- Water"
					+"\n- Whistle"
					+"\n- Different colour singlets for each team"
					+"\n- First Aid Kit");
		}
		return jEditorPane_Checklist;
	}

	/**
	 * This method initializes TextArea_Teams_Email	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getTextArea_Teams_Email() {
		if (TextArea_Teams_Email == null) {
			TextArea_Teams_Email = new JTextArea();
		}
		return TextArea_Teams_Email;
	}

	/**
	 * This method initializes TextArea_Teams_HomeNumber	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getTextArea_Teams_HomeNumber() {
		if (TextArea_Teams_HomeNumber == null) {
			TextArea_Teams_HomeNumber = new JTextArea();
		}
		return TextArea_Teams_HomeNumber;
	}

	/**
	 * This method initializes TextArea_Teams_MobileNumber	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getTextArea_Teams_MobileNumber() {
		if (TextArea_Teams_MobileNumber == null) {
			TextArea_Teams_MobileNumber = new JTextArea();
		}
		return TextArea_Teams_MobileNumber;
	}

	/**
	 * This method initializes TextArea_Teams_Division	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getTextArea_Teams_Division() {
		if (TextArea_Teams_Division == null) {
			TextArea_Teams_Division = new JTextArea();
		}
		return TextArea_Teams_Division;
	}

	/**
	 * This method initializes TextArea_Teams_TeamName	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getTextArea_Teams_TeamName() {
		if (TextArea_Teams_TeamName == null) {
			TextArea_Teams_TeamName = new JTextArea();
		}
		return TextArea_Teams_TeamName;
	}

	/**
	 * This method initializes TextArea_Teams_TeamID	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getTextArea_Teams_TeamID() {
		if (TextArea_Teams_TeamID == null) {
			TextArea_Teams_TeamID = new JTextArea();
		}
		return TextArea_Teams_TeamID;
	}

	/**
	 * This method initializes Button_Teams_RemoveTeam	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getButton_Teams_RemoveTeam() {
		if (Button_Teams_RemoveTeam == null) {
			Button_Teams_RemoveTeam = new JButton();
			Button_Teams_RemoveTeam.setText("Remove Team");
		}
		return Button_Teams_RemoveTeam;
	}

	/**
	 * This method initializes TextArea_Teams_ContactPerson	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getTextArea_Teams_ContactPerson() {
		if (TextArea_Teams_ContactPerson == null) {
			TextArea_Teams_ContactPerson = new JTextArea();
		}
		return TextArea_Teams_ContactPerson;
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
	
		u16.add(new String[] {"B&W","U16","5","Jeff Daniels","jeffd77@hotmail.com","(09) 333 33 33","0211548962","Score"});
		u16.add(new String[] {"StayFit","U16","6","Graeme Turner","GTurner14@msn.com","(09) 222 22 22","0271168524","Score"});
		u16.add(new String[] {"NoLimit","U16","7","Kate Fu","KateF99@gmail.com","(09) 444 44 44","021045897","Score"});
		
		advanced.add(new String[] {"Ultimate Black","Advanced","2","Lisa Ellis","lisae745@hotmail.com","(09) 234 56 78","0212985630","Score"});
		advanced.add(new String[] {"WeGotThis","Advanced","3","John Ford","JFord12@msn.com","(09) 123 45 56","0273098126","Score"});
		advanced.add(new String[] {"JustDoIt","Advanced","8","Steve Allan","steveallan45@yahoo.com","(09) 555 55 55","0211457896","Score"});
		advanced.add(new String[] {" Auckland's Best","Advanced","10","David Ruth","D.ruth@htotmail.com","(09) 777 77 77","0218888888","Score"});
		
		beginner.add(new String[] {"InMotion", "Beginner", "14", "Jonah Lomu", "JLomu@hotmail.com", "(09) 537 53 53", "0214444444", "Score"});
		beginner.add(new String[] {"Team Ben", " Beginner",  "15", "David Tua", "abc@hotmail.com", "(09) 987 65 54", "0211234567", "Score"});
		beginner.add(new String[] {"Team Sop", "Beginner", "16", "Mike Tyson", "soppyboi@hotmail.com", "(09) 564 23 21", "0219876543", "Score"});
		beginner.add(new String[] {"Team Edward", "Beginner", "17",  "John Campbell", "kak@hotmail.com", "(09) 489 23 00",  "0211472583", "Score"});
		beginner.add(new String[] {"Team Regardt", "Beginner", "18", "Sherlock Holmes", "whoAmI@hotmail.com", "(09) 000 00 00",  "0219638527", "Score"});
		
		senior.add(new String[] {"LosingIsNotOk","Senior", "12", "Mel Gibson", "M.G@hotmail.com", "(09) 999 99 99", "0212222222", "Score"});
		senior.add(new String[] {"ActiveForLife", "Senior", "13", "Micheal Jackson", "mick@hotmail.com", "(09) 800 83 83", "0213333333", "Score"});
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(607, 418);
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
