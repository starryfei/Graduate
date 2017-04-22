package com.starry.dao;

import com.starry.entity.Administor;
import com.starry.entity.Department;
import com.starry.entity.Doctor;

public interface IAdministorDao {
  public abstract boolean login(Administor administor); 
  
  public abstract void updatePwd(Administor administor);
  
  public abstract int addDepart(Department department);

  public abstract int addDoctor(Doctor doctor);
}
