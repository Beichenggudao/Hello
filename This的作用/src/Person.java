/**
 * Created by startyaya on 1/30/17.
 */
public class Person {
    String name;
    int age ;
    String address;

    Person(){
        System.out.println("无参数的构造函数");
    }

    Person(String name, int age){
        this();
        this.name = name ;
        this.age  = age;
        System.out.println("两个参数的构造函数");
    }

    Person(String name,int age,String address){
        //this()调用本类当中的其他的构造函数；如果用到this()，它必须是方法的第一个语句；
        this(name,age);
        this.address = address;
        System.out.println("三个函数的构造函数");
    }

    void talk(){
        System.out.println("my name is "+name );
    }
}
