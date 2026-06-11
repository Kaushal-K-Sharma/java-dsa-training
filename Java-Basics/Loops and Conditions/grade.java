import java.util.*;
class grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        if(n>=90 && n<=100){
            System.out.println("A");
        }
        else if(n<=89 && n>=80){
            System.out.println("B");
        }
        else if(n<=79 && n>=70){
            System.out.println("C");
        }
        else if(n<=69 && n>=60){
            System.out.println("D");
        }
        else{
            System.out.println("Fail");

        }
        sc.close();
    }
}        
    

