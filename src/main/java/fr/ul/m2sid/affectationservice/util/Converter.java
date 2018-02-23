package fr.ul.m2sid.affectationservice.util;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Converter {
    public static Date convertDateToSQLFormat(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            java.util.Date utilDate = format.parse(date);
            Date sqlDate = new Date(utilDate.getTime());
            return sqlDate;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
