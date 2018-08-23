package com.itheima.test01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*
        21、编写一个Java程序，提示用户输入一串字符串，要求字符串中必须存在字母（需要代码判断）

1.若不符合要求，则提示用户重新输入直至符合要求为止

2.若符合要求，则判断字符串中大写字母出现次数并打印。
         */
        Scanner scanner = new Scanner(System.in);
        String str = "";
        System.out.println("请输入字符串：");
        int count = 0; //大写字母计数
        boolean flag = true; //无限循环的条件
        while (flag) {
            str = scanner.nextLine();
            char[] chars = str.toCharArray();
            int j = 0; //循环计数
            for (int i = 0; i < chars.length; i++) {
                if ((chars[i] >= 'A' && 'Z' >= chars[i]) || (chars[i] >= 'a' && 'z' >= chars[i])) {//判断输入的字符是否是字母
                    if (chars[i] >= 'A' && 'Z' >= chars[i]) {
                        count++;
                    } else {
                        continue;
                    }
                } else {
                    j++;
                    continue;
                }
            }
            if (j == chars.length) {
                flag = true;
                System.out.println("输入错误，请重新输入带字母的字符串：");
            } else {
                flag = false;
                System.out.println("输入的字符串中包含大写字母 " + count);
            }
        }
    }

}
