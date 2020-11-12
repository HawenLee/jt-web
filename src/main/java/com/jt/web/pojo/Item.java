package com.jt.web.pojo;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.jt.common.po.BasePojo;

@Table(name="tb_item")
public class Item extends BasePojo implements Serializable{		
	private static final long serialVersionUID = -7032780277160439870L;	
	//这里因为已经在父类中序列化接口了，子类不必要再序列化了
	@Id//定义主键
	//定义主键自增
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;//商品id
	private String title;//商品标题
	private String sellPoint;//卖点信息
	private Long price;//商品价格  Long double（精度没有Long高）
	private Integer num;//商品数量
	private String barcode;//二维码信息,条形码信息
	private String image;//商品图片信息 1.jpg,2.jpg,....
	private Long cid;//商品分类id
	private Integer status;//默认值为1，可选值：1正常，2下架，3删除
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSellPoint() {
		return sellPoint;
	}
	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", sellPoint=" + sellPoint + ", price=" + price + ", num=" + num
				+ ", barcode=" + barcode + ", image=" + image + ", cid=" + cid + ", status=" + status + "]";
	}	
}
