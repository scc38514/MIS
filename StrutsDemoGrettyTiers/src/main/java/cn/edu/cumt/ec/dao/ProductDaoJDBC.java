package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.edu.cumt.ec.dbutil.DbUtil;

import cn.edu.cumt.ec.entity.News;

public class ProductDaoJDBC implements ProductDao {

	

	@Override
	public boolean addcp(String SCMC, String JHSL, String JHDJ) {
		boolean SGIN = DbUtil.executeUpdate("insert into jh values(?,?,?)", new Object[] { SCMC, JHSL, JHDJ });
		if (SGIN == true) {
			return true;
		} else {
			return false;
		}
}
	}