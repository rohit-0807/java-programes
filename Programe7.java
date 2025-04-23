class DefaultClass{
    String name;

    DefaultClass(){
        name= "N/A";
    }
    DefaultClass(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Name: "+name);
    }
}
public class Programe7 {
    public static void main(String[] args) {
        DefaultClass obj1 = new DefaultClass();
        DefaultClass obj2 = new DefaultClass("Rohit");

        obj1.display(); 
        obj2.display(); 
    }
}
