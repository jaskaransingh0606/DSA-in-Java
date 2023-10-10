import java.time.*;

public class JodaApi {
    public static void main(String[] args){
        LocalDate date= LocalDate.now();
        System.out.println(date);

       int day= date.getDayOfMonth();
         int month= date.getMonthValue();
            int year= date.getYear();

            System.out.println(day+" "+month+" "+year);

        LocalTime time= LocalTime.now();
        System.out.println(time);

        int hour= time.getHour();
        System.out.println(hour);
    }
    
}
