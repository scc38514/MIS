package cn.edu.cumt.ec.dao;

import java.util.List;
import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.entity.Kcproducts;

public interface YujingDao {
	public List<Items> getByRq();
	public List<Kcproducts> getByKcl();
	
}
