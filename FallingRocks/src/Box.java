public class Box {
	public int x, y;
	public final static int BOX_SIZE = 20;

	public Box(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object obj) {
			Box b = (Box) obj;
			return (Game.ship.getTopX() == b.x);
	}
}
