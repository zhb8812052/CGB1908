package com.cy.pj.goods.service.impl;
import java.util.List;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cy.pj.goods.dao.GoodsDao;
import com.cy.pj.goods.pojo.Goods;
import com.cy.pj.goods.service.GoodsService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	 
	@Override
	public List<Goods> findGoods() {
		log.info("start:"+System.currentTimeMillis());
		List<Goods> list = goodsDao.findGoods();
		log.info("end:"+System.currentTimeMillis());
		//模拟耗时操作
		try {Thread.sleep(10000);}catch (Exception e) {
			e.printStackTrace();}
		return list;
	}

}
