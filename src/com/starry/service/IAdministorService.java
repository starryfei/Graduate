package com.starry.service;

import com.starry.entity.Department;
import com.starry.entity.Doctor;


public interface IAdministorService {
   public abstract boolean checkLogin(String name,String pwd);
   
   public abstract int addDepart(Department department);

   public abstract int addDoctor(Doctor doctor );
}
