class Contact {
    String name;
    String phoneNumber;

    Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }   

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
    }

   
}

public class Programe6 {
    public static void main(String[] args){
        Contact contact1 = new Contact("Rohit", "748315293");
        Contact contact2 = new Contact("Bharat", "987-654-3210");

        contact1.display();
        
        contact2.display();
    }
}
