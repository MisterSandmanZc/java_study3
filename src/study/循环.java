package study;


import java.util.Date;

public class 循环 {
    public static void main(String[] args) {
        int a=1231075;
        int b=1;
        int c=121075;
        //我现在解决的问题是 如何通过数字类型得到长度，完全利用基本变量
        //现在的问题是丢掉其中一位，然后其他位重新组合
        System.out.println(10<<2);
        System.out.println(a/(int)((Math.pow(10, 4))));
        System.out.println(a%(Math.pow(10, 4)));























    }
    static int get_int_Length(int n){
        int i=0;
        while (n>0){
            i++;
            n/=10;

        }
        return i;
    }
    static void get_xixuegui_number(int a){
        for(int i=10;i<99;i++){
            int b=a*i;
            int b2=a*100+i;
            if(b>=1000&&b<=9999&b%100!=0){
                for(int j=3;j>=0;j--){
                    int m= (int) Math.pow(10, j);
                    int num=(b-b%m)/m;
                    b=b-num*m;
                    for(int k=3;k>=0;k--){
                        int m2= (int) Math.pow(10, k);
                        int num2=(b2-b2%m2)/m2;
                        int b3=b2;
                        b3=b3-num2*m2;
                        if(num==num2){

                        }
                    }

                }
            }
        }

    }

    static void fbnq_number(int a){
        //根本不需要switch 只需要一个for一样用
        int base=0;
        int up=1;
        switch (a){
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(1);
                System.out.println(1);
                break;
            default:
                // 当前数->上一个数  由于初始0没有上一个数，直接给他下一个数1
                // 0->1 1->0 1->1 2->1
                for(int i=0;i<a;i++){
                    int up2=base;
                    base+=up;
                    up=up2;
                    System.out.println(base);
                }

        }
    }
    static void getBingary(){
        //怎么的到一个最低位是0 然后交替的十六位常量
        int a=0;
        for(int i=0;i<8;i++){
            int b=i%2!=0?1<<i:0;
            a|=b;

        }
        System.out.println(a);
    }
    //16进制转换为10进制
    static int Base16_conversion(String number){
        int base=16;
        if(number.toUpperCase().startsWith("0X")){
            number=number.substring(2);
        }
        int all=0;
        for(int i=number.length()-1;i>=0;i--){
            char n=number.toUpperCase().charAt(i);
            int a=0;
            //转换为10进制的计算
            if(n>='0'&&n<='9'){
                 a=n-'0';
            }else if(n>='A'&&n<='F'){
                a=n-'A'+10;
            }
            all+=(int)(Math.pow(base,number.length()-1-i))*a;

        }
        System.out.println(all);
        return all;
    }


}
