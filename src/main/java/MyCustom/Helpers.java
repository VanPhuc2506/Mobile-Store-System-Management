package MyCustom;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Helpers {
    public static String formatCurrency(double amount) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");
        return  formatter.format(amount);
    }
    public static String formatCurrency(int amount) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");
        return  formatter.format(amount);
    }
    public static String formatCurrency(long amount) {
        DecimalFormat formatter = new DecimalFormat("###,###,###.##");
        return  formatter.format(amount);
    }
    public static long getDays(Date start, Date end) {
        long amount = end.getTime() - start.getTime();
        return TimeUnit.DAYS.convert(amount, TimeUnit.MILLISECONDS);
    }
    public static Date getCurrentDate() {
        return new Date();
    }
    public static Date calculateDate(Date rawDate, int field , int time) {
        Calendar calendarCalculator = Calendar.getInstance();
        calendarCalculator.setTime(rawDate);
        calendarCalculator.add(field, time);
        Date result = calendarCalculator.getTime();
        return  result;

    }
    public static String formatPer(double rawData) {

        if (rawData<0) {
            DecimalFormat df = new DecimalFormat("##.##%");
            return df.format(rawData);
        }
        if (Double.isNaN(rawData)) {
            DecimalFormat df = new DecimalFormat("##.##%");
            return df.format(rawData);
        }
        return  "NaN";
    }
    public static String formatDate(Date date) {
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    public static int getYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int year = cal.get(Calendar.YEAR);
        return year;
    }
    public  static  Date stringToDate(String string) {
        Date date1= null;
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd").parse(string);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date1;
    }
}
