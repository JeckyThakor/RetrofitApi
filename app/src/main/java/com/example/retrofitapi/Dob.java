
package com.example.retrofitapi;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Dob {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("age")
    @Expose
    private Integer age;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Dob() {
    }

    /**
     * 
     * @param date
     * @param age
     */
    public Dob(String date, Integer age) {
        super();
        this.date = date;
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
