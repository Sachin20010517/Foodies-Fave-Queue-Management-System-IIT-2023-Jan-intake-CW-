package com.foodies_fave_queue_management;

import java.util.Objects;
import java.util.Scanner;

public class foodies {

    public static int Cashier1_customNumber =0;
    public static int Cashier2_customNumber =0;
    public static int Cashier3_customNumber =0;


    public static void main(String[] args) {
        String[] Cashier_1= new String[2];
        String[] Cashier_2= new String[3];
        String[] Cashier_3= new String[5];

        int Burger_Stock= 50;



        System.out.println("\n\n                  ** Welcome to Foodies Burger Shop! **\n\n ");

        String option="0";

        Scanner input=new Scanner(System.in);

        do {

            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("\nPlease select an option :\n");
            System.out.println("   100) Views All Queues");
            System.out.println("   101) Views All Empty Queues");
            System.out.println("   102) Adds Customer to a Queue");
            System.out.println("   103) Remove a Customer From a Queue");
            System.out.println("   104) Remove a Served Customer");
            System.out.println("   105) View Customers Sorted in Alphabetical Order ");
            System.out.println("   106) Store Program Data into file");
            System.out.println("   107) Load Program Data from file");
            System.out.println("   108) View Remaining burgers Stock");
            System.out.println("   109) Add burgers to Stock");
            System.out.println("         999) Exit the Program");
            System.out.println("------------------------------------------------------------------------------------");

            System.out.print("\nPlease Enter Your Option : _ _ _ _ ");
            option=input.nextLine();

            switch (option){

                case "100":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                            VIEWS ALL QUEUES                                      \n");
                    viewsAllCabins(Cashier_1,Cashier_2,Cashier_3);
                    break;

                case "101":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                              Views All Empty Queues                              \n");
                    ViewEmptyCabins(Cashier_1,Cashier_2,Cashier_3);
                    break;

                case "102":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                             ADD CUSTOMER TO A QUEUE                                 \n");
                    addMethod(Cashier_1,Cashier_2,Cashier_3,Burger_Stock);
                    break;


                case "103":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                           REMOVE A CUSTOMER FROM A QUEUE                  \n");
                    RemoveCustomer(Cashier_1,Cashier_2,Cashier_3);
                    break;
                case "104":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                             Remove a Served Customer                                \n");
                    Remove_Served_Customer(Cashier_1,Cashier_2,Cashier_3,Burger_Stock);
                    break;
                case "105":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                             Store program data into file                             \n");
                    Save(Cashier_1,Cashier_2,Cashier_3);
                    break;
                case "106":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                              TO LOAD PREVIOUS PROGRAM                             \n");
                    Lord(Cashier_1,Cashier_2,Cashier_3);
                    break;
                /*case "O":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                   View passengersOrdered alphabetically by name                   \n");
                    SortMethod(Cashier_1,Cashier_2,Cashier_3);
                    break;
                case "T":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("\n             Expenses per passenger & Total Expenses of all passengers           \n");

                    break;
                case "Q":
                    System.out.println("\n                          You exited from the program.                              ");
                    System.out.println("                            Thank You!!                                        ");
                    break;
                    */
                default:
                    System.out.println("Please Enter Valid Character");
            }

        }while (!(option.equals("999")));
    }

    private static void Lord(String[] cashier1, String[] cashier2, String[] cashier3) {
    }

    private static void Remove_Served_Customer(String[] cashier1, String[] cashier2, String[] cashier3, int burgerStock) {
    }

    private static void Save(String[] cashier1, String[] cashier2, String[] cashier3) {
    }






    private static void viewsAllCabins(String[] cashier1, String[] cashier2, String[] cashier3) {
        System.out.format("\n%24s","******************\n");
        System.out.format("%24s","*    Cashiers    *\n");
        System.out.format("%25s","******************\n\n");

        for (String s : cashier1) {
            if (s == null) {
                System.out.format("%5s","");
                System.out.print("O");

            } else {
                System.out.format("%5s","");
                System.out.println("X\n");
            }
        }

        for (String s : cashier2) {
            if (s == null) {
                System.out.format("%10s","");
                System.out.print("O\n");

            } else {
                System.out.format("%10s","");
                System.out.print("X\n");
            }
        }

        for (String s : cashier3) {
            if (s == null) {
                System.out.format("%20s","");
                System.out.println("O");

            } else {
                System.out.format("%20s","");
                System.out.println("X");
            }
        }
    }

    private static void ViewEmptyCabins(String[] cashier1, String[] cashier2, String[] cashier3) {


    }





    private static void addMethod(String[] cashier1, String[] cashier2, String[] cashier3, int burgerStock) {
        Scanner input = new Scanner(System.in);
       /* System.out.print("Enter Customer Name :");
        String Name=input.nextLine();
        System.out.print("Enter Customer Id Number :");
        String ID = input.nextLine();
        while (ID.length()!=10){
            System.out.print("     Id number should include 10 characters. Try Again!!\n");
            System.out.print("Enter Customer Id Number :");
            ID = input.nextLine();
        }*/


        int Cashier_Nb = 0;
        do {
            try {
                System.out.print("Enter Cashier Number : ");
                Cashier_Nb=input.nextInt();
                if (Cashier_Nb==1){


                    if (Cashier1_customNumber <cashier1.length){
                        System.out.println("  **There can be Two Customers in this Queue.** ");
                        if (Cashier1_customNumber>0){
                            System.out.println("There is already "+Cashier1_customNumber+" Customer here.");
                        }

                        Scanner input2 = new Scanner(System.in);
                        System.out.print("Enter Customer Name :");
                        String Name=input2.nextLine();
                        /*
                        System.out.println("Enter Customer Id Number :");
                        String ID = input.nextLine();
                        while (ID.length()!=10){
                            System.out.print("     Id number should include 10 characters. Try Again!!\n");
                            System.out.print("Enter Customer Id Number :");
                            ID = input.nextLine();
                            }
                            */
                        cashier1[Cashier1_customNumber]=Name;
                        System.out.println("     "+Name+" was added Successfully!.");
                        /*
                        System.out.println("How many have burgers been purchased?");
                        int purchased_Burgers=input.nextInt();
                        burgerStock-=purchased_Burgers;

                         */
                            Cashier1_customNumber++;
                    }
                    else {
                        System.out.println("This Cashier Queue has been fulled by Customers. Please select another Cashier Queue.");
                    }
                }
                else if (Cashier_Nb==2){


                    if (Cashier2_customNumber <cashier2.length){

                        System.out.println("  **There can be Three Customers in this Queue.**");
                        if (Cashier2_customNumber>0){
                            System.out.println("There are already "+Cashier2_customNumber+" Customers here.");
                        }

                        Scanner input2 = new Scanner(System.in);
                        System.out.print("Enter Customer Name :");
                        String Name=input2.nextLine();
                        /*
                        System.out.println("Enter Customer Id Number :");
                        String ID = input.nextLine();
                        while (ID.length()!=10){
                            System.out.print("     Id number should include 10 characters. Try Again!!\n");
                            System.out.print("Enter Customer Id Number :");
                            ID = input.nextLine();
                        }
                        */
                        cashier2[Cashier2_customNumber]=Name;
                        System.out.println("     "+Name+" was added Successfully!.");
                        /*
                        System.out.println("How many have burgers been purchased?");
                        int purchased_Burgers=input.nextInt();
                        burgerStock-=purchased_Burgers;

                         */
                        Cashier2_customNumber++;
                    }
                    else {
                        System.out.println("This Cashier Queue has been fulled by Customers. Please select another Cashier Queue.");
                    }
                }

                else if (Cashier_Nb==3){


                    if (Cashier3_customNumber <cashier3.length){

                        System.out.println("There can be Five Customers in this Queue. ");
                        if (Cashier2_customNumber>0){
                            System.out.println("There are already "+Cashier2_customNumber+" Customers here.");
                        }

                        Scanner input2 = new Scanner(System.in);
                        System.out.print("Enter Customer Name :");
                        String Name=input2.nextLine();
                        /*
                        System.out.println("Enter Customer Id Number :");
                        String ID = input.nextLine();
                        while (ID.length()!=10){
                            System.out.print("     Id number should include 10 characters. Try Again!!\n");
                            System.out.print("Enter Customer Id Number :");
                            ID = input.nextLine();
                        }
                        */
                        cashier3[Cashier3_customNumber]=Name;
                        System.out.println("     "+Name+" was added Successfully!.");
                        /*
                        System.out.println("How many have burgers been purchased?");
                        int purchased_Burgers=input.nextInt();
                        burgerStock-=purchased_Burgers;

                         */
                        Cashier3_customNumber++;
                    }
                    else {
                        System.out.println("This Cashier Queue has been fulled by Customers. Please select another Cashier Queue.");
                    }
                }
                else {
                    System.out.println("  Please Enter a valid Cashier Number among 1-3.");
                }

            }catch (Exception e){
                System.out.println("Error!!\n  Please Enter a Valid Integer Number ");
                String junk1 = input.next();
            }

        }while (!(Cashier_Nb>0 && Cashier_Nb<4));


    }



    private static void RemoveCustomer(String[] cashier1, String[] cashier2, String[] cashier3) {

        int Cashier_Nb=0;
        do {
            Scanner input= new Scanner(System.in);
            try {
                System.out.print("First Enter Cashier Number :");
                Cashier_Nb=input.nextInt();

                if (Cashier_Nb==1){
                    Scanner input3= new Scanner(System.in);

                    boolean value_1= true;

                    while (value_1){

                        if (Cashier1_customNumber==0){
                            System.out.println("Try Again!!.  There aren't anyone in this Queue yet.");
                            break;
                        }

                        System.out.print("Enter Customer Name : ");
                        String Name=input3.nextLine();

                        for (int i=0;i<cashier1.length;i++){
                            if (Objects.equals(cashier1[i], Name)){
                                cashier1[i]=null;
                                Cashier1_customNumber--;
                                System.out.println("   "+Name + " is removing from the Queue 1 ");
                                value_1=false;
                                break;
                            }
                            /*else {
                                //value_1=true;
                            }*/

                        }

                        if (value_1){
                            System.out.println("Try Again!!. Please Check Customer's Name.");
                            //value_1=true;
                        }

                    }


                }
                else if (Cashier_Nb==2){

                    Scanner input3= new Scanner(System.in);

                    boolean value_2= true;

                    while (value_2){

                        if (Cashier2_customNumber==0){
                            System.out.println("Try Again!!.  There aren't anyone in this Queue yet.");
                            break;
                        }

                        System.out.print("Enter Customer Name : ");
                        String Name=input3.nextLine();

                        for (int i=0;i<cashier2.length;i++){
                            if (Objects.equals(cashier2[i], Name)){
                                cashier2[i]=null;
                                Cashier2_customNumber--;
                                System.out.println("   "+Name + " is removing from the Queue 1 ");
                                value_2=false;
                                break;
                            }

                        }

                        if (value_2){
                            System.out.println("Try Again!!. Please Check Customer's Name.");
                            //value_1=true;
                        }

                    }

                }

                else if (Cashier_Nb==3){
                    Scanner input3= new Scanner(System.in);

                    boolean value_3= true;

                    while (value_3){

                        if (Cashier3_customNumber==0){
                            System.out.println("Try Again!!.  There aren't anyone in this Queue yet.");
                            break;
                        }

                        System.out.print("Enter Customer Name : ");
                        String Name=input3.nextLine();

                        for (int i=0;i<cashier3.length;i++){
                            if (Objects.equals(cashier3[i], Name)){
                                cashier3[i]=null;
                                Cashier3_customNumber--;
                                System.out.println("   "+Name + " is removing from the Queue 1 ");
                                value_3=false;
                                break;
                            }
                        }

                        if (value_3){
                            System.out.println("Try Again!!. Please Check Customer's Name.");
                        }

                    }

                }
                else {
                    System.out.println("  Please Enter a valid Cashier Number among 1-3.");
                }

            }catch (Exception e){
                System.out.println("Error!!           Please Enter a Valid Integer Cashier Number ");
                String junk2 = input.next();
            }


        }while(!(Cashier_Nb>0 && Cashier_Nb<4));


    }


}
