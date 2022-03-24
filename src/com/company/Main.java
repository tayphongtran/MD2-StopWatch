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
        long end = System.currentTimeMillis();
        System.out.println(" \nend time : " + end);
        System.out.println(" time 1000 - 3000 : 1s - 3s");
        long equalsTime = end - start;

        start = System.currentTimeMillis();
        try {
            Thread.sleep(input);
        }catch (Exception ex){
            System.out.println(ex);
        }
        end = System.currentTimeMillis();


        System.out.println("start = " + start);
        System.out.println("stop  = " + end);
        System.out.println(" \ntime has passed  = " + equalsTime);


        System.out.println(" chưa tìm được công thức chuyển đổi sang s p h");

    }
}
