// parent class is shape with string variable color set to "RED",
// cicrle class extends shape, own color variable to "BLUE"

class shape{
    String color = "RED";
    
}
class circle extends shape{
    //
    String color = "BLUE";
    void display(){
        System.out.println("The circle is " + color);
        System.out.println("The shape is " + super.color);// takes variable of the parent class using super keyword
    }
}

public class inher2 {
    public static void main(String[] args) {
        circle c = new circle();
        //shape s = new shape();
        //System.out.println(s.color);
        c.display();
       //System.out.println(c.color);
    }
}
