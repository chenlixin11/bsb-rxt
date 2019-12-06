package com.demo.test;

/**
 * 项目名称：demo
 * 类 名 称：HelloB
 * 类 描 述：
 * 创建时间：2019/11/25 12:34
 * 创 建 人：chenlixin
 */
public class HelloB extends HelloA {

    public HelloB(){
        System.out.println("HelloB");
    }
    {
        System.out.println("i'm B");
    }
    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}
