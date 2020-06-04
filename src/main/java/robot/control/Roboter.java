package robot.control;

public class Roboter {
	public int x;
	public int y;

	public Roboter(){
		this.x=0;
		this.y=0;
	}

	public Roboter(int x, int y){
		this.x=x;
		this.y=y;
	}

	public void print(){
		System.out.print("Robot is facing Fehler at ("+ x + ","+ y +")");
	}

	public void step() {

	}

	public Roboter turn() {
		return null;
	}
}
