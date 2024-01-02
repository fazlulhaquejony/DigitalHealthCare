package com.fjtechsolutions.bean;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;


import java.util.Date;

@Table(name="prescription_details")
@Entity
@Data
public class PrescriptionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DateTimeFormat(pattern="dd-MMM-yyyy")
    @Column(name ="prescription_date")
    private Date prescriptionDate;

    @NotEmpty(message = "Patient Name may not be empty")
    @Column(name ="patient_name")
    private String patientName;

    @Column(name ="patient_gender")
    private int patientGender;

    @Positive
    @Digits(fraction = 0, integer = 10, message ="add a digit msg")
    @Column(name ="patient_age")
    private int patientAge;

    @Column(name ="patient_diagnosis")
    private String patientDiagnosis;

    @Column(name ="patient_medicine")
    private String patientMedicine;

    @Column(name ="nextVisit_date")
    private Date nextVisitDate;





}
