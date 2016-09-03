package com.xue.test;

/**
 * Created by Administrator on 2016/9/3.
 * 流程控制语句
 */
public class LiuCheng {
    public static void main(String [] args){
        /*int score = 80 ;
        if(score>80){
            System.out.println("良好");
        }else{
            System.out.println("继续努力");
        }

        if(score == 80){
            System.out.println("刚刚良好");
        }else{
            System.out.print("不一定好不好");
        }
        //多重判断
        if(score>=90){
            System.out.println("优秀");
        }else if(score>=80){
            System.out.println("良好");
        } else if (score>60) {
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        //嵌套
        String sex = "男";

        if (score ==  80){
            if (sex == "男"){
                System.out.println("应该的");
                if(true == true){
                    System.out.println("真的");
                }
            }else {
                System.out.println("不错");
            }
        }else{
            System.out.println("反正不是80");
        }*/

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
