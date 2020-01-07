package comm.example;

public enum SUIT {
	SPADES("Spades card.", 1), 
	CLUBS("Clubs Card", 2),
	HEARTS("Hearts card", 3),
	DIAMONDS("Diamonds card", 4);
	private final String name;
	private final int rank;

	private SUIT(String n, int r) {

		rank = r;
		name = n;
	}

	public String getName() {
		return name;
	}

	public int getRank() {
		return rank;
	}
}
