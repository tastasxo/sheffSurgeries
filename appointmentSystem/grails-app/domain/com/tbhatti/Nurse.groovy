package com.tbhatti

class Nurse {
	String nurseName
	String qualifications
	String nurseEmail
	String nurseOffice
	int nursePhone

static hasMany =[surgery:Surgery]
static belongsTo=[Surgery]

    static constraints = {
	nurseName blank: false, nullable:false;
	qualifications blank: false, nullable:false;
	nurseEmail blank: false, nullable: false, email:true;
	nurseOffice blank: false, nullable:false;
	nursePhone blank: false, nullable: false, mazSize:11;
    }
}
