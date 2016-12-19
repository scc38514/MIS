package cn.edu.cumt.ec.entity;

public class Item {
	private String name;//产品名称
	private String bzq;//保质期
	private int kcyl;//库存余量
	private double dj;//单价
	private int aqkc;//安全库存
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBzq() {
		return bzq;
	}
	public void setBzq(String bzq) {
		this.bzq = bzq;
	}
	public int getKcyl() {
		return kcyl;
	}
	public void setKcyl(int kcyl) {
		this.kcyl = kcyl;
	}
	public double getDj() {
		return dj;
	}
	public void setDj(double dj) {
		this.dj = dj;
	}
	public int getAqkc() {
		return aqkc;
	}
	public void setAqkc(int aqkc) {
		this.aqkc = aqkc;
	}
	
}
