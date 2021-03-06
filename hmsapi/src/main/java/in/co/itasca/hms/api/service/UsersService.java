package in.co.itasca.hms.api.service;

import in.co.itasca.hms.persistence.dao.DepartmentDAO;
import in.co.itasca.hms.persistence.dao.UsersDAO;
import in.co.itasca.hms.persistence.model.Department;
import in.co.itasca.hms.persistence.model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UsersService extends BaseService {

	
	

	public UsersService(String role) {
		super(role);
		super.idao = new UsersDAO();
	}

	@Override
	public List<Map<String, Object>> getRecords() {
		try {
			
			
			List<Map<String, Object>> collection = new ArrayList<Map<String, Object>>();
			UsersDAO dao = (UsersDAO) idao;
					
			List<User> list =dao.getAll();
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				User entity = (User) iterator.next();
				collection.add(entity.convertModelTOEDM());
			}
			 return collection;
			} catch (Exception e) {
			return  null;
			}
			 	
	}

	@Override
	public List<Map<String, Object>> getAssociation(int id, String associatedEdm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Object> getRecord(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
