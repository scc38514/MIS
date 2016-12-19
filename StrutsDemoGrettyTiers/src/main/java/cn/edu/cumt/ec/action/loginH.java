package cn.edu.cumt.ec.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.cumt.ec.entity.Manager;
import cn.edu.cumt.ec.service.ManagerService;

public class loginH extends ActionSupport {
	private String name;
	private String pass;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String execute() throws Exception{
		ManagerService ManagerService=new ManagerService();
		Manager mm=new Manager();
		mm.setName(getName());
		Manager me=ManagerService.findByUsername(mm);
		
		System.out.println(getPass());
		if( getPass().equals(me.getPass()) && me.getPosition().equals("1")){
			return "m";}
		else if(getPass().equals(me.getPass()) && me.getPosition().equals("2")){
			return "c";}
		else if(getPass().equals(me.getPass()) && me.getPosition().equals("3")){
			return "k";}
		else if(getPass().equals(me.getPass()) && me.getPosition().equals("4")){
			return "p";}
		else{      
			return "u";}
		}
}
