package site.metacoding.red.web.dto.request.users;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.boards.Boards;
import site.metacoding.red.domain.users.Users;

@Getter
@Setter
public class UpdateDto {
	private String password;
	private String email;

	public Users toEntity(Integer id) {
		Users users = new Users(id, this.password, this.email); // 본 코드
		return users;
	}
}
