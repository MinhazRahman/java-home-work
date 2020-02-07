package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Homework:
 * 1. Convert this date into string format "Fri, June 7 2013"
 * 2. Convert this date into string format "Friday, Jun 7, 2013 12:10:56 PM"
 *
 * https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
 */
public class DateToStringFormat {

    public static void main(String[] args) {

        //instance of SimpleDateFormat
        SimpleDateFormat simpleDateFormatter = new SimpleDateFormat("E, MMM dd yyyy");

        //date string
        String dateInString = "Fri, June 7 2013";

        //reference of Date
        Date date;

        try {

            //convert string to date
            date = simpleDateFormatter.parse(dateInString);
            System.out.println(date);

            //convert date into string format "Fri, June 7 2013"
            dateInString = simpleDateFormatter.format(date);
            System.out.println(dateInString);

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
