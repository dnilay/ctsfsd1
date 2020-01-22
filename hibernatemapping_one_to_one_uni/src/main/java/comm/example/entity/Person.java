package comm.example.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Person {
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String uId;
	@Column(name = "name")
	private String cName;
	@Column(name = "dob")
	private LocalDate dateOfBirth;
	public Person(String uId, String cName, LocalDate dateOfBirth) {
		super();
		this.uId = uId;
		this.cName = cName;
		this.dateOfBirth = dateOfBirth;
	}

	

}
