package com.starry.dao;

import java.util.List;

import com.starry.entity.Administor;
import com.starry.entity.Count;
import com.starry.entity.Department;
import com.starry.entity.Doctor;
import com.starry.entity.Feedback;
import com.starry.entity.OrderInfo;

public interface IAdministorDao {
  public abstract boolean login(Administor administor); 
  
  public abstract void updatePwd(Administor administor);
  
  public abstract int addDepart(Department department);

  public abstract int addDoctor(Doctor doctor);
  
  public abstract List<OrderInfo> getAll();
  
  public abstract List<Count> getCount();
  
  public abstract List<Feedback> getFeedBack();
}
