import java.util.*;

public class DateTime {
    public static void main(String[] args) {
        Date date= new Date();
        System.out.println(date);

        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);


        //This also works

        // java.util.Date utilDate = new java.util.Date();
    }
    
}
