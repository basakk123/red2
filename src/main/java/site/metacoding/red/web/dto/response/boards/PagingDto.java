package site.metacoding.red.web.dto.response.boards;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PagingDto {
	private Integer totalCount;
	private Integer totalPage; // 23 / 10 나머지 있으면 +1
	private Integer currentPage;
	private boolean isLast;
	private boolean isFirst;
}
