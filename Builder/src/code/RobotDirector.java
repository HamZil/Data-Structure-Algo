package code;

public class RobotDirector {
	
	private RobotBuilder robotBuilder;
	
	// OldRobotBuilder specification is sent to the engineer
	public RobotDirector(RobotBuilder robotBuilder){
		
		this.robotBuilder = robotBuilder;
	}
	
	// Return the Robot made from the OldRobotBuilder 
	public Robot getRobot(){
		return this.robotBuilder.getRobot();
	}
	
	public void makeRobot() {
		
		
		this.robotBuilder.buildRobotHead();
		this.robotBuilder.buildRobotTorso();
		this.robotBuilder.buildRobotArms();
		this.robotBuilder.buildRobotLegs();
	}
}
