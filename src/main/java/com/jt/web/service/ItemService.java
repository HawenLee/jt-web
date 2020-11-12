package com.jt.web.service;

import com.jt.web.pojo.Item;
import com.jt.web.pojo.ItemDesc;

public interface ItemService {
	
	//急需发送HTTP请求
	Item findItemById(Long itemId);

	ItemDesc findItemDescById(Long itemId);

}
			