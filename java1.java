package com.company.kadai;

import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {
        System.out.println("「相性しんだん」");
        String qsta;
        qsta = "私はお好みやきが好きだ";
        System.out.println(qsta);
        
        String[] ans = new String[4];
        ans[0] = "1.あてはまる";
        ans[1] = "2.まあまああてはまる";
        ans[2] ="3.あまりあてはまらない";
        ans[3] ="4.あてはまらない";

        System.out.print(ans[0]);
        System.out.print(ans[1]);
        System.out.print(ans[2]);
        System.out.println(ans[3]);

        Scanner scanner = new Scanner(System.in);
        String[] inputs = new String[1];
        for (int i = 0; i < 1; i++) {
            inputs[i] = scanner.next();
        }
            String qstb;
            qstb = "休日にテニスをよくする";
            System.out.println(qstb);

            System.out.print(ans[0]);
            System.out.print(ans[1]);
            System.out.print(ans[2]);
            System.out.println(ans[3]);


            for (int i = 0; i < 1; i++) {
                inputs[i] = scanner.next();
            }
                String qstc;
                qstc = "プログラミングが好きだ";
                System.out.println(qstc);

                System.out.print(ans[0]);
                System.out.print(ans[1]);
                System.out.print(ans[2]);
                System.out.println(ans[3]);

                for (int i = 0; i < 1; i++) {
                    inputs[i] = scanner.next();
                }
                    String qstd;
                    qstd = "睡眠時間は大切にしている";
                    System.out.println(qstd);

                    System.out.print(ans[0]);
                    System.out.print(ans[1]);
                    System.out.print(ans[2]);
                    System.out.println(ans[3]);

                    for (int i = 0; i < 1; i++) {
                        inputs[i] = scanner.next();
                    }
                        String qste;
                        qste = "YOUTUBEをよく見る";
                        System.out.println(qste);


                        System.out.print(ans[0]);
                        System.out.print(ans[1]);
                        System.out.print(ans[2]);
                        System.out.println(ans[3]);

                        for (int i = 0; i < 1; i++) {
                            inputs[i] = scanner.next();
                        }
                        //25点  "あなたとの相性は完璧です";
                        //15点 "やや似ている部分がありますね、ご飯でもいきましょう！";
                        // 5点"少し食い違う部分があるようです。飲みにでもいきましょう！";
                        //  0点 "あなたとの相性は最低です。";
                        String[] ans2 = new String[4];
                        ans2[0] = "あなたとの相性は完璧です";
                        ans2[1] = "やや似ている部分がありますね、ご飯でもいきましょう！";
                        ans2[2] ="少し食い違う部分があるようです。飲みにでもいきましょう！";
                        ans2[3] ="あなたとの相性は最低です。";


                    }
                }



