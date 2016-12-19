package cn.edu.cumt.ec.dao;

import cn.edu.cumt.ec.dbutil.DbUtil;

public class PsproductsDaoJDBCImpl implements PsproductsDao {

	@Override
	public boolean addps(String cpmc, int ps1, int ps2, int ps3) {
		boolean SGIN = DbUtil.executeUpdate("insert into gh values(?,?,?,?)", new Object[] { cpmc,ps1,ps2,ps3});
		if (SGIN == true) {
			return true;
		} else {
			return false;
		}
	}}
