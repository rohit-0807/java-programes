class Cal {
    int a;
    int b;

    Cal(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add(){
        System.out.println("The sum of " + a + " and " + b + " is: " + (a+b));
    }
    void sub(){
        System.out.println("The sub of " + a + " and " + b + " is: " + (a-b));
    }
    void mul(){
        System.out.println("The mul of " + a + " and " + b + " is: " + (a*b));
    }
    void div(){
        System.out.println("The div of " + a + " and " + b + " is: " + (a/b));
    }
    
}
public class Programe8 {
    public static void main(String[] args) {
        Cal c = new Cal(10, 20);
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
