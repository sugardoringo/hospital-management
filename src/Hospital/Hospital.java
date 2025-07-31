/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

/**
 *
 * @author Admin
 */
public class Hospital {
    private int patient_id;
    private String patient_name;
    private int patient_age;
    private String patient_gender;
    private String patient_address;
    private String patient_mobileNumber;
    
    private int doc_id;
    private String doc_name;
    private String doc_specialization;
    
    private String date;
    private String time;
    
    private String bloodPressure;
    private String temperature;
    private String pulseRate;
    private String symptoms;
    private String diagnose;
    
    private String medicine;
    private String remark;
    private String advice;
    
    //constructor for patient
    public Hospital(int patient_id, String patient_name, int patient_age, String patient_gender, String patient_address, String patient_mobileNumber){
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_gender = patient_gender;
        this.patient_address = patient_address;
        this.patient_mobileNumber = patient_mobileNumber;
    }
    //constructor for  doctor
    public Hospital(int doc_id, String doc_name, String doc_specialization){
        this.doc_id = doc_id;
        this.doc_name = doc_name;
        this.doc_specialization = doc_specialization;
    }
    //constructor for appointment
    public Hospital(int patient_id, String patient_name, String doc_name, String date, String time){
         this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.doc_name = doc_name;
        this.date = date;
        this.time = time;
    }
    //constructor for diagnose
    public Hospital(int patient_id, String patient_name, String bloodPressure, String temperature, String pulseRate, String symptoms, String diagnose){
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.bloodPressure = bloodPressure;
        this.temperature = temperature;
        this.pulseRate = pulseRate;
        this.symptoms = symptoms;
        this.diagnose = diagnose;
    }
    public Hospital(int patient_id, String patient_name, String diagnose, String medicine, String remark, String advice){
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.diagnose = diagnose;
        this.medicine = medicine;
        this.advice = advice;
    }
    public int getPatient_id() {
        return patient_id;
    }
    public void setPatient_id(int patientId){
        patient_id = patientId;
    }
    public String getPatient_name(){
        return patient_name;
    }
    public void setPatient_name(String patientName){
        patient_name = patientName;
    }
    public int getPatient_age(){
        return patient_age;
    }
    public void setPatient_age(int patientAge){
        patient_age = patientAge;
    }
    public String getPatient_gender(){
        return patient_gender;
    }
    public void setPatient_gender(String patientGender){
        patient_gender = patientGender;
    }
    public String getPatient_address(){
        return patient_address;
    }
    public void setPatient_address(String patientAddress){
        patient_address = patientAddress;
    }
    public String getPatient_mobileNumber(){
        return patient_mobileNumber;
    }
    public void setPatient_mobileNumber(String patientMobileNumber){
        patient_mobileNumber = patientMobileNumber;
    }
    
    public int getDoc_id(){
        return doc_id;
    }
    public void setDoc_id(int docId){
        doc_id = docId;
    }
    public String getDoc_name(){
        return doc_name;
    }
    public void setDoc_name(String docName){
        doc_name = docName;
    }
    public String getDoc_specialization(){
       return doc_specialization;
    }
    public void setDoc_specialization(String docSpecialization){
        doc_specialization = docSpecialization;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String appDate){
        date = appDate;
    }
     public String getTime(){
        return time;
    }
    public void setTime(String appTime){
        time = appTime;
    }
    
    public String getBloodPressure(){
        return bloodPressure;
    }
    public void setBloodPressure(String bloodPres){
        bloodPressure = bloodPres;
    }
    public String getTemperature(){
        return temperature;
    }
    public void setTemperature(String temp){
        temperature = temp;
    }
    public String getPulseRate(){
        return pulseRate;
    }
    public void setPulseRate(String pulseReyt){
        pulseRate = pulseReyt;
    }
    public String getSymptoms(){
        return symptoms;
    }
    public void setSymptoms(String symp){
        symptoms = symp;
    }
    public String getDiagnose(){
        return diagnose;
    }
    public void setDiagnose(String diag){
        diagnose = diag;
    }
    public String getMedicine(){
        return medicine;
    }
    public void setMedicine(String med){
        medicine = med;
    }
     public String getRemark(){
        return remark;
    }
    public void setRemark(String reMark){
        remark = reMark;
    }
     public String getAdvice(){
        return advice;
    }
    public void setAdvice(String advi){
        advice = advi;
    }
}   
