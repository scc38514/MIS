package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Item;

public class ItemDaoJDBCImpl implements ItemDao {

	@Override
	public boolean add(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Item oldItem, Item newItem) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Item item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from ", new Object[]{});
		List<Item> itemList=new ArrayList<Item>();
		try{
			while(rs.next()){
				Item item=new Item();
				item.setName(rs.getString(1));
				item.setKcyl(rs.getInt(2));
				item.setAqkc(rs.getInt(3));
				item.setBzq(rs.getString(4));
				item.setDj(rs.getDouble(5));
				itemList.add(item);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return itemList;
	}

}
