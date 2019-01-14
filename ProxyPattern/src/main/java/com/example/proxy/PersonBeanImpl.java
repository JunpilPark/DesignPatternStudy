package com.example.proxy;

public class PersonBeanImpl implements PersonBean {
    String name;
    String gender;
    String interest;
    int rating;
    int ratingCount = 0;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public String getInterest() {
        return this.interest;
    }

    @Override
    public int getHotOrNotRating() {
        if(ratingCount == 0) return 0;

        else {
            return this.rating /  this.ratingCount;
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating += rating;
        ratingCount++;
    }
}
