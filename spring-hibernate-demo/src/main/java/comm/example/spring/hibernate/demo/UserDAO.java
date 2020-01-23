package comm.example.spring.hibernate.demo;

import comm.example.spring.hibernate.demo.entity.UserDetail;

public interface UserDAO {
	public UserDetail createUser(UserDetail user);

}
