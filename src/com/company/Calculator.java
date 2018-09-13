package com.company;

public class Calculator {
    long number;

    public Calculator(long number) {
        this.number = number;
    }
    public void Remainder(){
        long remainder = this.number % (-5);
        System.out.println(remainder);
    }

    public void ToOctal(){
        System.out.println(Integer.toOctalString((int)number));
    }

    public void GetFactorial(){
        long factorial=1;
        long n = number;
        while(n>0){
            factorial*=n;
            n--;
        }
        System.out.println(factorial);
    }

    public boolean IsFibonacci(){
        if(number == 1) return true;
        else{
            long a =1, b=1,c=0;
            while (c<number){
                c=a+b;
                a=b;
                b=c;
            }
            if(c == number) return true;
            else return false;
        }
    }

    public boolean IsSimple(){
           int l=0;
       for(long i = 2;i<number-2;i++){
           float k = number/i;
           if(k==(int)k){
               l++;
           }
       }
       if(l>=1) return  false;
       else return true;
    }

}
