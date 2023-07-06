package com.example.dining_review;

import jakarta.persistence.*;

import java.lang.reflect.Array;

@Entity
@Table(name="RESTAURANT")
public class Restaurant {
    @Id
    @GeneratedValue
    private long id;

    @Column(name="TOTALPEANUTSCORE")
    private Integer totalPeanutScore;
    @Column(name="PEANUTREVIEWS")
    private Integer peanutReviews;

    @Column(name="TOTALEGGSCORE")
    private Integer totalEggScore;
    @Column(name="EGGREVIEWS")
    private Integer eggReviews;

    @Column(name="TOTALDAIRYSCORE")
    private Integer totalDairyScore;
    @Column(name="DAIRYREVIEWS")
    private Integer dairyReviews;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void addPeanutReview(Integer peanutReview) {
        this.peanutReviews = this.peanutReviews + 1;
        this.totalPeanutScore = this.totalPeanutScore + peanutReview;
    }

    public void addEgg(Integer eggReview) {
        this.eggReviews = this.eggReviews + 1;
        this.totalEggScore = this.totalEggScore + eggReview;
    }

    public void addDairyReview(Integer dairyReview) {
        this.dairyReviews = this.dairyReviews + 1;
        this.totalDairyScore = this.totalDairyScore + dairyReview;
    }
}
