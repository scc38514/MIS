package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.service.KcproductsService;
import cn.edu.cumt.ec.service.ManagerService;

public class kclr extends ActionSupport{
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
	public String execute() throws Exception {
		KcproductsService KcproductsService = new KcproductsService();
		if (KcproductsService.addkc(getCpmc(),getKc1(),getKc2(),getKc3(),getZj()) == true) {
			return SUCCESS;

		} else {
			return ERROR;
		}
	}
}
