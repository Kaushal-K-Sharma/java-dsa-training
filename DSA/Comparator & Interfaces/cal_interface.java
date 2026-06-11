import java.util.*;
//@FunctionalInterface    
interface Calculator{
    int operate(int a, int b);
    }

class cal_interface{
        public static void main(String[] args){            
            
            Calculator add = (a,b) -> (a+b);
            Calculator mul = (a,b) -> {return (a*b); }; // can also write like this
            Calculator sub = (a,b) -> (a-b);            
            Calculator div = (a,b) -> (a/b);

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();           
            

            System.out.println("Addition is " + add.operate(a,b));
            System.out.println("Multiplication is " + mul.operate(a,b));
            System.out.println("Subtraction is " + sub.operate(a,b));
            
            try{
            System.out.println("Division is " + div.operate(a,b));
            }
            
            catch (ArithmeticException e){
                System.out.println("Caught by an error" + e.getMessage());

            }

            sc.close();

            
        }
    }

