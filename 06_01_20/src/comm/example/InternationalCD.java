package comm.example;




public class InternationalCD extends CD {
	
	private String language;

	public InternationalCD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InternationalCD(int cdId, String cdName, String genre, double price,String language) {
		super(cdId, cdName, genre, price);
		this.language=language;
	}

	@Override
	public String toString() {
		return "InternationalCD==>\n  CD Details=" + super.toString() + "language=" + language;
	}
	
	

}
