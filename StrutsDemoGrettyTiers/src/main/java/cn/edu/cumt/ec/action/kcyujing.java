package cn.edu.cumt.ec.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cn.edu.cumt.ec.dao.YujingDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Kcproducts;
import cn.edu.cumt.ec.service.YujingService;

public class kcyujing extends ActionSupport{
	private String cpmc;//产品名称
	private int zj;//总计
	public String getCpmc() {
		return cpmc;
	}
	public void setCpmc(String cpmc) {
		this.cpmc = cpmc;
	}
	public int getZj() {
		return zj;
	}
	public void setZj(int zj) {
		this.zj = zj;
	}
	public String Listkcproducts(){
		YujingDaoJDBCImpl yujingDaoJDBCImpl=new YujingDaoJDBCImpl();
		YujingService yujingService=new YujingService();
		yujingService.setYujingDao(yujingDaoJDBCImpl);
		List<Kcproducts> kcproductsList=yujingService.getByKcl();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("kcproductsList",kcproductsList);
		return SUCCESS;
	 }
}
