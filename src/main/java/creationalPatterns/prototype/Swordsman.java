package creationalPatterns.prototype;


//supports cloning
public class Swordsman extends GameUnit {

	private String state = "idle";

	public void attack() {
		this.state = "attacking";
	}

	@Override
	public String toString() {
		return "Swordsman "+state+" @ "+getPosition();
	}

	//when client creates clone of Swordsman state will be idle
	@Override
	protected void reset() {
		state = "idle";
	}

	
}
