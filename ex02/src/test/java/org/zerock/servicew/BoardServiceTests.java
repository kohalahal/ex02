package org.zerock.servicew;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
//	@Test
//	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("뉴제목2");
//		board.setContent("뉴냉숑22");
//		board.setWriter("이해뤼2");
//		
//		service.register(board);
//		log.info("생성된게시물번호:"+board.getBno());
//	}
//	
//	@Test
//	public void testGetList() {
//		service.getList().forEach(board->log.info(board));
//	}
	
	@Test
	public void testGetListWithCri() {
		service.getList(new Criteria(2,10)).forEach(board->log.info(board));
	}
	
//	@Test
//	public void testGet() {
//		log.info(service.get(1L));
//	}
//
//	@Test
//	public void testDelete() {
//		log.info(service.remove(3L));
//	}
//	
//	@Test
//	public void testUpdate() {
//		BoardVO board = service.get(1L);
//		if(board == null) {
//			return;
//		}
//		board.setTitle("후하하하핳");
//		log.info(service.modify(board));
//	}
}
