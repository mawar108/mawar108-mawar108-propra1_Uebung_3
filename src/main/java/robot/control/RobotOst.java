package robot.control;

public class RobotOst extends Roboter implements Commands {

	public RobotOst(){
		super();
	}

	public RobotOst(int x, int y) {
		super(x,y);
	}

	public void step() {
		this.y=y+1;
	}

	public Roboter turn(){
		return new RobotSued(this.x, this.y);
	}

	@Override
	public void print() {
		System.out.println("Robot is facing Ost at ("+ x + ","+ y +")");
	}


}
