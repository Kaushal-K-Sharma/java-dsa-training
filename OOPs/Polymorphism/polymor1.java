// compile time polymorphism
// method overloading
class calculator{
    int add(int a, int b){
        return a+b+10;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
}

class polymor1{
    public static void main(String[] args) {
        calculator c = new calculator();
        System.out.println(c.add(2,3));
        System.out.println(c.add(2.5,2.5));
        System.out.println(c.add(10,20,30));
    }
}