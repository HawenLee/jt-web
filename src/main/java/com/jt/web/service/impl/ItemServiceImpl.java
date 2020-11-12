package com.jt.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jt.common.service.HttpClientService;
import com.jt.web.pojo.Item;
import com.jt.web.pojo.ItemDesc;
import com.jt.web.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private HttpClientService httpClient;			

	private static ObjectMapper objectMapper = new ObjectMapper();

	@Override
	public Item findItemById(Long itemId) {
		String url = "http://localhost:8091/web/item/" + itemId;
		// ItemJSON串
		String result = httpClient.doGet(url);
		Item item = null;
		try {
			item = objectMapper.readValue(result, Item.class);
			System.out.println(item.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return item;

	}

	@Override
	public ItemDesc findItemDescById(Long itemId) {
		String url = "http://localhost:8091/web/item/desc/" + itemId	;
		
		String result = httpClient.doGet(url);
		ItemDesc itemDesc = null;
		try {
			itemDesc = objectMapper.readValue(result, ItemDesc.class);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return itemDesc;
	}

}
