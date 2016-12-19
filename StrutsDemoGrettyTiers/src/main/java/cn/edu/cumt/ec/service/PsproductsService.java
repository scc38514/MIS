package cn.edu.cumt.ec.service;

import cn.edu.cumt.ec.dao.PsproductsDao;
import cn.edu.cumt.ec.dao.PsproductsDaoJDBCImpl;

public class PsproductsService {
	private PsproductsDao psproductsDao;

	public PsproductsDao getPsproductsDao() {
		return psproductsDao;
	}

	public void setPsproductsDao(PsproductsDao psproductsDao) {
		this.psproductsDao = psproductsDao;
	}
	public boolean addps(String cpmc, int ps1, int ps2, int ps3){
		psproductsDao=new PsproductsDaoJDBCImpl();
		return psproductsDao.addps(cpmc, ps1, ps2, ps3);
	}

	
}
