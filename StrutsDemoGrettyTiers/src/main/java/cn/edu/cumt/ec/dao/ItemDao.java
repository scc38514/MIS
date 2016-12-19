package cn.edu.cumt.ec.dao;

import java.util.List;
import cn.edu.cumt.ec.entity.Item;

public interface ItemDao {
	public boolean add(Item item);
	public boolean update(Item oldItem,Item newItem);
	public boolean delete(Item item);
	public List<Item> getAll();
}
