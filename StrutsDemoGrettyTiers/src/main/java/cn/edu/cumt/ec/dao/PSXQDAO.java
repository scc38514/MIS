package cn.edu.cumt.ec.dao;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Kcproducts;
import cn.edu.cumt.ec.entity.Psproducts;
import cn.edu.cumt.ec.entity.product;

	
public class PSXQDAO {
	

	//��Ʒ��ҵ���߼���
	

		// ������е���Ʒ��Ϣ
		public ArrayList<Psproducts> getAllMessage() {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			ArrayList<Psproducts> list = new ArrayList<Psproducts>(); // ��Ʒ����
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from gh;"; // SQL���
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					Psproducts message = new Psproducts();
					message.setCpmc(rs.getString("cpmc"));
					message.setPs1(rs.getInt("ps1"));
					message.setPs2(rs.getInt("ps2"));
					message.setPs3(rs.getInt("ps3"));
					
					
					
		           
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