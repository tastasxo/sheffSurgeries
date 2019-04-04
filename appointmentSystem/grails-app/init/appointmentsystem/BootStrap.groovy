package com.tbhatii

class BootStrap {

    def init = { servletContext ->
// add objects here
def Lynne Fletcher= new Patient(
patientName:'Lynne',
patientAddress:'33 Folks Road',
patientResidence:'Sheffield',
patientDOB:new Date('06/12/1986'),
patientID:'A123',
dateRegistered:new Date('04/04/2019'),
patientPhone: 0767549087651

).save()

def Samantha Fletcher= new Patient(
patientName:'Samantha',
patientAddress:'33 Folks Road',
patientResidence:'Sheffield',
patientDOB:new Date('09/11/1987'),
patientID:'A124',
dateRegistered:new Date('04/04/2019'),
patientPhone:0767549087651

).save() 

def appointment1= new Appointment(
appDate:new Date('11/04/2019'),
appTime:'3:00pm',
appDuration:'45',
roomNumber:'4a'

).save()
def appointment2= new Appointment(
appDate:new Date('11/04/2019'),
appTime:'1:00pm',
appDuration:'30',
roomNumber:'4b'

).save()

def doctor1= new Doctor(
fullName:'Dr Ali Shah',
qualification:'Medicine',
position:'Junior',
doctorEmail:'docashah@gmail.com',
password:'AShahpass1',
doctorOffice:'D-8899',
doctorPhone:0121456786908,
bio:'Doctor Shah studied at Manchester University..'

).save()

def doctor2= new Doctor(
fullName:'Dr Sussan Immpechie',
qualification:'Medicine',
position:'Senior',
doctorEmail:'docsimmpechie@gmail.com',
password:'SImmpechiepass1',
doctorOffice:'D-8897',
doctorPhone:0121657786908,
bio:'Doctor studied at Oxford University..'

).save()

def surgery1= new Surgery(
name:'City Health Centre',
address:'21 Hallam Street, Sheffield',
postcode:'S11 3YE',
telephone:0121657786908,
numberOfPatients:50,
description:'City Health was built in 2001...',
openingTime:'09:00-17:00hrs'

).save()

def surgery2= new Surgery(
name:'College Health Centre',
address:'26 Manfield Street, Sheffield',
postcode:'S63 3NR',
telephone:0121657766808,
numberOfPatients:50,
description:'College Health was built in 2008...',
openingTime:'09:00-17:00hrs'

).save()

def receptionist1= new Receptionist(
recepName:'Rob Flington',
recepEmail:'r.flington@gmail.com',
recepUsername:'rflington',
recepPassword:'passrecep01',
recepPhone:0121657786908

).save()
def receptionist2= new Receptionist(
recepName:'September Sanders',
recepEmail:'s.sanders@gmail.com',
recepUsername:'ssanders',
recepPassword:'passrecep02',
recepPhone:0121657766808

).save()
def nurse1= new Nurse(
nurseName:'Sonia Adams',
qualifications:'Registered General Nurse',
nurseEmail:'sadams@gmail.com',
nurseOffice:'D-978',
nursePhone:01216597966808
).save()

def nurse2= new Nurse(
nurseName:'Sally Peters',
qualifications:'Registered General Nurse',
nurseEmail:speters@gmail.com,
nurseOffice:'C-908',
nursePhone:0121657785908
).save()

def prescription1=new Prescription(
pharmacyName:'City Centre Pharmacy',
prescripNumber:55678,
medicine:'Amoxicilian',
totalCost:0900,
dateIssued:new Date('25/04/2019'),
patientPaying:true


).save()

def prescription2=new Prescription(
pharmacyName:'College Centre Pharmacy'
prescripNumber:25624,
medicine:'Ramprolol',
totalCost:0900,
dateIssued:new Date('23/04/2019'),
patientPaying:true


).save()

    }
    def destroy = {
    }
}
