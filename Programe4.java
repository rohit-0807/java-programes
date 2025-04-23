class A{
    public void display1(){
        System.out.println("Hello from class A");
    }
}

class B extends A{
    public void display2(){
        System.out.println("Hello from class B");
    }
}   

public class Programe4 {
    public static void main(String[] args) {
            B b =new B();
            b.display1();
            b.display2();
    }
}
