package com.packagee;

import java.awt.*;

public class point_date {
    public static void main(String[] args) {
//        System.out.println("Hello and welcome!");
//        Date now = new Date();
//        System.out.println(now);

        Point point1 = new Point(10, 20);
        Point point2 = new Point(30, 40);
        Point point3 = point1;

        System.out.println(point3);
        point1.x =50;
        System.out.println(point3);
        }
    }
