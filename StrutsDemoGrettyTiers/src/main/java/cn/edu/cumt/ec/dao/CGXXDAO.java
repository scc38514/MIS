package cn.edu.cumt.ec.dao;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Massages;
import cn.edu.cumt.ec.entity.product;

	
public class CGXXDAO {
	

	//��Ʒ��ҵ���߼���
	

		// ������е���Ʒ��Ϣ
		public ArrayList<product> getAllMessage() {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			ArrayList<product> list = new ArrayList<product>(); // ��Ʒ����
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from jh;"; // SQL���
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					product message = new product();
					message.setSCMC(rs.getString("SCMC"));
					message.setJHSL(rs.getString("JHSL"));
					message.setJHDJ(rs.getString("JHDJ"));
					
					
		           
					list.add(message);// ��һ����Ʒ���뼯��
				}
				return list; // ���ؼ��ϡ�
			} catch (Exception ex) {
				ex.printStackTrace();
				return null;
			} finally {
				// �ͷ����ݼ�����
				if (rs != null) {
					try {
						rs.close();
						rs = null;
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				// �ͷ�������
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