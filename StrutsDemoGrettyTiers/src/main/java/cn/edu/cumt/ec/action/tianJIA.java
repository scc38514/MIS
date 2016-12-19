package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.service.AdminService;


public class tianJIA extends ActionSupport {
	private String SCMC; // 商品编号
	private String AQKC; // 商品名称
	private String BZQ; // 类别
	private String YJ;
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

	public String execute() throws Exception{
		AdminService AdminService=new AdminService();
		if(AdminService.tianjia(getSCMC(),getAQKC(),getBZQ(),getYJ())==true){
			return SUCCESS;
			
			
		}else{
			return ERROR;
		}
	}

}
