package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;
import cn.edu.cumt.ec.service.MassagesService;

public class addly extends ActionSupport {
	private String ygid;
	private String lynr;
	private String lysj;
	private String sfcl;
	
	
	public String getYgid() {
		return ygid;
	}
	public void setYgid(String ygid) {
		this.ygid = ygid;
	}
	public String getLynr() {
		return lynr;
	}
	public void setLynr(String lynr) {
		this.lynr = lynr;
	}
	public String getLysj() {
		return lysj;
	}
	public void setLysj(String lysj) {
		this.lysj = lysj;
	}
	public String getSfcl() {
		return sfcl;
	}
	public void setSfcl(String sfcl) {
		this.sfcl = sfcl;
	}
	public String execute() throws Exception{
		MassagesService MassagesService=new MassagesService();
		if( MassagesService.add(getYgid(),getLynr(),getLysj() ,getSfcl())==true){
			return SUCCESS;
			
			
		}else{
			return ERROR;
		}
	}
}
