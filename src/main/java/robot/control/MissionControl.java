package robot.control;

public class MissionControl{
	public Roboter roboter;

	public MissionControl(){
		this.roboter= new RobotNord();
	}

	public static MissionControl create(){
		return new MissionControl();
	}

	public void print() {
		this.roboter.print();
	}

	public void step() {
		this.roboter.step();
	}

	public void turn() {
		this.roboter=this.roboter.turn();
	}
}
