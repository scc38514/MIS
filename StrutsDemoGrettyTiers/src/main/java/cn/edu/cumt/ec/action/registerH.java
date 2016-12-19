package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.service.ManagerService;

public class registerH extends ActionSupport {
	private String name;
	private String phone;
	private String pass;
	private String position;
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	

	
	
	public String execute() throws Exception {
		ManagerService ManagerService = new ManagerService();
		if (ManagerService.addma(getName(), getPass(),getPhone(),getPosition()) == true) {
			return SUCCESS;

		} else {
			return ERROR;
		}
	}
}
