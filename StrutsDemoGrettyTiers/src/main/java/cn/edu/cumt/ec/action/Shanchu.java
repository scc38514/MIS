package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.service.AdminService;

public class Shanchu extends ActionSupport  {
	private String SCMC;

	
	public String getSCMC() {
		return SCMC;
	}


	public void setSCMC(String sCMC) {
		SCMC = sCMC;
	}


	public String execute() throws Exception{
		AdminService AdminService=new AdminService();
		if(AdminService.shanchu(SCMC)==true){
			return SUCCESS;
			
			
		}else{
			return ERROR;
		}
	}
}
