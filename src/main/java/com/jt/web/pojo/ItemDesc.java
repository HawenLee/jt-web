package com.jt.web.pojo;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

import com.jt.common.po.BasePojo;
@Table(name="tb_item_desc")
public class ItemDesc extends BasePojo implements Serializable{
	private static final long serialVersionUID = -8218329125816886872L;
	@Id//表示主键，并不需要添加新增
	private Long itemId;//商品id,
	private String itemDesc;//商品详情
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
}
