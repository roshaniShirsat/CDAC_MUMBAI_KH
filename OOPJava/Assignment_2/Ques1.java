import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

class Ques1{
    public static void main(String args[])throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day : ");
        int day = sc.nextInt();
        System.out.println("Enter month : ");
        int month = sc.nextInt();
        System.out.println("Enter year : ");
        int year = sc.nextInt();
        System.out.println("Enter hour : ");
        int hr = sc.nextInt();
        System.out.println("Enter min : ");
        int min = sc.nextInt();
        System.out.println("Enter sec : ");
        int sec = sc.nextInt();

        Calendar c = Calendar.getInstance();
        
        
        
        
        SimpleDateFormat s1_1 = new SimpleDateFormat("dd/MM/yyyy ");
        SimpleDateFormat s1_2 = new SimpleDateFormat("MM/dd/yyyy ");
        SimpleDateFormat s1_3 = new SimpleDateFormat("yyyy/MM/dd ");

        SimpleDateFormat s2_1 = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat s2_2 = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat s2_3 = new SimpleDateFormat("HH:mm");

        SimpleDateFormat s3_1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
        SimpleDateFormat s3_2 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");
        SimpleDateFormat s3_3 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        
        // SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // String s = day+"/"+month+"/"+year+" "+hr+":"+min+":"+sec;
        // Date d = sd.parse(s);
        // // System.out.println(d.toString());
        // System.out.println("dd/MM/yyyy : "+s1_1.format(d));
        // System.out.println("yyyy/MM/dd HH:mm : "+s3_3.format(d));

        c.set(year,(month+1),day,hr,min,sec);
        System.out.println("dd/mm/yyyy "+s1_1.format(c.getTime()));
        System.out.println("mm/dd/yyyy "+s1_2.format(c.getTime()));
        System.out.println("yyyy/mm/dd "+s1_3.format(c.getTime()));

        System.out.println("HH:mm:ss : "+s2_1.format(c.getTime()));
        System.out.println("hh:mm:ss a : "+s2_2.format(c.getTime()));
        System.out.println("HH:mm : "+s2_3.format(c.getTime()));

        System.out.println("dd/mm/yyy HH:mm:ss : "+s3_1.format(c.getTime()));
        System.out.println("mm/dd/yyyy hh:mm:ss a : "+s3_2.format(c.getTime()));
        System.out.println("yyyy/mm/dd HH:mm : "+s3_3.format(c.getTime()));
    }
}
