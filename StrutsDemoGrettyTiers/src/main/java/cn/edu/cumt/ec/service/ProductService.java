package cn.edu.cumt.ec.service;





import cn.edu.cumt.ec.dao.ProductDao;
import cn.edu.cumt.ec.dao.ProductDaoJDBC;

public class ProductService {
	private ProductDao productDao;


	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public ProductService(ProductDao productDao){
		this.productDao = productDao;
	}
	public ProductService() {
		super();
	}
	public   boolean  addcp(String SCMC, String JHSL, String JHDJ){
		productDao=new ProductDaoJDBC();
		return productDao.addcp(SCMC,JHSL,JHDJ);
	}
	}