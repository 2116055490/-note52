package RenTi;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/4/13 20:39
 */
public class Game {
    Scanner sc = new Scanner(System.in);
    User User;//用户玩家
    Computer Computer; //电脑玩家
    int count; //对战次数
    int score; //分数

    //游戏类的初始化方法
    public void initial(){
        //创建用户对象
        User = new User();
        //创建电脑对象
        Computer = new Computer();
        //初始化对战次数为0
        count = 0;
    }
    //开始游戏的方法
    public void startGame(){
        System.out.println("""
                -------------------欢迎进入游戏世界--------------------
                                 ******************
                                 **** 猜拳，开始 ****
                                 ******************
                               出拳规则：1.石头 2.剪刀 3.布
                            请选择对方角色(1：刘备 2：孙权 3：曹操)             
        """);
        int choose = sc.nextInt();//接收用户选择的角色
        switch(choose){
            case 1:
                Computer.computerName = "刘备"; //把值赋给电脑类的name
                System.out.println("你选择了"+Computer.computerName+"对战");
                break;
            case 2:
                Computer.computerName = "孙权";
                System.out.println("你选择了"+Computer.computerName+"对战");
                break;
            case 3:
                Computer.computerName = "曹操";
                System.out.println("你选择了"+Computer.computerName+"对战");
                break;
            default:
                System.out.println("输入有误！");
                break;
        }
        System.out.println("请输入你的姓名：");
        User.userName = sc.next();
        System.out.println("要开始吗（y/n）");
        String con = sc.next();
        if (con.equals("n")){
            System.out.println("系统退出！");
        }
        int perFist;//用户出的拳
        int comFist;//计算机出的拳
        while(con.equals("y")){
            //出拳
            perFist = User.showFirst();//调用用户类的方法
            comFist = Computer.chuQuan();//调用电脑类的方法
            //裁决
            if ((perFist == 1&&comFist == 1)||(perFist == 2&&comFist == 2)||(perFist == 3
            &&comFist == 3)){
                System.out.println("结果：和局！");//平局
            }else if((perFist == 1&&comFist == 3)||(perFist == 2&&comFist == 1)||(perFist
            ==3&&comFist == 2)){
                System.out.println("You lost!");//用户输了
                System.out.println("结果：你被ko了");
                Computer.score++;//记录电脑赢得分数
            }else{
                System.out.println("You win!");//用户赢了
                System.out.println("结果：恭喜你赢了！");
                User.score++;//记录用户赢得分数
            }
            count++;//对战次数依次加一
            System.out.println("是否进入下一轮（y/n）");
            con = sc.next();
        }
        //如果结束 则显示最后的结果
        showResult();

    }
    //显示最后的输出结果
    public void showResult(){
        System.out.println("--------------------------");
        System.out.println(Computer.computerName+"\tVS\t"+User.userName);
        System.out.println("对战次数："+count);
        System.out.println("姓名"+"\t"+"积分");
        System.out.println(User.userName+"\t"+User.score);
        System.out.println(Computer.computerName+"\t"+Computer.score);
        if (User.score>Computer.score){
            //如果用户的分数大于电脑的分数 则用户赢
            System.out.println(User.userName+"赢了！");
        }else{
            System.out.println(Computer.computerName+"赢了！");
        }
        System.out.println("--------------------------");
    }

}
