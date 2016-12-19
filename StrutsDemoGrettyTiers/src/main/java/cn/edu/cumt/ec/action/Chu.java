package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.dao.MassagesDaoJDBCImpl;
import cn.edu.cumt.ec.service.ManagerService;
import cn.edu.cumt.ec.service.MassagesService;

public class Chu extends ActionSupport {
	private String sfcl;
	private String lynr;
	
	

	

	
	
	public String getSfcl() {
		return sfcl;
	}







	public void setSfcl(String sfcl) {
		this.sfcl = sfcl;
	}







	public String getLynr() {
		return lynr;
	}







	public void setLynr(String lynr) {
		this.lynr = lynr;
	}






	public String execute() throws Exception {
		MassagesDaoJDBCImpl massagesDaoJDBCImpl = new MassagesDaoJDBCImpl();
    	MassagesService massagesService=new MassagesService();
    	massagesService.setMassagesDao(massagesDaoJDBCImpl);		
		massagesService.update(getLynr());
		return SUCCESS;
	}
}
