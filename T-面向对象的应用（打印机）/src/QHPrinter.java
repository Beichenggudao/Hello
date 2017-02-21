/**
 * Created by startyaya on 1/30/17.
 */
public class QHPrinter implements Printer {
    private void denglu(){
        System.out.println("登录");
    }

    public void open(){

        System.out.println("QH open");
        this.denglu();
    };

    public void close(){
        System.out.println("QH close");
    };

    public void print(String s ){
        System.out.println("QH print--->"+s);
    };

}
