package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.entity.Kcproducts;

public class AdminDaoJDBCImpl implements AdminDao{

	public  boolean tianjia (String SCMC,String AQKC,String BZQ,String YJ){
		boolean SGIN = DbUtil.executeUpdate("insert into sc values(?,?,?,?)",
				new Object[] {SCMC,AQKC,BZQ,YJ});
		if (SGIN == true) {
			return true;
		} else {
			return false;
		}
	}

	public boolean shanchu(String SCMC) {
		boolean SGIN = DbUtil.executeUpdate("delete from sc where SCMC=?",new Object[] { SCMC });
		if (SGIN == true) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public Items Getbyscmc(String SCMC) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from sc where SCMC=?", new Object[]{SCMC});
		Items items=null;
		try{
			while(rs.next()){
				items=new Items();
				items.setSCMC(rs.getString(1));
				items.setAQKC(rs.getString(2));
				items.setBZQ(rs.getString(3));
				items.setYJ(rs.getString(4));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return items;
	}
	
	@SuppressWarnings("null")
	public Kcproducts Getbycpmc(String cpmc) {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from kc where cpmc=?", new Object[]{cpmc});
		Kcproducts kcproducts=null;
		try{
			while(rs.next()){
				kcproducts.setCpmc(rs.getString(1));
				kcproducts.setKc1(rs.getInt(2));
				kcproducts.setKc2(rs.getInt(3));
				kcproducts.setKc3(rs.getInt(4));
				kcproducts.setZj(rs.getInt(5));
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return kcproducts;
	}
		
	}

	
