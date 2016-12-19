package cn.edu.cumt.ec.action;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.AdminDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.service.AdminService;

public class sousuo extends ActionSupport implements SessionAware , ApplicationAware  {
	private String SCMC; // 商品编号
	private String AQKC; // 商品名称
	private String BZQ; // 类别
	private String YJ;//保质期预警
	public String getSCMC() {
		return SCMC;
	}
	public void setSCMC(String sCMC) {
		SCMC = sCMC;
	}
	public String getAQKC() {
		return AQKC;
	}
	public void setAQKC(String aQKC) {
		AQKC = aQKC;
	}
	public String getBZQ() {
		return BZQ;
	}
	public void setBZQ(String bZQ) {
		BZQ = bZQ;
	}
	public String getYJ() {
		return YJ;
	}
	public void setYJ(String yJ) {
		YJ = yJ;
	}
	public String execute(){
		clearErrorsAndMessages();
		AdminDaoJDBCImpl admindaoimpl=new AdminDaoJDBCImpl();
		AdminService adminService=new AdminService();
		adminService.setAdminDao(admindaoimpl);
		Items i =adminService.GetByscmc(SCMC);
		if(i != null && i.getSCMC()!= null){
			if(i.getSCMC().equals(getSCMC())){
				System.out.println("结果是"+i.getAQKC());
				ActionContext.getContext().getSession().put("scms", getSCMC());
				ActionContext.getContext().getSession().put("aqkc", i.getAQKC());
				ActionContext.getContext().getSession().put("bzq", i.getBZQ());
				ActionContext.getContext().getSession().put("yj", i.getYJ());
			    return SUCCESS;
			    }
			
			else{ 
				return  ERROR;}
		}
		else{
			return  ERROR;
		}
		}
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		
	}


}
