package comm.example.jdbc;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Employee implements Serializable{

	private static final long serialVersionUID = -8841758879078031804L;
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private double salary;
	

}
