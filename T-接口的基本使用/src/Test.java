/**
 * Created by startyaya on 1/30/17.
 */
public class Test {
    public static void main(String [] args){
        Phone phone = new Phone();
        /*USB usb = phone;
        usb.read();
        usb.write();

        Wifi wifi =phone;
        wifi.open();
        wifi.close();
        */
        C c = phone;
        c.funA();
        c.funB();
        c.funC();


    }
}
