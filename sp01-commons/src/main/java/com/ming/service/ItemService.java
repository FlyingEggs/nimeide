package com.ming.service;

import java.util.List;

import com.ming.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}
