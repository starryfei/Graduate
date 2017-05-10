package com.starry.dao;

import java.util.List;

import com.starry.entity.DepartmentInfo;
import com.starry.entity.Doctor;
import com.starry.entity.DoctorInfo;
import com.starry.entity.DoctorInfoJson;
import com.starry.entity.Jsondoctor;
import com.starry.entity.OrderInfo;
import com.starry.entity.Sch;

public interface IDoctorDao {
	
	public abstract boolean login(Doctor doctor);
	
	public abstract List<DoctorInfo> selectAll(int pageNum,int pageSize);//

	public abstract int deleteById(String number);// 

	public abstract int insert(Doctor doctor);//

	public abstract int update(Doctor doctor);//
	
	public abstract List<Doctor> getById(String id);
	
	public abstract List<DoctorInfo> findName(String info,int pageNum,int pageSize);
	public abstract List<DoctorInfo> findId(String info,int pageNum,int pageSize);
	public abstract List<DoctorInfo> findDepartName(String info,int pageNum,int pageSize);
	
	public abstract int insertSch(Sch sch);
	
	public abstract List<DepartmentInfo> getD(String dNumber);
	
	public abstract List<Sch> getSInfo(String sNumber);
	
	public abstract List<OrderInfo> getOrderByDoctor(String sNumber,int pageNum,int pageSize);
	
	
	//json
	public abstract List<DoctorInfoJson> getJsonDoctor(DoctorInfoJson doctorInfoJson);
	
	public abstract List<Jsondoctor> getAllJsonDoctor(String cNumber);
	public abstract List<Jsondoctor> getJsonDoctorByName(String name);
}
