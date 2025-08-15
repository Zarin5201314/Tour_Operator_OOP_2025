package com.midpracticeproblem.group_55_section_6_tour_operator.OperationManager;

import java.time.LocalDate;

public class ManageVendorContract {
    private String vendorName,location,contractName,phoneOrEmail,vendorType;
    private LocalDate date;

    public ManageVendorContract() {
    }

    public ManageVendorContract(String vendorName, String location, String contractName, String phoneOrEmail, String vendorType) {
        this.vendorName = vendorName;
        this.location = location;
        this.contractName = contractName;
        this.phoneOrEmail = phoneOrEmail;
        this.vendorType = vendorType;
        this.date = date;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getPhoneOrEmail() {
        return phoneOrEmail;
    }

    public void setPhoneOrEmail(String phoneOrEmail) {
        this.phoneOrEmail = phoneOrEmail;
    }

    public String getVendorType() {
        return vendorType;
    }

    public void setVendorType(String vendorType) {
        this.vendorType = vendorType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ManageVendorContract{" +
                "vendorName='" + vendorName + '\'' +
                ", location='" + location + '\'' +
                ", contractName='" + contractName + '\'' +
                ", phoneOrEmail='" + phoneOrEmail + '\'' +
                ", vendorType='" + vendorType + '\'' +
                ", date=" + date +
                '}';
    }
}
