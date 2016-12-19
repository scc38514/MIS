package cn.edu.cumt.ec.dao;
import java.util.List;
import cn.edu.cumt.ec.entity.Massages;

public interface MassagesDao {
		public boolean add(Massages massages);
		public boolean delete(Massages massages);
		public List<Massages> getAll();
		public boolean update(String lynr);
	}
