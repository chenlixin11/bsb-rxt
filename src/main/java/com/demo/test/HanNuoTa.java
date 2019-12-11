package com.demo.test;

/**
 * 项目名称：demo
 * 类 名 称：HanRuoTa
 * 类 描 述：汉诺塔游戏
 * 创建时间：2019/12/11 11:17
 * 创 建 人：chenlixin
 */
public class HanNuoTa {

    public void move(int n,String a,String b,String c){
        if (n ==1) {

            System.out.println(a+"-->"+c);
            return;
        }

        move(n-1, a, c, b);
        System.out.println(a+"-->"+c);
        move(n-1, b, a, c);
    }

    public static void main(String[] args) {
        new HanNuoTa().move(4,"A","B","C");
    }
}
