package com.bamboo.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bamboo.board.dao.BoardDao;
import com.bamboo.board.model.BoardDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao BoardDao; // --- Dao 빈 주입

	@Override
	public List<BoardDto> postList(BoardDto boardDto) {
		
		return BoardDao.postList(boardDto);
	}

	@Override
	public int postAdd(BoardDto boardDto) {
		
		return BoardDao.postAdd(boardDto);
	}
	
	@Override
	public int postBlock(String userIp, int blockTime) {
		
		return BoardDao.postBlock(userIp, blockTime);
	}
	
	@Override
	public BoardDto postSelect(BoardDto boardDto) {
		return BoardDao.postSelect(boardDto);
	}

	@Override
	public int pwdCheck(BoardDto boardDto) {
		
		return BoardDao.pwdCheck(boardDto);
	}
	
	@Override
	public int postRevise(BoardDto boardDto) {
		
		return BoardDao.postRevise(boardDto);
	}

	@Override
	public int postDelete(BoardDto boardDto) {
		
		return BoardDao.postDelete(boardDto);
	}

}
