package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board->log.info("A"+board));
//	}
//	
//	@Test
//	public void testInsert() {
//		BoardVO board= new BoardVO();
//		board.setTitle("ªı∑Œ¿€ºÕ");
//		board.setContent("æ‚∂Û∏Ææ‚∂Û");
//		board.setWriter("¿Ã«€");
//		
//		mapper.insert(board);
//		log.info(board);
//	}
//	
//	@Test
//	public void testInserSelectKey() {
//		
//		BoardVO board = new BoardVO();
//		board.setTitle("22ªı∑Œ¿€ºÕ");
//		board.setContent("æ‚∂˚ºÕ");
//		board.setWriter("¿Ã«€2");
//		
//		mapper.insertSelectKey(board);
//		log.info(board);
//	}
//	
//	@Test
//	public void testRead() {
//		BoardVO board = mapper.read(5L);
//		log.info("b"+board);
//	}
//	
//	@Test
//	public void testDelete() {
//		log.info("delete count:"+mapper.delete(6L));
//	}
//	
//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		board.setBno(1L);
//		board.setTitle("§ª2");
//		board.setContent("§ª22§ª");
//		board.setWriter("«ÿƒø2");
//		
//		int count = mapper.update(board);
//		log.info("UPDATE COUNT:"+count);
//	}
	
//	@Test
//	public void testPaging() {
//		log.info("pagingTest");
//		Criteria cri = new Criteria();
//		cri.setPageNum(3);
//		cri.setAmount(3);
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		list.forEach(board->log.info(board));
//	}
	
	@Test
	public void testSearch() {
		log.info("zzzz:");
		Criteria cri = new Criteria();
		cri.setKeyword("§ª§ª");
		cri.setType("TC");
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		list.forEach(board->log.info(board));
	}
	


}
