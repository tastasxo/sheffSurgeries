package com.tbhatti

class Surgery {
	string name
	string address
	string postcode
	int telephone
	int numberOfPatients
	string description
	float openingTime

Appointment appointment
static hasMany =[doctor:Doctor,nurse:Nurse,patient:Patient,receptionist:Receptionist]

    static constraints = {
	name blank: false, nullable: false;
	address blank: false, nullable: false;
	postcode blank: false, nullable: false;
	telephone blank: false, nullable: false, maxSize:11;
	numberOfPatients blank: false, nullable: false, maxSize:50;
	description blank: false, nullable: false;
	openingTime blank: false, nullable: false;
    }
}
