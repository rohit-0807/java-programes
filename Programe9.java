
class OddEven{
    int num;
    OddEven(int num){
        this.num=num;
    }
    void checkOddEven(){
        if(num%2==0){
            System.out.println(num+" is even number");
        }else{
            System.out.println(num+" is odd number");
        }
    }
}
public class Programe9 {
    public static void main(String[] args) {
        OddEven obj=new OddEven(10);
        obj.checkOddEven();
        OddEven obj1=new OddEven(11);
        obj1.checkOddEven();
    }
}
