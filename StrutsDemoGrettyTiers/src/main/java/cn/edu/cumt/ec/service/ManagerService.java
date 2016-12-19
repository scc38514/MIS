package cn.edu.cumt.ec.service;

import cn.edu.cumt.ec.dao.ManagerDao;

import cn.edu.cumt.ec.dao.ManagerDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Manager;

public class ManagerService {
	private ManagerDao managerDao;

	public void setManagerDao(ManagerDao managerDao) {
		this.managerDao = managerDao;
	}
	
	public ManagerService(ManagerDao managerDao){
		this.managerDao = managerDao;
	}
	public ManagerService() {
		super();
	}
	public Manager findByUsername(Manager manager){
		managerDao=new ManagerDaoJDBCImpl();
		return managerDao.findByUsername(manager);
	}
	public  boolean addma (String name,String phone,String pass,String position){
		managerDao=new ManagerDaoJDBCImpl();
		return managerDao.addma(name,phone,pass,position);
	}
	public boolean dengLuma(String name,String pass){
		managerDao=new ManagerDaoJDBCImpl();
		return managerDao.dengLuma(name, pass);
	}
	public boolean dengLukc(String name,String pass){
		managerDao=new ManagerDaoJDBCImpl();
		return managerDao.dengLuma(name, pass);
	}
	public boolean dengLucg(String name,String pass){
		managerDao=new ManagerDaoJDBCImpl();
		return managerDao.dengLuma(name, pass);
	}
	public boolean dengLups(String name,String pass){
		managerDao=new ManagerDaoJDBCImpl();
		return managerDao.dengLuma(name, pass);
	}
}
