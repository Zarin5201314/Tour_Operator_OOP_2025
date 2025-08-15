package com.midpracticeproblem.group_55_section_6_tour_operator.TourGuide;

import java.time.LocalDate;

public class RateLocalServiceProvider {
    private String providerName,provideType,rating,comments;
    private LocalDate date;

    public RateLocalServiceProvider() {
    }

    public RateLocalServiceProvider(String providerName, String provideType, String rating, String comments) {
        this.providerName = providerName;
        this.provideType = provideType;
        this.rating = rating;
        this.comments = comments;
        this.date = date;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProvideType() {
        return provideType;
    }

    public void setProvideType(String provideType) {
        this.provideType = provideType;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "RateLocalServiceProvider{" +
                "providerName='" + providerName + '\'' +
                ", provideType='" + provideType + '\'' +
                ", rating='" + rating + '\'' +
                ", comments='" + comments + '\'' +
                ", date=" + date +
                '}';
    }
}
