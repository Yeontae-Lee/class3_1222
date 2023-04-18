package com.itwillbs.spring_mvc_board_lyt.mapper;

import com.itwillbs.spring_mvc_board_lyt.vo.BoardVO;

public interface BoardMapper {

	// 글 쓰기
	int insertBoard(BoardVO board);

}
