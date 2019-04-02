package com.tbhatti

class Appointment {
date appDate;
time appTime;
int appDuration;
string roomNumber;

    static constraints = {
appDate blank;false, nullable;false
appTime blank;false, nullable;false
appDurtion blank;false, nullable;false
roomNumber blank;false, nullable;false
    }
}
