package cn.edu.cumt.ec.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.AdminDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.entity.Kcproducts;
import cn.edu.cumt.ec.service.AdminService;

public class skc extends ActionSupport implements SessionAware , ApplicationAware {
	private String cpmc;
	private int kc1;
	private int kc2;
	private int kc3;
	private int zj;
	public String getCpmc() {
		return cpmc;
	}
	public void setCpmc(String cpmc) {
		this.cpmc = cpmc;
	}
	public int getKc1() {
		return kc1;
	}
	public void setKc1(int kc1) {
		this.kc1 = kc1;
	}
	public int getKc2() {
		return kc2;
	}
	public void setKc2(int kc2) {
		this.kc2 = kc2;
	}
	public int getKc3() {
		return kc3;
	}
	public void setKc3(int kc3) {
		this.kc3 = kc3;
	}
	public int getZj() {
		return zj;
	}
	public void setZj(int zj) {
		this.zj = zj;
	}
	public String execute(){
		clearErrorsAndMessages();
		AdminDaoJDBCImpl admindaoimpl=new AdminDaoJDBCImpl();
		AdminService adminService=new AdminService();
		adminService.setAdminDao(admindaoimpl);
		Kcproducts k =adminService.GetBycpmc(cpmc);
		if(k != null && k.getCpmc()!= null){
			if(k.getCpmc().equals(getCpmc())){
				System.out.println("½á¹ûÊÇ"+k.getCpmc());
				ActionContext.getContext().getSession().put("cpmc", getCpmc());
				ActionContext.getContext().getSession().put("kc1", k.getKc1());
				ActionContext.getContext().getSession().put("kc2", k.getKc2());
				ActionContext.getContext().getSession().put("kc3", k.getKc3());
				ActionContext.getContext().getSession().put("zj", k.getZj());
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
