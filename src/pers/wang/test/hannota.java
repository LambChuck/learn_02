package pers.wang.test;

import java.util.Arrays;

/**
 * 1.汉诺塔问题
 * 2.打印一个字符串的所有子序列
 * 3.打印一个字符串的全排列
 * @author wang
 * @create 2019-03-05-15:49
 */
public class hannota {

    public static void process(int N, String from, String to, String help){
        //当汉诺塔规模为1时,直接将1移动到目标塔上
        if (N ==1){
            System.out.println("Move 1 from " + from + " to " + to);

        }else{
            //将1到n-1移动到辅助塔
            process(N-1,from,help,to);
            //将n移动到目标塔
            System.out.println("Move " + N + " from " + from + " to " + to);
            //将1到n-1移动到目标塔
            process(N - 1,help,to,from);
        }
    }

    public static void printAllSub(char[] string, int i, String res) {
        if (i == string.length) {
            System.out.println(res);
            return;
        }
        //选择打印当前字符
        printAllSub(string, i + 1, res);
        //不选择打印当前字符
        printAllSub(string, i + 1, res + String.valueOf(string[i]));

    }

    public static void printAllSort(char[] str,int i,String res){
        char[] temp = Arrays.copyOf(str,str.length);

        if(i==str.length){
            System.out.println(res);
            return;
        }

        for (int j = i; j < str.length; j++) {
            swap(temp,i,j);
            printAllSort(temp,i+1,res+String.valueOf(temp[i]));

        }
    }

    public static void swap(char[] str,int a,int b){
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }

    public static void isHe (int[] arr,int i, int now, int q,String str){
        if(now == q){
            System.out.println(str);
            return;
        }
        if(i==arr.length||now>q){
            return;
        }
        isHe(arr,i+1,now+arr[i],q,str+"+"+String.valueOf(arr[i]));
        isHe(arr,i+1,now,q,str);


    }



    public static void main(String[] args) {
        process(3,"左","右","中");
        System.out.println(" ");
        printAllSub("abc".toCharArray(),0,"");
        System.out.println(" ");
        printAllSort("edz".toCharArray(),0,"");
        System.out.println("");
        int[] arr ={1,2,3,4,5,6,7};

        isHe(arr,0,0,18,"");
    }
}
