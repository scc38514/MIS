package cn.edu.cumt.ec.dao;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Kcproducts;
import cn.edu.cumt.ec.entity.product;

	
public class KKXQDAO {
	

	//��Ʒ��ҵ���߼���
	

		// ������е���Ʒ��Ϣ
		public ArrayList<Kcproducts> getAllMessage() {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			ArrayList<Kcproducts> list = new ArrayList<Kcproducts>(); // ��Ʒ����
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from kc;"; // SQL���
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					Kcproducts message = new Kcproducts();
					message.setCpmc(rs.getString("cpmc"));
					message.setKc1(rs.getInt("kc1"));
					message.setKc2(rs.getInt("kc2"));
					message.setKc3(rs.getInt("kc3"));
					message.setZj(rs.getInt("zj"));
					
					
		           
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