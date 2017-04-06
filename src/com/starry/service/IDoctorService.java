package com.starry.service;

import java.util.List;

import com.starry.entity.Doctor;

public interface IDoctorService {
	public abstract List<Doctor> selectAll();

	public abstract int deleteById(int number);

	public abstract int insert(Doctor doctor);// Ìí¼Ó

	public abstract int update(Doctor doctor);// ÐÞ¸Ä
}
