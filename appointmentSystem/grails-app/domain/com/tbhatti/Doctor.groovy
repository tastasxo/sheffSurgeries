package com.tbhatti

class Doctor {
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio

static hasMany =[prescription:Prescription,appointment:Appointment,nurse:Nurse,surgery:Surgery]

static belongsTo=[Surgery]

    static constraints = {
	fullname blank: false, nullable: false;
	qualifaction blank: false, nullable: false;
	position blank: false, nullable: false;
	doctorEmail blank: false, nullable: false, email:true;
	password blank: false, nullable: false;
	doctorOffice blank: false, nullable: false;
	doctorPhone blank: false, nullable: false, maxSize:11;
	bio blank: false, nullable: false;
    }
}
