package com.oopproject.new_tour_operator_project.Accountant;

import java.time.LocalDate;

public class EarningEntry {
    private  String packageName;
    private Double amount;
    private LocalDate date; // Using SimpleObjectProperty for LocalDate

    public EarningEntry(LocalDate date, String packageName, Double amount) {
        this.date = date;
        this.packageName = packageName;
        this.amount = amount;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "EarningEntry{" +
                "packageName='" + packageName + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
