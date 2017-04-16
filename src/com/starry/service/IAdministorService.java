package com.starry.service;

import com.starry.entity.Department;


public interface IAdministorService {
   public abstract boolean checkLogin(String name,String pwd);
   
   public abstract int addDepart(Department department);
}
