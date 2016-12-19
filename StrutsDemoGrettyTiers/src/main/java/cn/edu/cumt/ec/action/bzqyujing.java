package cn.edu.cumt.ec.action;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cn.edu.cumt.ec.dao.YujingDaoJDBCImpl;
import cn.edu.cumt.ec.entity.Items;
import cn.edu.cumt.ec.service.YujingService;

public class bzqyujing extends ActionSupport{
	private String SCMC; // 商品编号
	private String AQKC; // 商品名称
	private String BZQ; // 保质期
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
	public String Listitems(){
		YujingDaoJDBCImpl yujingDaoJDBCImpl=new YujingDaoJDBCImpl();
		YujingService yujingService=new YujingService();
		yujingService.setYujingDao(yujingDaoJDBCImpl);
		List<Items> itemsList=yujingService.getByRq();
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("itemsList",itemsList);
		return SUCCESS;
	 }
}
