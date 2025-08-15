package com.oopproject.new_tour_operator_project.Accountant;

import java.time.LocalDate;

public class RefundRequest {
    private String packageId;
    private String touristId;
    private Double totalAmount;
    private String status;





    public RefundRequest(String packageId, String touristId, Double totalAmount, String status) {
        this.packageId = packageId;
        this.touristId = touristId;
        this.totalAmount = totalAmount;
        this.status = status;
    }



    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTouristId() {
        return touristId;
    }

    public void setTouristId(String touristId) {
        this.touristId = touristId;
    }

    @Override
    public String toString() {
        return "RefundRequest{" +
                "Package Id='" + packageId + '\n' +
                ", Tourist Id='" + touristId + '\n' +
                ", TotalAmount=" + totalAmount +
                ", Status='" + status + '\n' +

                '}';
    }
}



