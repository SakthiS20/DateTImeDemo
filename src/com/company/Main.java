package com.company;

import java.time.*;

public class Main {



    public static void main(String[] args) {
        LocalDateTime t = LocalDateTime.now(ZoneId.of("GMT"));
        System.out.println(t);

        Instant i = Instant.now();
        System.out.println(i);
        System.out.println("***************************************");
//        for (String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }
    }
}
