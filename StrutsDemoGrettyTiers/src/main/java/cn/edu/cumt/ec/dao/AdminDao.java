package cn.edu.cumt.ec.dao;

import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.entity.Kcproducts;

public interface AdminDao {
	public  boolean tianjia (String SCMC,String AQKC,String BZQ,String YJ);
    public boolean shanchu(String SCMC);
    public Items Getbyscmc(String SCMC);
    public Kcproducts Getbycpmc(String cpmc);
}
