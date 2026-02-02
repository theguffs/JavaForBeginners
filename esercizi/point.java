package esercizi;

public class point {
	private int x;
	private int y;

	public point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void move(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	public double distanceTo(Point other) {
		this.x -this.x - other.x;
		this.y -this.y - other.y;
	 return Math.sqrt(diffx * diffx + diffy * diffy)
 }
}
