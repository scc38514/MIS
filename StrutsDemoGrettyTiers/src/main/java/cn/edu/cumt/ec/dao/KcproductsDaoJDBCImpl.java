package cn.edu.cumt.ec.dao;

import cn.edu.cumt.ec.dbutil.DbUtil;

public class KcproductsDaoJDBCImpl implements KcproductsDao {

	@Override
	public boolean addkc(String cpmc, int kc1, int kc2, int kc3, int zj) {
		boolean SGIN = DbUtil.executeUpdate("insert into kc values(?,?,?,?,?)", new Object[] { cpmc,kc1, kc2,kc3, zj});
		if (SGIN == true) {
			return true;
		} else {
			return false;
		}

	}
}
