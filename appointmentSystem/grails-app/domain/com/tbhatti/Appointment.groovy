package com.tbhatti

class Appointment {
	Date appDate
	Time appTime
	int appDuration
	String roomNumber

static hasMany =[surgery:Surgery]
static belongsTo=[Surgery]

    static constraints = {
	appDate blank: false, nullable: false;
	appTime blank: false, nullable: false;
	appDuration blank: false, nullable: false;
	roomNumber blank: false, nullable: false;
    }
}
