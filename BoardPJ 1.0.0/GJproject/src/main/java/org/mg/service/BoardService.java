package org.mg.service;

import java.util.List;

import org.mg.domain.BoardVO;
import org.mg.domain.Criteria;

public interface BoardService 
{
	public void register(BoardVO board);
	
	public BoardVO get(Long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(Long bno);
	
	public List<BoardVO> getList(Criteria cri);
	
	public int getTotal(Criteria cri);
}
