package com.starry.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starry.dao.IAdministorDao;
import com.starry.dao.IDepartmentDao;
import com.starry.entity.Administor;
import com.starry.entity.Count;
import com.starry.entity.Department;
import com.starry.entity.Doctor;
import com.starry.entity.Feedback;
import com.starry.entity.New;
import com.starry.entity.OrderInfo;
import com.starry.entity.User;

@Service("administorService")
public class IAdministorServiceImpl implements IAdministorService {
@Autowired
	private IAdministorDao administorDao;

	//@Resource
	public void setAdministorDao(IAdministorDao administorDao) {
		this.administorDao = administorDao;
	}

	public IAdministorDao getAdministorDao() {
		return administorDao;
	}

	@Override
	public boolean checkLogin(String name, String pwd) {
		Administor administor = new Administor();
		administor.setName(name);
		administor.setPwd(pwd);
		System.out.println(administor);
		boolean result = administorDao.login(administor);
		return result;
	}

	@Override
	public int addDepart(Department department) {
		System.out.println(administorDao.addDepart(department));
		return administorDao.addDepart(department);
	}

	@Override
	public int addDoctor(Doctor doctor) {
		return administorDao.addDoctor(doctor);
	}

	@Override
	public void updatePwd(Administor administor) {
		administorDao.updatePwd(administor);
	}

	@Override
	public List<OrderInfo> getAll(int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		return administorDao.getAll(pageNum,pageSize);
	}

	@Override
	public List<Count> getCount() {
		// TODO Auto-generated method stub
		return administorDao.getCount();
	}

	@Override
	public List<Feedback> getFeedBack(int pageNum,int pageSize) {
		// TODO Auto-generated method stub
		return administorDao.getFeedBack(pageNum,pageSize);
	}

	@Override
	public int addNew(New news) {
		// TODO Auto-generated method stub
		return administorDao.addNew(news);
	}

	@Override
	public List<New> getAllNew() {
		// TODO Auto-generated method stub
		return administorDao.getAllNew();
	}
}
