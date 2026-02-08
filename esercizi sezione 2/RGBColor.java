package esercizi;

public class RGBColor {
	private int red;
	private int green;
	private int blue;

	public RGBColor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return this.red;
	}

	public int getGreen() {
		return this.green;
	}

	public int getBlue() {
		return this.blue;
	}

	public void invert() {
		this.red = 255 - this.red;
		this.green = 255 - this.green;
		this.blue = 255 - this.blue;
	}
}