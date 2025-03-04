package com.dti.workshop;

//โปรแกรมคำนวณพื้นที่วงกลม กับเส้นรอบวงกลม โดยรับรัศมีทางแป้นพิมพ์ แล้วแสดงผลทางหน้าจอ
//ให้เขียนโดยใช้หลักการ OOP

import java.util.Scanner;

public class MyWorkshop01 {
    //data member
    public double radius;
    public double areaCircle;
    public double roundCircle;

    //method member
    public void imputRadius(){
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("Input radius : ");
        radius = sc.nextDouble();
        System.out.println("---------------------");

        //method member
        public void calAreaCircle(){
            areaCircle = Math.PI * radius * radius;
        }

        public void calRoundCircle(){
            roundCircle = 2 * Math.PI * radius;
        }

        public void showAreaAndRoundCircle(){
            System.out.println("Area circle is" + areaCircle);
            System.out.println("Round circle is" + roundCircle);
            System.out.println("---------------------");
        }

    }

}
