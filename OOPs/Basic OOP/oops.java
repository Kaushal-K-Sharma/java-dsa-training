class students {
    int roll;
    String name;

    students(){
        this(100,"Thanos");
        //System.out.println("Default Constructor called");
    }

    // students(int r,String b){
    //     System.out.println(r+" " +b);
    //     //System.out.println("Parameterized Constructor called");
    // }

    students(int x, String name){
        this.roll = x;
        this.name = name;
    }

    void display(){
        System.out.println(roll + " " + name);
    }    
}

class oops{
    public static void main(String[] args){
        students s1 = new students(555,"Rajesh");
        //students s2 = new students(888,"Alex");
        //System.out.println(s1.name);
        //System.out.println(s2.name);          // instance of a class
        //System.out.println(s1.roll);
        
        // s1.roll = 999;
        // s1.name = "Raju";
        
        s1.display();
        //System.out.println(s1);


    }
}