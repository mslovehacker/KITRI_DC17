package com.kitri.fpgw.service;

import java.util.ArrayList;

import com.kitri.fpgw.model.BoardTextCommentDto;
import com.kitri.fpgw.model.BoardTextMainDto;
import com.kitri.fpgw.model.BoardTextViewDto;

public interface BoardService {

	public ArrayList<BoardTextMainDto> BoardTextSelectAll(BoardTextMainDto boardTextMainDto) throws Exception;
	public BoardTextMainDto BoardTextSelect(int intSeq) throws Exception;
	public void BoardTextInsert(BoardTextMainDto boardTextMainDto) throws Exception;
	public void BoardTextModify(BoardTextMainDto boardTextMainDto) throws Exception;
	public void BoardTextDelete(int intSeq) throws Exception;
	public void BoardTextView(BoardTextViewDto boardTextViewDto) throws Exception;
	public ArrayList<BoardTextCommentDto> BoardTextCommentList(int intPSeq) throws Exception;
	public void BoardCommentInsert(BoardTextCommentDto boardTextCommentDto) throws Exception;
	public void BoardCommentDelete(int intSeq) throws Exception;
}
