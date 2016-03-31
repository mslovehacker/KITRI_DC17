package com.kitri.fpgw.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kitri.fpgw.model.BoardTextCommentDto;
import com.kitri.fpgw.model.BoardTextMainDto;
import com.kitri.fpgw.model.BoardTextViewDto;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public ArrayList<BoardTextMainDto> BoardTextSelectAll(BoardTextMainDto boardTextMainDto) throws Exception {

		List<BoardTextMainDto> list = sqlSessionTemplate.selectList("BoardTextSelectAll", boardTextMainDto);
		
		return (ArrayList<BoardTextMainDto>) list;
	}

	@Override
	public BoardTextMainDto BoardTextSelect(int intSeq) throws Exception {

		return sqlSessionTemplate.selectOne("BoardTextSelect", intSeq);
	}

	@Override
	public void BoardTextInsert(BoardTextMainDto boardTextMainDto) throws Exception {

		sqlSessionTemplate.insert("BoardTextInsert", boardTextMainDto);
	}

	@Override
	public void BoardTextModify(BoardTextMainDto boardTextMainDto) throws Exception {

		sqlSessionTemplate.update("BoardTextModify", boardTextMainDto);
	}

	@Override
	public void BoardTextDelete(int intSeq) throws Exception {

		sqlSessionTemplate.delete("BoardTextDelete", intSeq);
	}

	@Override
	public void BoardTextView(BoardTextViewDto boardTextViewDto) throws Exception {

		sqlSessionTemplate.insert("BoardTextViewCount", boardTextViewDto);
	}

	@Override
	public ArrayList<BoardTextCommentDto> BoardTextCommentList(int intPSeq) throws Exception {

		List<BoardTextCommentDto> list = sqlSessionTemplate.selectList("BoardTextCommentList", intPSeq);
		
		return (ArrayList<BoardTextCommentDto>) list;
	}

	@Override
	public void BoardCommentInsert(BoardTextCommentDto boardTextCommentDto) throws Exception {

		sqlSessionTemplate.insert("BoardTextCommentInsert", boardTextCommentDto);
	}

	@Override
	public void BoardCommentDelete(int intSeq) throws Exception {

		sqlSessionTemplate.delete("BoardTextCommentDelete", intSeq);
	
	}

	
	
}
