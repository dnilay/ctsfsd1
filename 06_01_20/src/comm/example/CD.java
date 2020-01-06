package comm.example;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class CD {
	private int cdId;
	private String cdName;
	private String genre;
	private double price;

	@Override
	public String toString() {
		return "CD==>cdId= " + cdId + " cdName= " + cdName + " genre= " + genre + " price= " + price + "$";
	}

	public void getCDType(CD cd) {
		if(cd instanceof InternationalCD)
		{
			InternationalCD iCD=(InternationalCD)cd;
			System.out.println(iCD);
		}

	}

}
