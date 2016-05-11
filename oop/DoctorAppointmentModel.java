package com.bridgelabz.model;

/*

* created by: Bridge Labz
* Date 5/05/2016
*
* Perpose: This model is used as key for HashMap that store information of number appoientment on perticular date 	 

**/

import java.util.Date;
public class DoctorAppointmentModel{

	private Integer doctorId;
	private Date appointmentDate;

	public DoctorAppointmentModel(Integer doctorId,Date appointmentDate){
		this.doctorId=doctorId;
		this.appointmentDate=appointmentDate;
	}

	public Integer getDoctorId(){
		return doctorId;
	}

	public Date getAppointmentDate(){
		return appointmentDate;
	}
	
	public void setDoctorId(Integer doctorId){
		this.doctorId=doctorId;
	}

	public void setAppointmentDate(Date appointmentDate){
		this.appointmentDate=appointmentDate;
	}


	@Override
	public int hashCode(){
    	return this.doctorId.hashCode()+this.appointmentDate.hashCode();
	}

	@Override
	public boolean equals(Object object){
    	if (object == null) 
			return false;
    	if (object == this) 
			return true;
    	if (!(object instanceof DoctorAppointmentModel))
			return false;
    	DoctorAppointmentModel doctorAppoientment = (DoctorAppointmentModel)object;
		if((this.doctorId==doctorAppoientment.doctorId) && (this.appointmentDate.equals(doctorAppoientment.appointmentDate)))
			return true;
		else
			return false;
	}

	@Override
	public String toString(){
		return " "+doctorId+" "+appointmentDate;
	}


}
