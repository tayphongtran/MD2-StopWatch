package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long start;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" start time : ");
        int input = scanner.nextInt();
        start = System.currentTimeMillis();
        System.out.println(" start = " + start);
        System.out.println("\n bạn chọn: " + input);
        input = scanner.nextInt();
        System.out.println(" ban chon " + input);
        long end = System.currentTimeMillis();
        System.out.println(" \nend time : " + end);
        System.out.println(" time 1000 - 3000 : 1s - 4s || > 4s");
        long equalsTime = end - start;

        start = System.currentTimeMillis();
        try {
            Thread.sleep(1000);// thử thay input xem
        }catch (Exception ex){
            System.out.println(ex);
        }
        end = System.currentTimeMillis();


        System.out.println("start = " + start);
        System.out.println("stop  = " + end);
        System.out.println(" \ntime has passed  = " + equalsTime);


        System.out.println("  công thức chuyển đổi sang s p h");

        // check time thuc
        long stopTime = (equalsTime/1000)%60;
        System.out.println(" delay  : " + stopTime + "s");

//        int seconds = (int) (milliseconds / 1000) % 60 ;
//        int minutes = (int) ((milliseconds / (1000*60)) % 60);
//        int hours   = (int) ((milliseconds / (1000*60*60)) % 24);
//etc...


    }
}
