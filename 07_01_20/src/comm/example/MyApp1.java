package comm.example;

public class MyApp1 {

	public static void main(String[] args) {
		MyCard card1=new MyCard(SUIT.CLUBS);
		System.out.println("Card Name: "+card1.getSuit().getName()+" Card Rank: "+card1.getSuit().getRank());
		

	}

}
