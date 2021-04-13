package pattern.strategy;

public class War {

	public static void main(String[] args) {
		
		Character king = new King();
		king.fight();
		
		Character knight = new Knight();
		knight.fight();
	}

}
