package com.dti.workshop;
//โปรแกรมคำนวณพื้นที่วงกลม กับเส้นรอบวงกลม โดยรับรัศมีทางแป้นพิมพ์ แล้วแสดงผลทางหน้าจอ
//โดยให้เขียนโดยใช้หลักการ OOP

public class MyWorkshop02 {
    public double cubeCircle;

    public void calCubeCircle(){
        cubeCircle = Math.PI * radius * radius * radius * 4/3;
    }

    @Override
    public void showAreaAndRoundCircle(){
        System.out.println("Area circle is " + areaCircle);
        System.out.println("Round circle is " + roundCircle);
        System.out.println("Cube circle is " + cubeCircle);
        System.out.println("---------------------");
    }
}
