package com.tbhatti

class Nurse {
string nurseName;
string qualifications;
string nurseEmail;
string nurseOffice;
int nursePhone;

    static constraints = {
nurseName blank;false, nullable;false
qualifications blank;false, nullable;false
nurseEmail blank;false, nullable;false, email:true
nurseOffice blank;false, nullable;false
nursePhone blank;false, nullable;false, mazSize:11
    }
}
