package cn.edu.cumt.ec.service;

import java.util.List;
import cn.edu.cumt.ec.dao.ItemDao;
import cn.edu.cumt.ec.entity.Item;

public class ItemService {
	public ItemService(){
		super();
	}
	private ItemDao itemDao;
	
	public ItemDao getItemDao() {
		return itemDao;
	}
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}
	public List<Item> getAll() {
		return itemDao.getAll();
	}
}
