package RenTi;

import java.util.Random;

/**
 * @author xujinwei
 * @date 2021/4/13 19:47
 */
public class Computer {
    String computerName;  //电脑名
    int score;            //电脑积分
    public int chuQuan(){
        int random = (int)(Math.random()*3)+1;
        switch(random){
            case 1:
                System.out.println(computerName+"出拳：石头");
                break;
            case 2:
                System.out.println(computerName+"出拳：剪刀");
                break;
            case 3:
                System.out.println(computerName+"出拳：布");
                break;
            default:
                System.out.println("输入有错，请重新输入：");
                break;
        }
        return random;

    }
}
