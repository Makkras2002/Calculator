package com.company;

public class Calqulator {
    double countSum(double a,double b){
        double res =0;
        res=a+b;
        return res;
    }
    double countRazn(double a,double b){
        double res =0;
        res=a-b;
        return res;
    }
    double countMult(double a,double b){
        double res =0;
        res=a*b;
        return res;
    }
    double countDiv(double a,double b){
        double res =0;
        if(b ==0){
            System.out.println("Incorrect data.");
            return a/b;
        }
        return a/b;
    }
    int countfactorial(int a){
        int res =1;
        int index =1;
        if(a <1)
        {
            System.out.println("Incorrect data.");
            res =0;
        }
        while(index<=a){
            res*=index;
            index++;
        }
        return res;
    }
}
