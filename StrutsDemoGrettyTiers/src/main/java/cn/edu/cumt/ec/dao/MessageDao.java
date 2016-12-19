package cn.edu.cumt.ec.dao;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Massages;

	
public class MessageDao {
	

	//商品的业务逻辑类
	

		// 获得所有的商品信息
		public ArrayList<Massages> getAllMessage() {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			ArrayList<Massages> list = new ArrayList<Massages>(); // 商品集合
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from ly;"; // SQL语句
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					Massages message = new Massages();
					message.setYgid(rs.getString("ygid"));
					message.setLynr(rs.getString("lynr"));
					message.setLysj(rs.getString("lysj"));
					message.setSfcl(rs.getString("sfcl"));
					
		           
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
