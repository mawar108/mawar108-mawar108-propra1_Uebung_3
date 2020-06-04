package robot.control;

public class RobotSued extends Roboter implements Commands{

	public RobotSued(){
		super();
	}

	public RobotSued(int x, int y) {
		super(x,y);
	}

	public void step() {
		this.x=x-1;
	}

	public Roboter turn(){
		return new RobotWest(this.x, this.y);
	}

	@Override
	public void print() {
		System.out.println("Robot is facing Sued at ("+ x + ","+ y +")");
	}


}

