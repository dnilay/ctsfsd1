package comm.example.spring.hibernate.demo;

import comm.example.spring.hibernate.demo.entity.UserDetail;

public interface UserService {
	public UserDetail createUser(UserDetail user);
}
