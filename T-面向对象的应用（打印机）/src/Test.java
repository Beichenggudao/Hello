/**
 * Created by startyaya on 1/30/17.
 */
public class Test extends PrinterFactory{
    public static void main(String [] args){
        //声明接口类型的引用
        //根据用户的选择，生成相应的打印机对象，并且向上转型为printer类型
        //Printer getPrinter(int flag)
        int flag =0;
        Printer printer = PrinterFactory.getPrinter(flag);
        printer.open();
        printer.print("adsadfs");
        printer.close();
    }
}
