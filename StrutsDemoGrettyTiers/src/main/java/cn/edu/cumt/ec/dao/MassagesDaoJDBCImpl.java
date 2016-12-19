package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Massages;

public class MassagesDaoJDBCImpl implements MassagesDao {

	@Override
	public boolean add(Massages massages) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("insert into ly values(?,?,?,?)",new Object[]{massages.getYgid(),massages.getLynr(),massages.getLysj(),massages.getSfcl()});	
	}

	@Override
	public boolean delete(Massages massages) {
		// TODO Auto-generated method stub
		return DbUtil.executeUpdate("delete from ly where ygid=?)",new Object[]{massages.getYgid()});
	}

	@Override
	public List<Massages> getAll() {
		// TODO Auto-generated method stub
		ResultSet rs=DbUtil.executeQuery("select * from ly", new Object[]{});
		List<Massages> massagesList=new ArrayList<Massages>();
		try{
			while(rs.next()){
				Massages massages=new Massages();
				massages.setYgid(rs.getString(1));
				massages.setLynr(rs.getString(2));
				massages.setLysj(rs.getString(3));
				massages.setSfcl(rs.getString(4));
				massagesList.add(massages);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return massagesList;
	}

	@Override
	public boolean update(String lynr) {
		return DbUtil.executeUpdate("update ly set sfcl=? where lynr=?",new Object[]{"yes",lynr});
	}

}
