package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;


import java.sql.SQLException;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Manager;

public interface ManagerDao {
	public  boolean addma (String name,String phone,String pass,String position);
	public boolean dengLuma(String name,String pass);
	public boolean dengLucg(String name, String pass);
	public boolean dengLukc(String name, String pass);
	public boolean dengLups(String name, String pass);
	public Manager findByUsername(Manager manager);
	
}
