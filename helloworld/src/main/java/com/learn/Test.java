package com.learn;

import java.util.*;

/**
 * Created by chun on 2017/3/15.
 */
public class Test {

    static int num = 0;
    int count = 2;

    public Test() {
        num += 1;
    }

    public int getCount() {
        return count;
    }

    public static void exam(){
        /*List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        for (Iterator iter = list.iterator();iter.hasNext();) {
            int a = (int)iter.next();
            System.out.println(a);
        }
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            int b = (int)iter.next();
            System.out.println(b);
        }*/

        Map<String,Integer> map = new HashMap();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        Iterator it = map.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Iterator it1 = map.entrySet().iterator();
        while (it1.hasNext()){
            Map.Entry entry = (Map.Entry) it1.next();

            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
        //推荐
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"    " + entry.getValue());
        }
    }

    public static void ex2() {
        String s = "aaa";

        assert 1!=2;
        System.out.println("aaa");
    }

    public static void main(String[] args) {
//        exam();
        ex2();
    }
}
