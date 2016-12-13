package org.scut.mychart.mapper;

import java.util.List;

import org.scut.mychart.model.RegisterModel;

public interface CompanyMapper {
	
	public List<RegisterModel> getCountByGender(String business);
	
	public List<RegisterModel> getAreaCoverage(String business);

	public List<RegisterModel> getAgeRange(String business);

	public List<RegisterModel> getHospitalTotal(String business);

	public List<RegisterModel> getHospitalByTime(String business, String startTime, String endTime);

	public List<RegisterModel> getHospitalMaxByDay(String business, String startTime, String endTime);

	public List<RegisterModel> getDepartmentTotal(String business);
	
	public List<RegisterModel> getDepartmentByTime(String business, String startTime, String endTime);

	public List<RegisterModel> getDepartmentMaxByDay(String business, String startTime, String endTime);
	
	public List<RegisterModel> getDoctorTotal(String business);
	
	public List<RegisterModel> getDoctorByTime(String business, String startTime, String endTime);

	public List<RegisterModel> getDoctorMaxByDay(String business, String startTime, String endTime);
}
