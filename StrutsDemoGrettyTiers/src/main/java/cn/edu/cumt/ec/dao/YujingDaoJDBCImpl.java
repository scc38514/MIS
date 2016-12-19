package cn.edu.cumt.ec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.entity.Kcproducts;

public class YujingDaoJDBCImpl implements YujingDao {
	@Override
	public List<Items> getByRq() {
		// TODO Auto-generated method stub
		List<Items> itemList = new ArrayList<Items>();

		try{
		ResultSet rs=DbUtil.executeQuery("select SCMC from sc where datediff(now(),sc.YJ)>=(sc.BZQ-7)", new Object[]{});
		while(rs.next()){
			Items items=null;
			items = new Items();
			items.setSCMC(rs.getString(1));	
			itemList.add(items);
		}
			}catch(Exception e){
				e.printStackTrace();
				}
		return itemList;
	}
	@Override
	public List<Kcproducts> getByKcl() {
		// TODO Auto-generated method stub
		List<Kcproducts> kcproductsList = new ArrayList<Kcproducts>();
		try{
		ResultSet rs=DbUtil.executeQuery("select DISTINCT cpmc from kc LEFT JOIN sc ON kc.cpmc = sc.SCMC where (kc.zj-sc.AQKC)<10", new Object[]{});
		while(rs.next()){
			Kcproducts kcproducts=null;
			kcproducts = new Kcproducts();
			kcproducts.setCpmc(rs.getString(1));
			kcproductsList.add(kcproducts);
		}
			}catch(Exception e){
				e.printStackTrace();
				}
		return kcproductsList;
	}
}
