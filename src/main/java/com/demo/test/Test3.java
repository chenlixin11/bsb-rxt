package com.demo.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 项目名称：demo
 * 类 名 称：Test3
 * 类 描 述：
 * 创建时间：2019/11/22 14:01
 * 创 建 人：chenlixin
 */
/*三 字符串碎片的平均长度

一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。
牛牛现在给定一个字符串,请你帮助计算这个字符串的所有碎片的平均长度是多少。

**输入描述:** 输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s只含小写字母('a'-'z')

**输出描述:** 输出一个整数,表示所有碎片的平均长度,四舍五入保留两位小数。

**如样例所示:** s = "aaabbaaac"
所有碎片的平均长度 = (3 + 2 + 3 + 1) / 4 = 2.25

**输入例子1:** aaabbaaac

**输出例子1:** 2.25*/
public class Test3 {

    public static void main(String[] args) {
        System.out.println("请输入一个长度为1到50的字符串：");
        Scanner scanner = new Scanner(System.in);

//        if (str.length() == 0) {
//            System.out.println("请先输入的字符串");
//        } else if (str.length() > 50) {
//            System.out.println("字符串过长");
//        }
        while (scanner.hasNext()) {
            Integer count = 1;
            String str = scanner.next();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length - 1; i++) {
                if (chars[i + 1] != chars[i]) {
                    count++;
                }

            }
            System.out.println(str.length() / count);
        }

    }

}
