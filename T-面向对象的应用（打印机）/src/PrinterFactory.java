/**
 * Created by startyaya on 1/31/17.
 */
public class PrinterFactory {
    public static Printer getPrinter(int flag){
        Printer printer = null;
        if(flag == 0){
            printer  = new HPPrinter();
        }else if(flag == 1){
            printer = new CannonPrinter();
        }else if(flag == 2){
            printer = new QHPrinter();
        }
        return printer;
    }
}
