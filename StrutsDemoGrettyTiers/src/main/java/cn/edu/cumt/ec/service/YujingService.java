package cn.edu.cumt.ec.service;

import java.util.List;

import cn.edu.cumt.ec.dao.YujingDao;
import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.entity.Kcproducts;

public class YujingService {
	private YujingDao yujingDao;
	
	public YujingDao getYujingDao() {
		return yujingDao;
	}
	public void setYujingDao(YujingDao yujingDao) {
		this.yujingDao = yujingDao;
	}
	public List<Items> getByRq(){
		return yujingDao.getByRq();
	}
	public List<Kcproducts> getByKcl(){
		return yujingDao.getByKcl();
	}

}
