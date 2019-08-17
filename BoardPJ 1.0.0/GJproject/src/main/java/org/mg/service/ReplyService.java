package org.mg.service;

import java.util.List;

import org.mg.domain.ReplyVO;
import org.mg.domain.Criteria;
import org.mg.domain.ReplyPageDTO;

public interface ReplyService 
{
	public int register(ReplyVO vo);
	
	public ReplyVO get(Long rno);
	
	public int modify(ReplyVO vo);
	
	public int remove(Long rno);
	
	public List<ReplyVO> getList(Criteria cri, Long bno);
	
	public ReplyPageDTO getListPage(Criteria cri, Long bno);
}
