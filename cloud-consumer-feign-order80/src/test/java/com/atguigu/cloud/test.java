package com.atguigu.cloud;

import org.junit.jupiter.api.Test;

/**
 * @author weihanqiang
 * @date 2024/3/14
 */
public class test {

    @Test
     void test1() {
         int num = 1;
         System.out.println("changeNum()方法调用之前：num = " + num);
         changeNum(num);
         System.out.println("changeNum()方法调用之后：num = " + num);
     }

    public static void changeNum(int x) {
        x = 2;
    }

    @Test
    void test2() {
        Person person =  new Person();
        System.out.println("changePerson()方法调用之前：person= " + person);
        changePerson(person);
        System.out.println("changePerson()方法调用之后：person= " + person);
    }

    public static void changePerson(Person p) {
        printAfterAt(p.toString());
        p = new Person();
        printAfterAt(p.toString());

    }

    public static void printAfterAt(String input) {
        if (input == null || !input.contains("@")) {
            System.out.println("输入的字符串无效或不包含'@'字符");
            return;
        }

        int atIndex = input.indexOf("@");
        String result = input.substring(atIndex + 1);
        System.out.println(result);
    }


}

class Person{

}