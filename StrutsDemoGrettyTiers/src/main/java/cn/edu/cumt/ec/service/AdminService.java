package cn.edu.cumt.ec.service;

import cn.edu.cumt.ec.dao.AdminDao;

import cn.edu.cumt.ec.dao.AdminDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.entity.Kcproducts;

public class AdminService {
	private AdminDao adminDao;

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public AdminService(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public AdminService() {
		super();
	}

	public boolean tianjia(String SCMC,String AQKC,String BZQ,String YJ) {
		adminDao = new AdminDaoJDBCImpl();
		return adminDao.tianjia(SCMC,AQKC,BZQ,YJ);

	}

	public boolean shanchu(String SCMC) {
		adminDao = new AdminDaoJDBCImpl();
		return adminDao.shanchu(SCMC);
	}
	public Items  GetByscmc(String SCMC) {
		return adminDao.Getbyscmc(SCMC);
		}
	public Kcproducts GetBycpmc(String cpmc){
		return adminDao.Getbycpmc(cpmc);
	}
}