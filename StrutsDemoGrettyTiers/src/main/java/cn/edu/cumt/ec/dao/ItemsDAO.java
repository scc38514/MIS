package cn.edu.cumt.ec.dao;
import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;

import cn.edu.cumt.ec.dbutil.DbUtil;
import cn.edu.cumt.ec.entity.Items;

	
public class ItemsDAO {
	

	//��Ʒ��ҵ���߼���
	

		// ������е���Ʒ��Ϣ
		public ArrayList<Items> getAllItems() {
			Connection conn = null;
			PreparedStatement stmt = null;
			ResultSet rs = null;
			ArrayList<Items> list = new ArrayList<Items>(); // ��Ʒ����
			try {
				conn = DbUtil.getConnection();
				String sql = "select * from sc;"; // SQL���
				stmt = conn.prepareStatement(sql);
				rs = stmt.executeQuery();
				while (rs.next()) {
					Items item = new Items();
					item.setSCMC(rs.getString("SCMC"));
					item.setAQKC(rs.getString("AQKC"));
					item.setBZQ(rs.getString("BZQ"));
					
					list.add(item);// ��һ����Ʒ���뼯��
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



