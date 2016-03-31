package com.kitri.fpgw.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitri.fpgw.dao.BoardDao;
import com.kitri.fpgw.model.BoardTextCommentDto;
import com.kitri.fpgw.model.BoardTextMainDto;
import com.kitri.fpgw.model.BoardTextViewDto;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao boardDao;
	
	@Override
	public ArrayList<BoardTextMainDto> BoardTextSelectAll(BoardTextMainDto boardTextMainDto) throws Exception {

		return boardDao.BoardTextSelectAll(boardTextMainDto);
	}

	@Override
	public BoardTextMainDto BoardTextSelect(int intSeq) throws Exception {

		return boardDao.BoardTextSelect(intSeq);
	}

	@Override
	public void BoardTextInsert(BoardTextMainDto boardTextMainDto) throws Exception {

		boardDao.BoardTextInsert(boardTextMainDto);
	}

	@Override
	public void BoardTextModify(BoardTextMainDto boardTextMainDto) throws Exception {

		boardDao.BoardTextModify(boardTextMainDto);
	}

	@Override
	public void BoardTextDelete(int intSeq) throws Exception {

		boardDao.BoardTextDelete(intSeq);
	}

	@Override
	public void BoardTextView(BoardTextViewDto boardTextViewDto) throws Exception {

		boardDao.BoardTextView(boardTextViewDto);
	}

	@Override
	public ArrayList<BoardTextCommentDto> BoardTextCommentList(int intPSeq) throws Exception {

		return boardDao.BoardTextCommentList(intPSeq);
	}

	@Override
	public void BoardCommentInsert(BoardTextCommentDto boardTextCommentDto) throws Exception {

		boardDao.BoardCommentInsert(boardTextCommentDto);
	}

	@Override
	public void BoardCommentDelete(int intSeq) throws Exception {

		boardDao.BoardTextDelete(intSeq);
	}
	
	

}
