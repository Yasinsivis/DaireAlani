package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  double pi=3.14;
      int r,a;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen Dairenin Yarı Çapını Giriniz :");
        r=inp.nextInt();
        System.out.println("Lütfen Dairenin Merkez Açısının Ölçüsünü Giriniz :");
        a=inp.nextInt();
        double alan=pi*r*r;
        double hesap=(alan*a)/360;
        System.out.println("Daire diliminin Hesabı :"+hesap);
    }
}
