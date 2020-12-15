import com.Intertest;

interface Animal {
    public void eat();
    public void travel();
}
public class TEST2 implements Animal, Intertest {

    public void eat(){
        System.out.println("Mammal eats");
    }
    public void speak(){
        System.out.println("speak");
    };

    public void travel(){
        System.out.println("Mammal travels");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String args[]){
        TEST2 m = new TEST2();
        m.eat();
        m.travel();
        m.speak();
    }
}
