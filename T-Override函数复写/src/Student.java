/**
 * Created by startyaya on 1/30/17.
 */
public class Student extends Person{
    String address;

    void introduce(){
        super.introduce();
        System.out.println("我的家是"+address);
    }

}
