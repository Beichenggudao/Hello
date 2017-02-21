/**
 * Created by startyaya on 1/30/17.
 */
class Phone implements USB,Wifi,C{
    public void read(){
        System.out.println("USB read");
    }

    public void write(){
        System.out.println("USB write");
    }

    public void open(){
        System.out.println("Wifi open");
    }

    public void close(){
        System.out.println("Wifi close");
    }

    public void funA(){
        System.out.println("A的方法");
    }

    public void funB(){
        System.out.println("B的方法");
    }

    public void funC(){
        System.out.println("C的方法");
    }
}
