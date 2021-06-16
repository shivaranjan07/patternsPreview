package creationalPatterns.prototype;

import javafx.geometry.Point3D;

/**
 * This class represents an abstract prototype & defines the clone method
 * GameUnit is a marker class it must implement cloneable interface and override clone method
 */
public abstract class GameUnit implements Cloneable {
	
	private Point3D position;
	
	public GameUnit() {
		position = Point3D.ZERO;
	}
	
	// make public so other class can use
	@Override
	public GameUnit clone() throws CloneNotSupportedException {
		GameUnit unit = (GameUnit)super.clone(); //shallow copy cz Point3d is immutable
		unit.initialize();
		return unit;
	}

	//to reset the position of new object
	protected void initialize() {
		this.position = Point3D.ZERO;
		reset();
	}
	
	protected abstract void reset();
	
	public GameUnit(float x, float y, float z) {
		position = new Point3D(x, y, z);
	}

	public void move(Point3D direction, float distance) {
		Point3D finalMove = direction.normalize();
		finalMove = finalMove.multiply(distance);
		position = position.add(finalMove);
	}
	
	public Point3D getPosition() {
		return position;
	}
}
