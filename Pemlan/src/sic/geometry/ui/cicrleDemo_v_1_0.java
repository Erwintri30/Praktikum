package sic.geometry.ui;

import java.util.Scanner;

import sic.geometry.circle.cicrle;

public class cicrleDemo_v_1_0 {
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Circle Demo v1.0");
        System.out.println(" By Erwin Trimulya Purwono");
        System.out.println("---------------------");

        cicrle lingkaran = new cicrle();
        Scanner scn = new Scanner(System.in);
        System.out.println(" \n masukan radius lingkaran anda!");
        double radius = scn.nextDouble();
        lingkaran.setRadius(radius);
        System.out.println("\n dimensi lingkaran");
        System.out.println("---------------------");
        System.out.println("\n Radius= " + lingkaran.getRadius());
        System.out.println(" \n luas lingkaran = " + lingkaran.luasLingkaran());
        System.out.println("\n keliling lingkaran = " + lingkaran.kelLingkaran());

        scn.close();

    }

}
