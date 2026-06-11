class animal {
    // single inheritence
    void eats() {
        System.out.println(" the animal eats");
    }
}
// single level inheritence
class dog extends animal{ // extends keyword is used to inherit the properties of animal class
    void bark() {
        System.out.println(" the dog barks");
    }
}


// multilevel inheritence
class puppy extends dog{
    void weep(){
        System.out.println(" the puppy weeps");
    }
}

// hirarchical inheritence
class cat extends animal{
    void meow(){
        System.out.println(" the cat meows");
    }
}

class inher1 {
    public static void main (String[] args){
        //dog d = new dog();
        //puppy p = new puppy();
        //animal a = new animal();
        //d.eats();
        //d.bark();
        //p.eats();
        //p.bark();
        //p.weep();
        cat c = new cat();
        //a.eats();
        c.eats();
        c.meow();
    }
}
