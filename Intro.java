class Name{
    String name;
    int age;

    Name(String name,int age){
        this.name=name;
        this.age=age;

    }

    public void Details(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class Intro{
    public static void main(String[] args){
        Name n=new Name("Rohit",21);
        n.Details();
    }
}