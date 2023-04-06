/**
     Bank Account Management System
        You are required to write a Java program to manage bank accounts. The program should be able to
        perform the following operations:
            a. Create a new account
            b. Deposit money into an account
            c. Withdraw money from an account
            d. Display the account balance
            e. Display the account holder's information
        Each account should have the following information:
            a. Account holder's name (String)
            b. Account number (int)
            c. Account balance (double)
        The program should be able to perform the following operations:
            a. Create a new account: The program should prompt the user to enter the account holder's 
                name, and generate a unique account number for the new account. The initial account balance 
                should be zero.
            b. Deposit money into an account: The program should prompt the user to enter the account 
                number and the amount to be deposited. If the account number is valid, the program 
                should add the amount to the account balance. If the account number is not valid, the
                program should display an error message.
            c. Withdraw money from an account: The program should prompt the user to enter the account
                number and the amount to be withdrawn. If the account number is valid and the account 
                balance is sufficient, the program should deduct the amount from the account balance. 
                If the account number is not valid or the account balance is insufficient, the program 
                should display an error message.
            d. Display the account balance: The program should prompt the user to enter the account 
                number and display the current balance for that account. If the account number is not
                valid, the program should display an error message.
            e. Display the account holder's information: The program should prompt the user to enter
                the account number and display the account holder's name and current balance for that 
                account. If the account number is not valid, the program should display an error message
 */

 import java.util.*;

 class Bank{
    private String name;
    private int accountNumber;
    private double balance;

    void setName(String name){
        this.name=name;
    }
    void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    void setBalance(double balance){
        this.balance=balance;
    }
    String getName(){
        return this.name;
    }
    int getAccountNumber(){
        return this.accountNumber;
    }
    double getBalance(){
        return this.balance;
    }
 }

 //Class for operations

 class BankOperations{
    private static Bank bankDetails =new Bank();
    private static Scanner sc=new Scanner(System.in);

    void createAccount(){
        System.out.print("Enter your name : ");
        sc.nextLine();
        bankDetails.setName(sc.nextLine());
        System.out.print("Your Bank account number is : ");
        int accountNumber=-1;
        do{
            Random randomAccNum=new Random();
            accountNumber=randomAccNum.nextInt();
        }while(accountNumber<0);
        bankDetails.setAccountNumber(accountNumber);
        System.out.println(" "+bankDetails.getAccountNumber());
        System.out.println(" "+bankDetails.getBalance());
    }

    void depositAmount(){
        System.out.println("Enter your account number : ");
        int accountNumber=sc.nextInt();
        if(bankDetails.getAccountNumber()==accountNumber){
            System.out.println("Enter the amount to be deposited : ");
            bankDetails.setBalance(bankDetails.getBalance()+sc.nextDouble());
            System.out.println("Amount deposited successfully. your current balance is  "+bankDetails.getBalance());
        }
        else
            System.out.println("Please enter correct account number..");
    }

    void withdrawAmount(){
        System.out.println("Enter your account number : ");
        int accountNumber=sc.nextInt();
        if(bankDetails.getAccountNumber()==accountNumber){
            System.out.println("Enter the amount to be withdrawn : ");
            double amount=sc.nextDouble();
                if(bankDetails.getBalance()>=amount){
                    bankDetails.setBalance(bankDetails.getBalance()-amount);
                    System.out.println("Amount withdraw successfully. your current balance is  "+bankDetails.getBalance());
                }
            else{
                System.out.println("Operation not possible : your balance is "+bankDetails.getBalance());
            }    
        }
        else
            System.out.println("Please enter correct account number..");
    }

    void checkBalance(){
        System.out.println("Enter your account number : ");
        int accountNumber=sc.nextInt();
        if(bankDetails.getAccountNumber()==accountNumber){
            System.out.println("Your currect balance is :  "+bankDetails.getBalance());
        }
        else
            System.out.println("Please enter correct account number..");
    }

    void showDetails(){
        System.out.println("Enter your account number : ");
        int accountNumber=sc.nextInt();
        if(bankDetails.getAccountNumber()==accountNumber){
            System.out.println("Name :  "+bankDetails.getName()+"   Balance : "+bankDetails.getBalance());
        }
        else
            System.out.println("Please enter correct account number..");
    }

    int menuList(){
        System.out.println("0.Exit");
        System.out.println("1.Create new account");
        System.out.println("2.Deposite amount");
        System.out.println("3.Withdraw amount");
        System.out.println("4.Check balance");
        System.out.println("5.Customer information");
        System.out.println("Enter your choice");
        return sc.nextInt();
    }
 }

class BankAccountManagementSystem{
    public static void main(String args[]){
        BankOperations bankOp=new BankOperations();
        int ch=0;
        while((ch=bankOp.menuList())!= 0){
            switch(ch){
                case 1: bankOp.createAccount();
                    break;
                case 2: bankOp.depositAmount();
                    break;
                case 3: bankOp.withdrawAmount();
                    break;
                case 4: bankOp.checkBalance();
                    break;
                case 5: bankOp.showDetails();
                    break;
                default:
            }
        }





        // bankOp.createAccount();
        // // System.out.println("Enter your account number : ")
        // bankOp.depositAmount();
        // bankOp.withdrawAmount();
        // bankOp.checkBalance();
        // System.out.println(bankOp.toString());
        // // Bank bankDetails =new Bank();
        // // int accountNumber=-1;
        // // do{
        // //     Random randomAccNum=new Random();
        // //     accountNumber=randomAccNum.nextInt();
        // // }while(accountNumber<0);

    }
}