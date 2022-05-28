package aTemp;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Question1 {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        while (cal.SECOND < 20){
            System.out.println(cal.SECOND);
        }
    }
}
