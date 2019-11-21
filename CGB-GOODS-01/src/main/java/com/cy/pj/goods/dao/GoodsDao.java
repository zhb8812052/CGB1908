package com.cy.pj.goods.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.cy.pj.goods.pojo.Goods;

@Mapper
public interface GoodsDao {
	/*获取数据库所有的商品*/
	@Select("select * from tb_goods")
	List<Goods> findGoods();
}
