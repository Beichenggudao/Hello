import java.util.Scanner;

/**
 * Created by startyaya on 1/28/17.
 */
class Person {

    public static void main(String [] args){
        System.out.println("是否开始？ y or n?");
        Scanner m = new Scanner(System.in);
        String n =m.next();
        while(n.equals("y")||n.equals("n")) {
            if(n.equals("y")) {
                Scanner s = new Scanner(System.in);
                String i;
                System.out.printf("输入:");
                i = s.next();
                try {
                    int j = Integer.parseInt(i);
                    j += 1;
                    System.out.println("所得结果是:" + j);
                }catch(NumberFormatException e){
                    System.out.println("请输入数字！");
                }
                System.out.println("是否结束?  y ou n?");
                Scanner o = new Scanner(System.in);
                String p = o.next();
                if (p.equals("n")) {
                    continue;
                } else{
                    break;
                }
            }
        }
    }
}













