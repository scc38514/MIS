package cn.edu.cumt.ec.service;

import cn.edu.cumt.ec.dao.KcproductsDao;
import cn.edu.cumt.ec.dao.KcproductsDaoJDBCImpl;

public class KcproductsService {
	private KcproductsDao kcproductsDao;

	public KcproductsDao getKcproductsDao() {
		return kcproductsDao;
	}

	public void setKcproductsDao(KcproductsDao kcproductsDao) {
		this.kcproductsDao = kcproductsDao;
	}
	public boolean addkc(String cpmc, int kc1, int kc2, int kc3, int zj){
		kcproductsDao=new KcproductsDaoJDBCImpl();
		return kcproductsDao.addkc(cpmc, kc1, kc2, kc3, zj);
	}
}
