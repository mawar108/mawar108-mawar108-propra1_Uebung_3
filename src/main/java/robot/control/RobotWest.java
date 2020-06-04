package robot.control;

public class RobotWest extends Roboter implements Commands {

	public RobotWest(){
		super();
	}

	public RobotWest(int x, int y) {
		super(x,y);
	}

	public void step() {
		this.y= y-1;
	}

	public Roboter turn(){
		return new RobotNord(this.x, this.y);
	}

	@Override
	public void print() {
		System.out.println("Robot is facing West at ("+ x + ","+ y +")");
	}


}
