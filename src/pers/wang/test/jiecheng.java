package pers.wang.test;

/**
 * 求n！
 * @author wang
 * @create 2019-03-05-15:35
 */
public class jiecheng {
    public static int jiecheng(int n){
        if(n == 0){
            return 1;
        }
        return n * jiecheng(n-1);
    }

    public static void main(String[] args) {
        System.out.println(jiecheng(8));
        System.out.println(1*2*3*4*5*6*7*8);
    }
}
