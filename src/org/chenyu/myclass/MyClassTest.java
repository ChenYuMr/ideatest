package org.chenyu.myclass;

import org.junit.Test;

import java.util.*;

/**
 * 获得反射的测试类
 */
public class MyClassTest {
    private String name = "陈羽";

    public int age = 22;

    public void work(){
        List list=new ArrayList<String>();
        Set set=new HashSet();
        Map map=new HashMap();
        int arr[]=new int[10];
        System.out.println("我在工作是共有方法");
    }

    private void say(){
        System.out.println("我在说话是私有方法");
    }

    @Test
    public void test0(){
        //获得反射的第一种方法
        Class c1 = MyClassTest.class;
        //获得反射的第二种方法
        Class c2 = null;
        try {
            c2 = Class.forName("org.chenyu.myclass.MyClassTest");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //输出类名

    }
}
