package cn.edu.cumt.ec.dao;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Kcproducts;
import cn.edu.cumt.ec.entity.product;

	
public class KKXQDAO {
	

	//商品的业务逻辑类
	

		// 获得所有的商品信息
		public ArrayList<Kcproducts> getAllMessage() {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			ArrayList<Kcproducts> list = new ArrayList<Kcproducts>(); // 商品集合
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from kc;"; // SQL语句
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					Kcproducts message = new Kcproducts();
					message.setCpmc(rs.getString("cpmc"));
					message.setKc1(rs.getInt("kc1"));
					message.setKc2(rs.getInt("kc2"));
					message.setKc3(rs.getInt("kc3"));
					message.setZj(rs.getInt("zj"));
					
					
		           
					list.add(message);// 把一个商品加入集合
				}
				return list; // 返回集合。
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			} finally {
				// 释放数据集对象
				if (rs != null) {
					try {
						rs.close();
						rs = null;
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				// 释放语句对象
				if (stmt != null) {
					try {
						stmt.close();
						stmt = null;
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}

		}			
		}