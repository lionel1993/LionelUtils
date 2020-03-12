package com.lionel.utils;

import org.example.AppTest;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilsTest extends AppTest {

    @Test
    public void parseTimestampToStr(){

        System.out.println(DateUtils.parseTimestampToTimeStr(System.currentTimeMillis()));
        System.out.println(DateUtils.parseTimestampToDateStr(System.currentTimeMillis()));

    }


    @Test
    public void parseDateStrToTime(){

        System.out.println(DateUtils.parseDateStrToTimestamp("2020-10-10"));
        System.out.println(DateUtils.parseTimeStrToTimestamp("2020-10-10 10:10:10"));

    }

}