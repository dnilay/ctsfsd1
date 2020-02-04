package comm.example;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User {
private String id;
private String userName;
private String password;
}
