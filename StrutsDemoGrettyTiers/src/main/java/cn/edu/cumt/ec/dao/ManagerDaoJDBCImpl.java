package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;

import java.sql.SQLException;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Manager;
import cn.edu.cumt.ec.entity.News;

public class ManagerDaoJDBCImpl implements ManagerDao {

	@Override
	public boolean addma(String name,String phone,String pass,String position) {
		boolean SGIN = DbUtil.executeUpdate("insert into yg values(?,?,?,?)", new Object[] { name, phone, pass, position });
		if (SGIN == true) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean dengLuma(String name, String pass) {
		ResultSet rs = DbUtil.executeQuery("select * from yg where name=? and pass=? and position=1",
				new Object[] { name, pass });
		Manager manager = null;
		try {
			while (rs.next()) {
				manager = new Manager();
				manager.setName(rs.getString(1));
				manager.setPass(rs.getString(2));
			}                                                                                                                             
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (manager != null) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean dengLucg(String name, String pass) {
		ResultSet rs = DbUtil.executeQuery("select * from yg where name=? and pass=? and position=2",
				new Object[] { name, pass });
		Manager manager = null;
		try {
			while (rs.next()) {
				manager = new Manager();
				manager.setName(rs.getString(1));
				manager.setPass(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (manager != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean dengLukc(String name, String pass) {
		ResultSet rs = DbUtil.executeQuery("select * from yg where name=? and pass=? and position=3",
				new Object[] { name, pass });
		Manager manager = null;
		try {
			while (rs.next()) {
				manager = new Manager();
				manager.setName(rs.getString(1));
				manager.setPass(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (manager != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean dengLups(String name, String pass) {
		ResultSet rs = DbUtil.executeQuery("select * from yg where name=? and pass=? and position=4",
				new Object[] { name, pass });
		Manager manager = null;
		try {
			while (rs.next()) {
				manager = new Manager();
				manager.setName(rs.getString(1));
				manager.setPass(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (manager != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Manager findByUsername(Manager manager) {
		// TODO Auto-generated method stub
		ResultSet rs = DbUtil.executeQuery("select * from yg where name=?",
				new Object[] {manager.getName()});
		try {
			while (rs.next()) {
				manager = new Manager();
				manager.setName(rs.getString(1));
				manager.setPass(rs.getString(3));
				manager.setPosition(rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return manager;
	}
}
