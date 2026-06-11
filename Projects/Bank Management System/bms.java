import java.util.*;
import java.io.*;
public class bms{
       static Scanner sc = new Scanner(System.in);  // other method can now access scanner functions outside main method  by making it static.
       static final String File_Name = "acc.txt";
    public static void main(String[] args0){
        //System.out.println("Bank Management System is now Working");
        
        

        while(true){
            System.out.println("==== Bank Management System ====");
            System.out.println("1 Create Account");
            System.out.println("2 View Account");
            System.out.println("3 View all Account");
            System.out.println("4 Deposit");
            System.out.println("5 Withdraw");
            System.out.println("6 Exit");

            System.out.println("");
            System.out.println("Enter yout choice: ");
            
            int choice = sc.nextInt();
            
        
        switch(choice) {
            case 1: sc.nextLine();
                    createAccount();
                    break;
            case 2: sc.nextLine();
                    viewAcc();
                    break;
            case 3: viewAllAcc();
                    break;
            case 4: sc.nextLine();
                    deposit();
                    break;
            case 5: sc.nextLine();
                    withdraw();
                    break;                   
            case 6: System.out.println("Thank You");
                    System.exit(0);
                    break;
            
        }
    }  

        
    }



     public static int  genAccNum() {  // from 1001 accNo are generated
        int count = 0;
        try{
                BufferedReader br = new BufferedReader(new FileReader(File_Name));
                
                while(br.readLine() != null){
                        count++;
                }
                br.close();
        }
        catch(Exception e){}
        return 1001+count;

    }




    public static void createAccount(){
        try{
                int accNo = genAccNum();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Initial Balance: ");
                double balance = sc.nextDouble();
                sc.nextLine();

                System.out.print("Enter Account Type (Savings or Current): ");
                String type = sc.nextLine();

                BufferedWriter bw = new BufferedWriter(new FileWriter(File_Name, true));

                bw.write(accNo + "," + name + "," + balance + "," + type );
                bw.newLine();
                bw.close();

                System.out.println("\nAccount Created Successfully");
                System.out.println("Account Number: " + accNo + "\n");

        }
        catch(Exception e){
                System.out.println("Error Creating Account.");
        }
    }




    public static void viewAllAcc(){
        try{
                BufferedReader br = new BufferedReader(new FileReader(File_Name));
                String line;

                while((line = br.readLine()) != null){
                        String[] data = line.split(",");
                        System.out.println("\n--------------------------");
                        System.out.println("Account No.: " + data[0]);
                        System.out.println("Name: " + data[1]);
                        System.out.println("Balance: " + data[2]);
                        System.out.println("Type: " + data[3] + "\n");
                }
                br.close();
        }
        catch(Exception e){
                System.out.println("No Records Found.");
        }
    }




    public static void viewAcc(){
        try{
                System.out.println("Enter Account Number: ");
                String searchAcc = sc.nextLine();

                BufferedReader br = new BufferedReader(new FileReader(File_Name));

                String line;
                boolean found = false;

                while((line = br.readLine()) != null) {
                        String[] data = line.split(",");
                        
                        if(data[0].equals(searchAcc)){
                                System.out.println("\nAccount Found.");
                                System.out.println("Account No.: " + data[0]);
                                System.out.println("Name: " + data[1]);
                                System.out.println("Balance: " + data[2]);
                                System.out.println("Type: " + data[3] + "\n");

                                found = true;
                                break;
                        }
                }

                br.close();

                if(!found){
                        System.out.println("Account Not Found.");

                }


        }
        catch(Exception e){
                System.out.println("Error Searching Account");
        }
    }




    public static void deposit(){
        try{
                System.out.println("Enter Account Number : ");
                String accNo = sc.nextLine();

                System.out.println("Enter Deposit Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                BufferedReader br = new BufferedReader(new FileReader(File_Name));

                BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));

                String line;
                boolean found = false;

                while((line = br.readLine()) != null){
                        String[] data = line.split(",");

                        if (data[0].equals(accNo)){
                                System.out.println("MATCH FOUND");
                                double balance = Double.parseDouble(data[2]);
                                
                                balance += amount;

                                bw.write(data[0] + "," + data[1] + "," + balance + "," + data[3]);
                                found = true;
                        }
                        else{
                                bw.write(line);
                        }
                        bw.newLine();

                }
                br.close();
                bw.close();

                File originalFile = new File(File_Name);
                File tempFile = new File("temp.txt");

                originalFile.delete();
                tempFile.renameTo(originalFile);

                if(found){
                        System.out.println("Money Deposisted Successfully");

                }else{System.out.println("Account Not Found");}



        }
        catch(Exception e){
                System.out.println("Error During Deposit");

        }
    }




    public static void withdraw(){
        try{
                System.out.println("Enter Account Number : ");
                String accNo = sc.nextLine();

                System.out.println("Enter Withdraw Amount: ");
                double amount = sc.nextDouble();
                sc.nextLine();

                BufferedReader br = new BufferedReader(new FileReader(File_Name));

                BufferedWriter bw = new BufferedWriter(new FileWriter("temp.txt"));

                String line;
                boolean found = false;

                while((line = br.readLine()) != null){
                        String[] data = line.split(",");

                        if (data[0].equals(accNo)){
                                System.out.println("MATCH FOUND");
                                double balance = Double.parseDouble(data[2]);
                                
                                balance -= amount;

                                bw.write(data[0] + "," + data[1] + "," + balance + "," + data[3]);
                                found = true;
                        }
                        else{
                                bw.write(line);
                        }
                        bw.newLine();

                }
                br.close();
                bw.close();

                File originalFile = new File(File_Name);
                File tempFile = new File("temp.txt");

                originalFile.delete();
                tempFile.renameTo(originalFile);

                if(found){
                        System.out.println("Money Withdrawn Successfully");

                }else{System.out.println("Account Not Found");}



        }
        catch(Exception e){
                System.out.println("Error During Withdraw");

        }
    }




    



}