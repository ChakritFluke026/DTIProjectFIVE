package com.dti.cc;

class Dti001 extends SauClass02{
    @Override
    public void showHi(){
        System.out.println("Hi....");
    }

    public void showHello() {
        System.out.println("Hello....");
    }
}

class Dti002 extends SauClass02{
    @Override
    public void showHi(){
        System.out.println("Hi..Hi..Hi..");

    }
}

class Dti003 inplements SauClass03, SauClass04{
    @Override
    public void showHi() {}

    @Override
    public void showHey() {}
}

public class DTI {
    public static void main(String[] args) {
        SauClass01 ob1 = new SauClass01();
        //SauClass01 ob2 = new SauClass02(); Error
        //SauClass03 ob3 = new SauClass03(); Error
        Dti001 ob2 = new Dti001();

    }
}
