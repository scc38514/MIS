package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.service.KcproductsService;
import cn.edu.cumt.ec.service.ManagerService;
import cn.edu.cumt.ec.service.PsproductsService;

public class pslr extends ActionSupport{
	private String cpmc;
	private int ps1;
	private int ps2;
	private int ps3;
	
	public String getCpmc() {
		return cpmc;
	}
	public void setCpmc(String cpmc) {
		this.cpmc = cpmc;
	}
	
	public int getPs1() {
		return ps1;
	}
	public void setPs1(int ps1) {
		this.ps1 = ps1;
	}
	public int getPs2() {
		return ps2;
	}
	public void setPs2(int ps2) {
		this.ps2 = ps2;
	}
	public int getPs3() {
		return ps3;
	}
	public void setPs3(int ps3) {
		this.ps3 = ps3;
	}
	public String execute() throws Exception {
		PsproductsService PsproductsService = new PsproductsService();
		if (PsproductsService.addps(getCpmc(),getPs1(),getPs2(),getPs3()) == true) {
			return SUCCESS;

		} else {
			return ERROR;
		}
	}
}
