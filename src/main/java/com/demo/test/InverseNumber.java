package com.demo.test;

import java.nio.Buffer;
import java.util.Scanner;

/**
 * 项目名称：demo
 * 类 名 称：InverseNumber
 * 类 描 述：
 * 创建时间：2019/11/22 13:21
 * 创 建 人：chenlixin
 */
/*二 求“相反数”问题

为了得到一个数的"相反数",我们将这个数的数字顺序颠倒,然后再加上原先的数得到"相反数"。例如,为了得到1325的"相反数",
首先我们将该数的数字顺序颠倒,我们得到5231,之后再加上原先的数,我们得到5231+1325=6556.如果颠倒之后的数字有前缀零,
前缀零将会被忽略。例如n = 100, 颠倒之后是1.

**输入描述:** 输入包括一个整数n,(1 ≤ n ≤ 10^5)

**输出描述:** 输出一个整数,表示n的相反数

**输入例子1:** 1325

**输出例子1:** 6556*/
public class InverseNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int number1 = Integer.parseInt(str);
//        StringBuffer stringBuffer = new StringBuffer();
//        char[] chars = str.toCharArray();
//        for (int i = chars.length - 1; i >= 0; i--) {
//
//            stringBuffer.append(chars[i]);
//        }
//        String s = stringBuffer.toString();
//        int number2 = Integer.valueOf(s);
        //用到StringBuilder 的字符串反转的方法 reverse（）
        Integer number2 = Integer.valueOf(new StringBuilder(str).reverse().toString());
        System.out.println(number2 + number1);
    }
}
