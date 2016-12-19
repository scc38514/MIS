package cn.edu.cumt.ec.dao;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Massages;

	
public class MessageDao {
	

	//��Ʒ��ҵ���߼���
	

		// ������е���Ʒ��Ϣ
		public ArrayList<Massages> getAllMessage() {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			ArrayList<Massages> list = new ArrayList<Massages>(); // ��Ʒ����
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from ly;"; // SQL���
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					Massages message = new Massages();
					message.setYgid(rs.getString("ygid"));
					message.setLynr(rs.getString("lynr"));
					message.setLysj(rs.getString("lysj"));
					message.setSfcl(rs.getString("sfcl"));
					
		           
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
