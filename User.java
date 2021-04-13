package RenTi;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/4/13 19:34
 */
public class User {
    String userName;  //用户名
    int score;        //积分
    public int showFirst(){
        System.out.println("请出拳：1.石头 2.剪刀 3.布（输入相应的数字）");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("你出拳：石头");
                break;
            case 2:
                System.out.println("你出拳：剪刀");
                break;
            case 3:
                System.out.println("你出拳：布");
                break;
            default:
                System.out.println("输入的有误！");
                break;
        }
        return choice;
    }
}
