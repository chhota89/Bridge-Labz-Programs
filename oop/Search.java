package com.bridgelabz.oop;

/*

* created by: Bridge Labz
* Date 05/05/2016
*
* Perpose: Providing functionality to search.	 

**/

import java.util.ArrayList;
import com.bridgelabz.model.DoctorsModel;
import com.bridgelabz.model.PatientsModel;

public class Search{

	//serch for doctor by name.						
	public ArrayList<DoctorsModel> searchDoctorName(ArrayList<DoctorsModel> doctorList,String name){

		ArrayList<DoctorsModel> tempList=new ArrayList<DoctorsModel>();
		for(DoctorsModel doctor:doctorList){
			if(doctor.getName().equals(name)){
				tempList.add(doctor);
			}
		}
		return tempList;
	}

	//serch for doctor by Id.						
	public ArrayList<DoctorsModel> searchDoctorId(ArrayList<DoctorsModel> doctorList,int id){

		ArrayList<DoctorsModel> tempList=new ArrayList<DoctorsModel>();
		for(DoctorsModel doctor:doctorList){
			if(doctor.getId()==id){
				tempList.add(doctor);
			}
		}
		return tempList;
	}

	//serch for doctor by specialization.						
	public ArrayList<DoctorsModel> searchDoctorSpecialization(ArrayList<DoctorsModel> doctorList,String specialization){

		ArrayList<DoctorsModel> tempList=new ArrayList<DoctorsModel>();
		for(DoctorsModel doctor:doctorList){
			if(doctor.getSpecialization().equals(specialization)){
				tempList.add(doctor);
			}
		}
		return tempList;
	}

	//serch for doctor by specialization.						
	public ArrayList<DoctorsModel> searchDoctorAvailability(ArrayList<DoctorsModel> doctorList,String availability){

		ArrayList<DoctorsModel> tempList=new ArrayList<DoctorsModel>();
		for(DoctorsModel doctor:doctorList){
			if(doctor.getAvailability().equals(availability)){
				tempList.add(doctor);
			}
		}
		return tempList;
	}

	//serch for Patients by mobileNumber.						
	public ArrayList<PatientsModel> searchPatientMobileNumber(ArrayList<PatientsModel> patientList,String mobileNumber){

		ArrayList<PatientsModel> tempList=new ArrayList<PatientsModel>();
		for(PatientsModel patient:patientList){
			if(patient.getmobileNumber().equals(mobileNumber)){
				tempList.add(patient);
			}
		}
		return tempList;
	}

	//serch for Patients by id.						
	public ArrayList<PatientsModel> searchPatientId(ArrayList<PatientsModel> patientList,int id){

		ArrayList<PatientsModel> tempList=new ArrayList<PatientsModel>();
		for(PatientsModel patient:patientList){
			if(patient.getId()==id){
				tempList.add(patient);
			}
		}
		return tempList;
	}

	//serch for Patients by age.						
	public ArrayList<PatientsModel> searchPatientAge(ArrayList<PatientsModel> patientList,int age){

		ArrayList<PatientsModel> tempList=new ArrayList<PatientsModel>();
		for(PatientsModel patient:patientList){
			if(patient.getAge()==age){
				tempList.add(patient);
			}
		}
		return tempList;
	}
}
