package com.tbhatti

class Prescription {
	String pharmacyName
	int prescripNumber
	String medicine
	double totalCost
	Date dateIssued
	Boolean patientPaying

Patient patient 
Doctor doctor

    static constraints = {
	pharmacyName blank:false, nullable: false;
	precripNumber blank: false, nullable: false;
	medicine blank:false, nullable: false;
	totalCost blank: false, nullable: false, scale:3;
	dateIssued blank: false, nullable: false;
	patientPaying blank: false, nullable: false;
    }
}
