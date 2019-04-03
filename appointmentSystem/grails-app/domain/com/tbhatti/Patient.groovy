package com.tbhatti

class Patient {
	String patientName
	String patientAddress
	String patientResidence
	Date patientDOB
	String patientID
	Date dateRegistered
	int patientPhone

Appointment appointment
static hasMany=[prescription:Prescription, surgery:Surgery]  

    static constraints = {
	patientName blank:false, nullable:false;
	patientAddress blank:false, nullable:false;
	patientResidence blank:false, nullable:false;
	patientDOB blank:false, nullable:false;
	patientID blank:false, nullable:false;
	dateRegistered blank:false, nullable:false;
	patientPhone blank:false, nullable:false, maxSize:11;
    }
}
