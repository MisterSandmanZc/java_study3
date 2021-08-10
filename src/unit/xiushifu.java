package unit;
import java.io.InputStreamReader;
import java.util.Random;

import static unit.father.*;


/**
 * 测试类
 */
public class xiushifu {
    String name="aa";
   static char a;
   xiushifu(){
       System.out.println(name);
       System.out.println(2);
   }

    /**
     *
     * @param x 测试非基本类型修改字段值
     * @author zc
     */
    public static void changge(xiushifu x){
        x.name="bb";
    }
    public static void main(String[] args) {
        long n= (long) 1.0E7;
       float a=-1E38F;//最小范围数字
       double a2=1E308;//最大数字
       a+=1;
       a2-=1;
       System.out.println(a);
        System.out.println(a2);
        float a3=1E6F;
        int a4=0;
        System.out.println(a3);
        System.out.println(~1);

        try {
          //  InputStreamReader reader = new InputStreamReader(System.in);
            if(args[0].equals("aa")){
              // System.out.println(12);
            }
            System.out.println("args[0] = " +args[0]+ ", args[1] = "+ args[1] +", args[2] ="+ args[2]);
        }catch (Exception e){
            System.out.println(1);
        }

        xiushifu s1=new xiushifu();
        xiushifu s2=new xiushifu();
        s1.name="kk";
        s2.name=s1.name;
        s1.name="123";
        println(s2.name);


    }
    /* Output:(55% match)

     */
}
