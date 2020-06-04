package robot.control;

public class RobotNord extends Roboter implements Commands {

	public RobotNord(){
		super();
	}

	public RobotNord(int x, int y) {
		super(x,y);
	}

	public void step() {
		this.x= x+1;
	}

	public Roboter turn(){
		return new RobotOst(this.x, this.y);
	}


	public void print() {
		System.out.println("Robot is facing Nord at ("+ x + ","+ y +")");
	}
}
