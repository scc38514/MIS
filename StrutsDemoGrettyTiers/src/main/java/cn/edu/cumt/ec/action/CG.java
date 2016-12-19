package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;


import cn.edu.cumt.ec.service.ManagerService;
import cn.edu.cumt.ec.service.ProductService;

public class CG extends ActionSupport {
	private String SCMC;
	private String JHSL;
	private String JHDJ;
	
	public String getSCMC() {
		return SCMC;
	}

	public void setSCMC(String sCMC) {
		SCMC = sCMC;
	}


	public String getJHSL() {
		return JHSL;
	}

	public void setJHSL(String jHSL) {
		JHSL = jHSL;
	}




	public String getJHDJ() {
		return JHDJ;
	}


	public void setJHDJ(String jHDJ) {
		JHDJ = jHDJ;
	}

	public String execute() throws Exception {
		ProductService ProductService = new ProductService();
		if (ProductService.addcp(getSCMC(), getJHSL(),getJHDJ()) == true) {
			return SUCCESS;

		} else {
			return ERROR;
		}
	}
}