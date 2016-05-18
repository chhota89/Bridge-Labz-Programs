package com.bridgelabz.oop;

/*
* created by: Bridge Labz
* Date 6/05/2016
*
* Perpose: This programme is used to manage a list of Doctors associated with the Clinique. 
* This also manages the list of patients who use the clinique. It manages Doctors by Name, Id, Specialization and Availability (AM,  PM orboth).
* It manages Patients by Name, ID, Mobile Number and Age. The Program allows users to search Doctor by name, id, Specialization or Availability. Also the programs allows users to search patient by name, mobile number or id.
* The programs allows patients to take appointment with the doctor. A doctor at  any availability time can see only 5 patients. If exceeded the user can take appointment for patient at different date or availability time.
* Print the Doctor Patient Report. Also show which Specialization is popular in the Clinique as well as which Doctor is popular.
 
**/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
import com.bridgelabz.model.DoctorsModel;
import com.bridgelabz.model.PatientsModel;
import com.bridgelabz.model.DoctorAppointmentModel;
import com.bridgelabz.utility.Utility;
import java.util.Iterator;
import java.util.Map;
public class Main{

	ArrayList<DoctorsModel> doctorList;
	ArrayList<PatientsModel> patientsList;
	Utility utility;
	HashMap<DoctorAppointmentModel,Integer> appoientment;
	Search search;

	//Initalize all the class
	public Main(){
		utility=new Utility();
		doctorList=new ArrayList<DoctorsModel>();
		patientsList=new ArrayList<PatientsModel>();
		appoientment=new HashMap<DoctorAppointmentModel,Integer>();
		search=new Search();
	}

	public static void main(String args[]){
	Main mainObject=new Main();
	String exit;

	//Display Main menu
		do{
		System.out.println("Menu");
		System.out.println("1: Enter Doctors Detials");
		System.out.println("2: Enter Patients Detils");
		System.out.println("3: Search Patients Detils");
		System.out.println("4: Search Doctors Detils");
		System.out.println("5: Display all Doctors detils");
		System.out.println("6: Display all Patient detils");
		System.out.println("7: Take Appoientment");
		System.out.println("8: Print Appoientment");
		System.out.println("9: Print Popular Doctor");
		System.out.println("10: Print Popular Specialization");
		System.out.println("Enter Your Choice");
		mainObject.menuChoice(mainObject.utility.inputInteger());
		System.out.println("Enter E to Exit");
		exit=mainObject.utility.inputWord();
		}while(!exit.equalsIgnoreCase("E"));
	}


	//this function call appropriate funtion based on user choice. 
	public void menuChoice(int choice){
		System.out.println();
		switch(choice){
		
		case 1: doctorList.add(new DoctorsModel());
				break;
		case 2: patientsList.add(new PatientsModel());
				break;
		case 3: searchPatientMenu();
				break;
		case 4: searchDoctorsMenu();
				break;
		case 5: System.out.println("Id   Name  Specialization   availability");
				System.out.println(doctorList);
				System.out.println();
				break;
		case 6: System.out.println("Id   MobileNumber  Age");
				System.out.println(patientsList);
				System.out.println();
				break;
		case 7: takeAppoientment();
				break;
		case 8: utility.printMap(appoientment);
				break;	
		case 9: ArrayList<Integer> list=printPopularDoctor();
				if(list.size()>0){
					System.out.println("Famous doctor is :");
					System.out.println(list);
				}
				else
					System.out.println("No doctor is popular.");
				break;
		case 10: printPopularSpecialization();
				break;
		}
	}

	//Display search patient menu.
	public void searchPatientMenu(){
		System.out.println("Search Patient By");
		System.out.println("1 Mobile Number");
		System.out.println("2 Id");
		System.out.println("3 Age");
		System.out.println("Enter Your Choice");
		searchPatient(utility.inputInteger());
	}

	//Display search patient menu.
	public void searchDoctorsMenu(){
		System.out.println("Search Doctors By");
		System.out.println("1 Name");
		System.out.println("2 Id");
		System.out.println("3 Specialization");
		System.out.println("4 Availability");
		System.out.println("Enter Your Choice");
		searchDoctors(utility.inputInteger());
	}

	public void searchDoctors(int choice){
		System.out.println();
		switch(choice){
		
		case 1: System.out.println("Enter Name of Doctor");
			System.out.println(search.searchDoctorName(doctorList,utility.inputWord()));
			break;
		case 2: System.out.println("Enter Id of Doctor");
			System.out.println(search.searchDoctorId(doctorList,utility.inputInteger()));
			break;
		case 3: System.out.println("Enter Specialization of Doctor");
			System.out.println(search.searchDoctorSpecialization(doctorList,utility.inputWord()));
			break;
		case 4: System.out.println("Enter Availability of Doctor");
			System.out.println(search.searchDoctorAvailability(doctorList,utility.inputWord()));
			break;
		}
	}

	public void searchPatient(int choice){
		System.out.println();
		switch(choice){
		
		case 1: System.out.println("Enter Name of Patient");
			System.out.println(search.searchPatientMobileNumber(patientsList,utility.inputWord()));
			break;
		case 2: System.out.println("Enter Id of Patient");
			System.out.println(search.searchPatientId(patientsList,utility.inputInteger()));
			break;
		case 3: System.out.println("Enter Age of Patient");
			System.out.println(search.searchPatientAge(patientsList,utility.inputInteger()));
			break;

		}
	}
	
	//Take aAppointment with doctor.
	public void takeAppoientment(){
		System.out.println("Enter Doctor Id");
		int docorId=utility.inputInteger();
		ArrayList<DoctorsModel> listOfDoctorId=search.searchDoctorId(doctorList,docorId);
		if(listOfDoctorId!=null)
			if(listOfDoctorId.size()>=1){
				System.out.println("Enter Date of Appoientmentd (01/05/2016):");
				Date date=utility.stringToDate(utility.inputWord());
				if(date==null)
					System.out.println("Date format is not correct");
				//Checkig for avilability of doctors
				else{
					DoctorAppointmentModel newAppointment=new DoctorAppointmentModel(docorId,date);
					if(appoientment.containsKey(newAppointment)){
						//allready some appointment is there on that date
						Integer appointmentOnThatday=appoientment.get(newAppointment);
						if(appointmentOnThatday<=5){
							//Appoientment on given date is less then 5
							//Patient can get Appointment on that day
							appointmentOnThatday++;
							appoientment.put(newAppointment,appointmentOnThatday);
							System.out.println("Appointment Schedule on"+date.toString()+" "+"with Doctor Id"+docorId);

						}
						else{
							//On given date apppointment is more then 5
							System.out.println("Please Select Another date"); 
						}
					}
					else{
						//No appointment is there on given date
						appoientment.put(newAppointment,1);
						System.out.println("New Appoientment is assign to patient..............");
					}
				}
			}
			//doctor Id does not exit in the DoctorsList
			else{
				System.out.println("Invalid Doctor Id");
			}
		else{
			System.out.println("Invalid Doctor Id");
		}
	}

	//Doctor is famous if appoientment is more than 25% off all appoientment.
	public ArrayList<Integer> printPopularDoctor(){
		//find total appoientment.
		ArrayList<Integer> list=new ArrayList<>();
		int totalAppoientment = totalAppoientment();
		HashMap<Integer,Integer> doctorMap=new HashMap<>();
			Iterator it = appoientment.entrySet().iterator();
    		while (it.hasNext()) {
        		Map.Entry pair = (Map.Entry)it.next();
        		int doctorId = ((DoctorAppointmentModel)pair.getKey()).getDoctorId();

				if(doctorMap.containsKey(doctorId)){
					//all ready appoient is there for that doctors
					doctorMap.put(doctorId,doctorMap.get(doctorId)+1);
				}
				else{
					doctorMap.put(doctorId,1);
				}

    		}

		//Show the doctor whose appoientment is more then 25%
		it = doctorMap.entrySet().iterator();
    		while (it.hasNext()) {
        		Map.Entry pair = (Map.Entry)it.next();
				if((Integer)pair.getValue() >= ((Integer)(totalAppoientment/4)))
					list.add(((Integer)pair.getKey()));
    		}

		return list;
	}

	public int totalAppoientment(){
		int number=0;
		Iterator it = appoientment.entrySet().iterator();
    		while (it.hasNext()) {
        		Map.Entry pair = (Map.Entry)it.next();
        		number+= (Integer)pair.getValue();
    		}
		return number;
	}

	//Specialization is famous if having more appoientment.
	public void printPopularSpecialization(){
		ArrayList<Integer> list= printPopularDoctor();
		for(Integer doctorId: list){
			for(DoctorsModel doctor:doctorList){
				if(doctorId == doctor.getId())
					System.out.println("Popular specializatin is :"+doctor.getSpecialization());
			}
		}
	}
}
