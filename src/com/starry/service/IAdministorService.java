package com.starry.service;

import java.util.List;

import com.starry.entity.Administor;
import com.starry.entity.Count;
import com.starry.entity.Department;
import com.starry.entity.Doctor;
import com.starry.entity.Feedback;
import com.starry.entity.New;
import com.starry.entity.OrderInfo;


public interface IAdministorService {
   public abstract boolean checkLogin(String name,String pwd);
   
   public abstract void updatePwd(Administor administor);
   
   public abstract int addDepart(Department department);

   public abstract int addDoctor(Doctor doctor );
   
   public abstract List<OrderInfo> getAll(int pageNum,int pageSize);
   
   public abstract List<Count> getCount();
   
   public abstract List<Feedback> getFeedBack(int pageNum,int pageSize);
   
   public abstract int addNew(New news);
   
   public abstract List<New> getAllNew();
}
