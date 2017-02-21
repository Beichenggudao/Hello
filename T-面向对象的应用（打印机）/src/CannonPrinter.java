/**
 * Created by startyaya on 1/30/17.
 */
class CannonPrinter implements Printer{
    private void clean(){
        System.out.println("clean");
    }

    public void open(){
        System.out.println("CN open");
    };

    public void close(){
        this.clean();
        System.out.println("CN close");
    };

    public void print(String s ){
        System.out.println("CN print--->"+s);
    };

}
