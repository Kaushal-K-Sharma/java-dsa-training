// compile time polymorphism
// method overloading
class calculator{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    void display(){
        System.out.println("This is a calculator");
    }
}

class advancedcalculator extends calculator{
    // method overriding
    int add(int a, int b){
        return a+b+10; // adds 10 to the sum of a and b
    }
    void display(){
        System.out.println("This is an advanced calculator");
    }
}

class polymor2{
    public static void main(String[] args) {
        calculator c = new calculator();
        advancedcalculator ac = new advancedcalculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2.5,2.5));
        System.out.println(c.add(10,20,30));
        System.out.println(ac.add(2,3)); // calls the overridden method in advancedcalculator class
        ac.display();
        c.display();
    }
}