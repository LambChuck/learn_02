package pers.wang.test;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 给定每一个项目的开始时间和截止时间
 * 同一时间内只能执行一种项目
 * 求怎样安排项目处理数量最多
 * @author wang
 * @create 2019-03-05-15:08
 */


public class ProgramSort {

    public static class Program{
        int begin;
        int end;

        public Program(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }
    }
    public static class ProgramCompartor implements Comparator<Program>{
        @Override
        public int compare(Program o1, Program o2) {
            return o1.end-o2.end;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Program> pq = new PriorityQueue<>(new ProgramCompartor());
        pq.add(new Program(1,2));
        pq.add(new Program(3,4));
        pq.add(new Program(2,4));
        pq.add(new Program(1,4));
        pq.add(new Program(3,5));
        pq.add(new Program(3,8));
        pq.add(new Program(4,6));
        pq.add(new Program(2,3));

        int cur = 0;
        while (!pq.isEmpty()){
            Program program = pq.poll();
            if(program.begin>=cur){
                System.out.println("开始:"+program.begin+",结束:"+program.end);
                cur = program.end;
            }
        }
    }

}
