/**
 * Created by startyaya on 1/30/17.
 */
public class Test {
    public static void main (String [] args){
        Student s = new Student();
        s.name = "张三";
        s.age = 20;
        s.address = "北京";
        s.introduce();

        Person p = new Person();
        p.name = "李四";
        p.age =30;
        p.introduce();
    }
}
