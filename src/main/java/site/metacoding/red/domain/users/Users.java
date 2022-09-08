package site.metacoding.red.domain.users;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.web.dto.request.boards.UpdateDto;

@Setter
@Getter
public class Users {
	private Integer id;
	private String username;
	private String password;
	private String email;
	private Timestamp createdAt;
	
	public Users(Integer id, String password, String email) {
		super();
		this.id = id;
		this.password = password;
		this.email = email;
	}
	
	
}
