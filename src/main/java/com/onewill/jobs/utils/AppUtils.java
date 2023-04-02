package com.onewill.jobs.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static com.onewill.jobs.utils.constants.StringConstants.TEXT_DATE_FORMAT_YYYY_MM_DD;

public class AppUtils {

    //Date Utils
    public static Date convertLocalDateToDate(LocalDate localDate) {
        return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    public static String convertDateToStringDate(Date date) {
        DateFormat dateFormat = new SimpleDateFormat(TEXT_DATE_FORMAT_YYYY_MM_DD);
        return dateFormat.format(date);
    }

    public static LocalDate convertDateToLocalDate(Date date) {
        return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

}
