package site.metacoding.red.web.dto.response.boards;

public class PagingDto {
	private Integer startNum;
	private Integer totalCount;
	private Integer totalPage; // 23 / 10 나머지 있으면 +1
	private Integer currentPage;
	private boolean isLast;
	private boolean isFirst;
}
