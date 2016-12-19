package cn.edu.cumt.ec.entity;
//商品类
public class Items {

	private String SCMC; // 商品编号
	private String AQKC; // 商品名称
	private String BZQ; // 类别
	private String YJ;//保质期预警
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
	
	
}
