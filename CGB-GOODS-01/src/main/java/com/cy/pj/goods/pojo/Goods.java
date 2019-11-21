package com.cy.pj.goods.pojo;
import java.util.Date;
import lombok.Data;

@Data
public class Goods {
	private Long id;
	private String name;
	private String remark;
	private Date createdTime;
}
