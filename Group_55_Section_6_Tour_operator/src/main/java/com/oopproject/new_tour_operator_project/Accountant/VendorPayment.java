package com.oopproject.new_tour_operator_project.Accountant;



public class VendorPayment {
    private String  vendorName;
    private double  amount;
    private String  status;

    public VendorPayment(String vendorName, double amount, String status) {
        this.vendorName = vendorName;
        this.amount = amount;
        this.status = status;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "VendorPayment{" +
                "Vendor Name='" + vendorName + '\n' +
                ", Amount='" + amount + '\n' +
                ", Status='" + status + '\n' +
                '}';
    }
}
