package com.example.retrofitradiobutton;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DateTime {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("milliseconds_since_epoch")
    @Expose
    private Integer millisecondsSinceEpoch;
    @SerializedName("time")
    @Expose
    private String time;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getMillisecondsSinceEpoch() {
        return millisecondsSinceEpoch;
    }

    public void setMillisecondsSinceEpoch(Integer millisecondsSinceEpoch) {
        this.millisecondsSinceEpoch = millisecondsSinceEpoch;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
