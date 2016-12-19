package cn.edu.cumt.ec.service;

import java.util.List;
import cn.edu.cumt.ec.dao.MassagesDao;
import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Massages;

public class MassagesService {
	public MassagesService(){
		super();
	}
	private MassagesDao massagesDao;
	public void setMassagesDao(MassagesDao massagesDao){
		this.massagesDao=massagesDao;
	}
	public MassagesService(MassagesDao massagesDao){
		this.massagesDao=massagesDao;
	}
	public boolean add(Massages massages){
		return massagesDao.add(massages);
	}
	public boolean delete(Massages massages){
		return massagesDao.delete(massages);
	}
	public List<Massages> getAll(){
		return massagesDao.getAll();
	}
	//ÃÌº”¡Ù—‘
	public  boolean add (String ygid,String lynr,String lysj,String sfcl){
		
		boolean SGIN=DbUtil.executeUpdate("insert into ly values(?,?,?,?)", 
				new Object[]{ygid,lynr,lysj, sfcl});		
	if (SGIN==true){
		return true;
	}
	else{
		return false;
	}
}
	//…æ≥˝¡Ù—‘
	public static boolean delete(int ygid) {
		boolean rs=DbUtil.executeUpdate("delete from ly where ygid=?",new Object[]{ygid});
		return rs;
	}
	public boolean update(String lynr){
		return massagesDao.update(lynr);
	}
}
