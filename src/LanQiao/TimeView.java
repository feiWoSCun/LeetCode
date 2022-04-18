package LanQiao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeView {
    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
       long time=sca.nextLong()-28800000;
        Date date=new Date(time);
        SimpleDateFormat dft=new SimpleDateFormat("HH:mm:ss") ;
        String str=dft.format(date);
        System.out.println(str);
    }
}
