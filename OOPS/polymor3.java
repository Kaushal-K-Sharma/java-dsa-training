//1, create a class printer
// overload a method called printDocument.
//one version takes an integer(no of copies).
// the other takes a string(secret message).

//2.  create a parant class Appliance with a turnOn method.
// create a child class Toaster that overrides turnOn()  to say " heating up Breaad".
// test both in your main method.

// 2
// method overriding.
class Appliance{
    //int a = 10;
    void turnOn(){
        System.out.println("The appliance is turned on");
    }
}
class Toaster extends Appliance{
    //int b= a+20;
    void turnOn(){
        System.out.println("Heating up Bread ");
    }
}



// 1
class printer{
    void printDocument(int copies){
        System.out.println("Printing " + copies + " copies of the document");
    }
    //overload  method
    // the output will be different based on the type of argument passed to the method
    void printDocument(String secretMessage){
        System.out.println("Secret message: " + secretMessage);
    }
}

// main class
class polymor3{
    public static void main(String[] args) {
        printer p = new printer();
        p.printDocument(5); 
        p.printDocument("The printer is stolen \n");

        Appliance a = new Appliance();
        Toaster t = new Toaster();
        a.turnOn();
        t.turnOn();
    }
}

