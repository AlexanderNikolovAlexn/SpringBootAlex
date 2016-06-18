package com.samodeika.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ShowTime {

    private String timeString;
    private static ShowTime instance;

    private ShowTime(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        timeString = dateFormat.format(cal.getTime());
    }

    public static ShowTime getIntance() {
        if(instance == null) {
            instance = new ShowTime();
        }
        return instance;
    }

    public String getTimeString() {
        if(instance == null) {
            return null;
        }
        return instance.timeString;
    }

}
