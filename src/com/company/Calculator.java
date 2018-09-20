package com.company;

public class Calculator{

    public void Remainder(long number){
        long remainder = number % (-5);
        System.out.println(remainder);
    }



    public void ToOctal(long number){
        if(number<0)  {
            System.out.println( "-" + Long.toOctalString(number*(-1)));
        }
        else   {
            System.out.println(Long.toOctalString(number));
        }
    }

    public void GetFactorial(long number){
        long factorial=1;
        while(number>0){
            factorial*=number;
            number--;
        }
        if(factorial<= 0)  System.out.println("This factorial is too strong for u, traveller");
        else  System.out.println(factorial);
    }

    public boolean IsFibonacci(long number){
        if(number < 0) return false;
        if(number == 1||number ==0) return true;
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

    public boolean IsSimple(long number){
           if(number <= 1) return false;
           int l=0;
           for(long i = 2;i<number-2;i++){
               float k = (float)number/i;
               if(k-(int)k == 0){
                   l++;
               }
           }
           if(l>=1) return  false;
           else return true;
    }

}
