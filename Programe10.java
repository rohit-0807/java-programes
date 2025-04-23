class Greetings{
    String name;

    Greetings(String name){
        this.name=name;
    }
    
    public void display(){
        System.out.println("Hello, Nice to Meet You "+name+"!");
    }
}
public class Programe10 {
    public static void main(String[] args) {
        Greetings g=new Greetings("Rohit");
        g.display();
    }
}
