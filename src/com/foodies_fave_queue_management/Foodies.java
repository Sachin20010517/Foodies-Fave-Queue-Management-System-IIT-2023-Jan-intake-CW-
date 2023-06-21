package com.foodies_fave_queue_management;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

public class Foodies {

    public static int Cashier1_customNumber =0;
    public static int Cashier2_customNumber =0;
    public static int Cashier3_customNumber =0;

    public static int Burger_Stock= 50;

    public static ArrayList<String> burgerArraylist= new ArrayList<>();


    public static void main(String[] args) {
        String[] Cashier_1= new String[2];
        String[] Cashier_2= new String[3];
        String[] Cashier_3= new String[5];



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
            System.out.println("   110) The Income of each queues");
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
                    addMethod(Cashier_1,Cashier_2,Cashier_3);
                    break;


                case "103":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                           REMOVE A CUSTOMER FROM A QUEUE                  \n");
                    RemoveCustomer(Cashier_1,Cashier_2,Cashier_3);
                    break;
                case "104":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                             Remove a Served Customer                                \n");
                    Remove_Served_Customer(Cashier_1,Cashier_2,Cashier_3);
                    break;
                case "105":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                    View Customers Sorted in alphabetical order                     \n");
                    SortMethod(Cashier_1,Cashier_2,Cashier_3);

                    break;
                case "106":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                             Store program data into file                             \n");
                    Save(Cashier_1,Cashier_2,Cashier_3);
                    break;
                case "107":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("                              TO LOAD PREVIOUS PROGRAM                             \n");
                    Lord(Cashier_1,Cashier_2,Cashier_3);
                    break;

                case "108":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("\n                      View Remaining burgers Stock                               \n");
                    Remaining_Burgers();
                    break;
                case "109":
                    System.out.println("\n-----------------------------------------------------------------------------------");
                    System.out.println("\n                       Add burgers to Stock                                      \n");
                    Add_Burgers();
                    break;
                case "999":
                    System.out.println("\n                          You Exited from the Program.                              ");
                    System.out.println("                            Thank You!!                                        ");
                    break;

                default:
                    System.out.println("Please Enter Valid Character");
            }

        }while (!(option.equals("999")));
    }

    private static void SortMethod(String[] cashier1, String[] cashier2, String[] cashier3) {

        int r1=cashier1.length;
        boolean swapped;

        for (int i=0;i<r1-1;i++){
            swapped=false;
            for (int j=0;j<r1-i-1;j++){
                if (compareString(cashier1[j],cashier1[j+1])>0){
                    String temp=cashier1[j];
                    cashier1[j]=cashier1[j+1];
                    cashier1[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }

        int r2=cashier2.length;
        for (int i=0;i<r2-1;i++){
            swapped=false;
            for (int j=0;j<r2-i-1;j++){
                if (compareString(cashier2[j],cashier2[j+1])>0){
                    String temp=cashier2[j];
                    cashier2[j]=cashier2[j+1];
                    cashier2[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }

        int r3=cashier3.length;
        for (int i=0;i<r3-1;i++){
            swapped=false;
            for (int j=0;j<r3-i-1;j++){
                if (compareString(cashier3[j],cashier3[j+1])>0){
                    String temp=cashier3[j];
                    cashier3[j]=cashier3[j+1];
                    cashier3[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }



        /*
        System.out.print("Cashier 1 Queue : ");
        for (String i:cashier1){
            System.out.print(i+", ");
        }
        System.out.println();

         */
        System.out.print("Cashier 1 Queue : ");
        for (int i=0;i<cashier1.length;i++){
            if (cashier1[i]!=null){
                System.out.print(cashier1[1]+", ");
            }
            else {
                System.out.print("free, ");
            }
        }
        System.out.println();


        /*
        System.out.print("\nCashier 2 Queue : ");
        for (String i:cashier2){
            System.out.print(i+", ");
        }
        System.out.println();

         */

        System.out.print("Cashier 2 Queue : ");
        for (int i=0;i<cashier2.length;i++){
            if (cashier2[i]!=null){
                System.out.print(cashier2[1]+", ");
            }
            else {
                System.out.print("free, ");
            }
        }
        System.out.println();


        System.out.print("\nCashier 3 Queue : ");
        for (String i:cashier3){
            System.out.print(i+", ");
        }
        System.out.println();


















        /*
        Arrays.sort(cashier1);
        System.out.print("Cashier 1 : ");
        for (String i:cashier1){
            System.out.print(i+",  ");
        }
        System.out.println("\n");

        Arrays.sort(cashier2);
        System.out.print("Cashier 2 : ");
        for (String i:cashier2){
            System.out.print(i+",  ");
        }
        System.out.println("\n");

        Arrays.sort(cashier3);
        System.out.print("Cashier 3 : ");
        for (String i:cashier3){
            System.out.print(i+",  ");
        }

         */
    }

    public static int compareString(String str_1,String str_2){
        if (str_1==null && str_2==null){
            return 0;
        } else if (str_1==null) {
            return 1;

        }else if (str_2==null) {
            return -1;
        }else {
            return str_1.compareTo(str_2);
        }
    }

    


    private static void Add_Burgers() {
        System.out.println("\n                       ** Foodies Burger Stock **                                          \n\n");
        System.out.print("How many burgers are you gonna add ? : ________");
        Scanner input5 = new Scanner(System.in);
        int adding_Burgers=input5.nextInt();
        Burger_Stock+=adding_Burgers;
        System.out.println("\n\n          It has been updated Successfully ! ");
        System.out.println("Now,\n    Total Burgers = "+Burger_Stock);
    }

    private static void Remaining_Burgers() {
        System.out.println("\n| ******************************************************************************************|");
        System.out.println("|                       ** Foodies Burger Stock **                                          |");
        System.out.println("|                                                                                           |");
        System.out.println("|      Current Remaining Burgers = "+Burger_Stock+"                                                       | ");
        System.out.println("|                                                                                           |");
        System.out.println("|                                                                                           |");
        System.out.println("| ******************************************************************************************|\n");



        if (Burger_Stock<=10){
            System.out.println("\n              Warning!!\nThe Burger Stock is close to Finish.");
        }
    }



    private static void viewsAllCabins(String[] cashier1, String[] cashier2, String[] cashier3) {

        String[][] twoDimensionalArray = new String[3][];

        twoDimensionalArray[0]=cashier1;
        twoDimensionalArray[1]=cashier2;
        twoDimensionalArray[2]=cashier3;


        System.out.format("\n%22s","******************\n");
        System.out.format("%22s","*    Cashiers    *\n");
        System.out.format("%23s","******************\n\n");



        int maxLength = Math.max(cashier1.length, Math.max(cashier2.length, cashier3.length));

        for (int i = 0; i < maxLength; i++) {
            if (i < twoDimensionalArray[0].length) {
                if (twoDimensionalArray[0][i]!=null){
                    System.out.format("%3s","");
                    System.out.print("X" + "\t");
                }
                else {
                    System.out.format("%3s","");
                    System.out.print("O" + "\t");
                }
            } else {
                System.out.format("%3s","");
                System.out.print("\t\t");
            }

            if (i < twoDimensionalArray[1].length) {
                if (twoDimensionalArray[1][i]!=null){
                    System.out.format("%3s","");
                    System.out.print("X" + "\t");
                }
                else {
                    System.out.format("%3s","");
                    System.out.print("O" + "\t");
                }

            } else {
                System.out.format("%3s","");
                System.out.print("\t\t");
            }

            if (i < twoDimensionalArray[2].length) {
                if (twoDimensionalArray[2][i]!=null){
                    System.out.format("%3s","");
                    System.out.print("X" + "\t");
                }
                else {
                    System.out.format("%3s","");
                    System.out.print("O" + "\t");
                }
            }

            System.out.println();
        }





        /*
        // View All Cabins with Customer's names

        for (int i = 0; i < maxLength; i++) {
            if (i < twoDimensionalArray[0].length) {
                System.out.format("%5s","");
                System.out.print(twoDimensionalArray[0][i] + "\t");
            } else {
                System.out.format("%5s","");
                System.out.print("\t\t");
            }

            if (i < twoDimensionalArray[1].length) {
                System.out.format("%5s","");
                System.out.print(twoDimensionalArray[1][i] + "\t");
            } else {
                System.out.format("%5s","");
                System.out.print("\t\t");
            }

            if (i < twoDimensionalArray[2].length) {
                System.out.format("%5s","");
                System.out.print(twoDimensionalArray[2][i]);
            }

            System.out.println();
        }

         */



    }

    private static void ViewEmptyCabins(String[] cashier1, String[] cashier2, String[] cashier3) {

        System.out.println("                     ** Empty Queues **  ");


        if (IsEmpty1(cashier1)) {
            System.out.println("\nCashier 1 Queue  is  Empty\n\n");
        } /*else {
            System.out.println("Array 1 is not empty.");
        }
        */

        if (IsEmpty2(cashier2)) {
            System.out.println("Cashier 2 Queue  is  Empty\n\n");
        }/* else {
            System.out.println("Array 2 is not empty.");
        }*/

        if (IsEmpty3(cashier3)) {
            System.out.println("Cashier 3 Queue  is  Empty\n");
        } /*else {
            System.out.println("Array 3 is not empty.");
        }*/




    }
    public static boolean IsEmpty1(String[] cashier1){

        for (String s : cashier1) {
            if (s != null) {
                return false;
            }
        }
        return true;

    }
    private static boolean IsEmpty2(String[] cashier2){

        for (String s : cashier2) {
            if (s != null) {
                return false;
            }
        }
        return true;

    }
    public static boolean IsEmpty3(String[] cashier3){

        for (String s : cashier3) {
            if (s != null) {
                return false;
            }
        }
        return true;

    }





    private static void addMethod(String[] cashier1, String[] cashier2, String[] cashier3) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter Customer Name :");
        String Name=input.nextLine();
        System.out.print("Enter Customer Surname :");
        String Surname=input.nextLine();

        Customer customer_Obj= new Customer(Name,Surname);

        int Income_of_Queue = 0;


        /*
        System.out.print("Enter Customer Id Number :");
        String ID = input.nextLine();
        while (ID.length()!=10){
            System.out.print("     Id number should include 10 characters. Try Again!!\n");
            System.out.print("Enter Customer Id Number :");
            ID = input.nextLine();
        }*/


        int Cashier_Nb = 0;
        int purchased_Burgers = 0;
        do {
            try {
                System.out.print("\nEnter Cashier Number : ");
                Cashier_Nb=input.nextInt();
                if (Cashier_Nb==1){


                    if (Cashier1_customNumber <cashier1.length){
                        System.out.println("Queue "+Cashier_Nb+" Details -  **There can be Two Customers in this Queue.** ");
                        if (Cashier1_customNumber>0){
                            System.out.println("    There is already "+Cashier1_customNumber+" Customer here.");
                        }

                        Scanner input2 = new Scanner(System.in);
                        //System.out.print("Enter Customer Name : ");
                        //String Name=input2.nextLine();
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
                        System.out.println("   ##"+Name+" "+Surname+" was added to Queue "+Cashier_Nb+"\n");

                        boolean burgerExist= false;

                        while (!burgerExist){
                            System.out.print("How many have burgers been purchased? :____");
                            purchased_Burgers=input.nextInt();



                            if (Burger_Stock<purchased_Burgers || Burger_Stock<1){
                                System.out.println("\n| ************************************************************************************************************************************************************************ |");
                                System.out.println("|                                                          Sorry!!                                                                                                         |");
                                System.out.println("| There aren't enough burgers in the Stock for this demand. In this moment there are just "+(Burger_Stock)+" in the stock. Please Enter less than "+(Burger_Stock)+" Burger                                |");
                                System.out.println("| ************************************************************************************************************************************************************************ |\n");
                                burgerExist=false;

                            }

                            else {
                                System.out.println("\n                  "+Name+" has purchased "+purchased_Burgers+" Burgers\n");
                                Burger_Stock-=purchased_Burgers;
                                burgerExist=true;

                            }

                        }
                        //
                        if (Burger_Stock<=10 && Burger_Stock>0){
                            System.out.println("\n              Warning!!\nThe Burger Stock is close to Finish.\n");
                        }
                        if (Burger_Stock==0){
                            System.out.println("\n              Warning!!  Warning!!\n   The Burger Stock has finished. Please Add Burgers to the Stock\n");
                        }


                        FoodQueue foodQueue_Obj=new FoodQueue(customer_Obj,Income_of_Queue,Cashier_Nb,purchased_Burgers);
                        foodQueue_Obj.setPrice(650*purchased_Burgers);

                        burgerArraylist.add(foodQueue_Obj.toString());







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
                       // System.out.print("Enter Customer Name :");
                        //String Name=input2.nextLine();
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
                        System.out.print("How many have burgers been purchased? : ");
                        //int purchased_Burgers=input.nextInt();
                        Burger_Stock-=purchased_Burgers;
                        System.out.println("   "+Name+" has purchased "+purchased_Burgers+" burgers Successfully!");

                        Cashier2_customNumber++;

                        if (Burger_Stock<=10){
                            System.out.println("\n              Warning!!\nThe Burger Stock is close to Finish.");
                        }
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
                       // System.out.print("Enter Customer Name :");
                        //String Name=input2.nextLine();
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
                        System.out.print("How many have burgers been purchased? : ");
                        //int purchased_Burgers=input.nextInt();
                        Burger_Stock-=purchased_Burgers;
                        System.out.println("   "+Name+" has purchased "+purchased_Burgers+" burgers Successfully!");
                        Cashier3_customNumber++;

                        if (Burger_Stock<=10){
                            System.out.println("\n              Warning!!\nThe Burger Stock is close to Finish.");
                        }
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
                            System.out.println("               Try Again!!.  There aren't anyone in this Queue yet.");
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
                            System.out.println("              Try Again!!. Please Check Customer's Name.");
                            //value_1=true;
                        }

                    }


                }
                else if (Cashier_Nb==2){

                    Scanner input3= new Scanner(System.in);

                    boolean value_2= true;

                    while (value_2){

                        if (Cashier2_customNumber==0){
                            System.out.println("              Try Again!!.  There aren't anyone in this Queue yet.");
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
                            System.out.println("              Try Again!!. Please Check Customer's Name.");
                            //value_1=true;
                        }

                    }

                }

                else if (Cashier_Nb==3){
                    Scanner input3= new Scanner(System.in);

                    boolean value_3= true;

                    while (value_3){

                        if (Cashier3_customNumber==0){
                            System.out.println("              Try Again!!.  There aren't anyone in this Queue yet.");
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
                            System.out.println("              Try Again!!. Please Check Customer's Name.");
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

    private static void Remove_Served_Customer(String[] cashier1, String[] cashier2, String[] cashier3) {

        int Cashier_Nb=0;
        do {
            Scanner input= new Scanner(System.in);
            try {
                System.out.print("Enter Cashier Number :");
                Cashier_Nb=input.nextInt();

                if (Cashier_Nb==1){

                    boolean value_1= true;

                    while (value_1){
                        Scanner input3= new Scanner(System.in);

                        if (Cashier1_customNumber==0){
                            System.out.println("               Try Later!!.  Anyone hasn't bought burgers in this moment!");
                            break;
                        }


                        System.out.print("Enter Customer Name : ");
                        String Name=input3.nextLine();
                        System.out.print("How many Burgers has "+Name+" purchased? : ");
                        int purchased_Burger=input3.nextInt();

                        for (int i=0;i<cashier1.length;i++){
                            if (Objects.equals(cashier1[i], Name)){
                                cashier1[i]=null;
                                Cashier1_customNumber--;
                                System.out.println("\n       ****** The Number of Burgers "+Name+" bought has been reduced from The System *****  ");
                                Burger_Stock-=purchased_Burger;
                                value_1=false;
                                if (Burger_Stock<=10){
                                    System.out.println("\n              Warning!!\nThe Burger Stock is close to Finish.");
                                }
                                break;
                            }
                        }
                        if (value_1){
                            System.out.println("              Try Again!!. Please Check Customer's Name.");
                        }
                    }


                }
                else if (Cashier_Nb==2){

                    boolean value_2= true;

                    while (value_2){
                        Scanner input3= new Scanner(System.in);

                        if (Cashier2_customNumber==0){
                            System.out.println("               Try Later!!.  Anyone hasn't bought burgers in this moment!");
                            break;
                        }


                        System.out.print("Enter Customer Name : ");
                        String Name=input3.nextLine();
                        System.out.print("How many Burgers has "+Name+" purchased? : ");
                        int purchased_Burger=input3.nextInt();

                        for (int i=0;i<cashier2.length;i++){
                            if (Objects.equals(cashier2[i], Name)){
                                cashier2[i]=null;
                                Cashier1_customNumber--;
                                System.out.println("\n       ****** The Number of Burgers "+Name+" bought has been reduced from The System *****  ");
                                Burger_Stock-=purchased_Burger;
                                value_2=false;
                                if (Burger_Stock<=10){
                                    System.out.println("\n              Warning!!\nThe Burger Stock is close to Finish.");
                                }
                                break;
                            }
                        }
                        if (value_2){
                            System.out.println("              Try Again!!. Please Check Customer's Name.");
                        }
                    }


                }
                else if (Cashier_Nb==3){

                    boolean value_3= true;

                    while (value_3){
                        Scanner input3= new Scanner(System.in);

                        if (Cashier3_customNumber==0){
                            System.out.println("               Try Later!!.  Anyone hasn't bought burgers in this moment!");
                            break;
                        }


                        System.out.print("Enter Customer Name : ");
                        String Name=input3.nextLine();
                        System.out.print("How many Burgers has "+Name+" purchased? : ");
                        int purchased_Burger=input3.nextInt();

                        for (int i=0;i<cashier3.length;i++){
                            if (Objects.equals(cashier3[i], Name)){
                                cashier3[i]=null;
                                Cashier1_customNumber--;
                                System.out.println("\n       ****** The Number of Burgers "+Name+" bought has been reduced from The System *****  ");
                                Burger_Stock-=purchased_Burger;
                                value_3=false;
                                if (Burger_Stock<=10){
                                    System.out.println("\n              Warning!!\nThe Burger Stock is close to Finish.");
                                }
                                break;
                            }
                        }
                        if (value_3){
                            System.out.println("              Try Again!!. Please Check Customer's Name.");
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





    private static void Save(String[] cashier1, String[] cashier2, String[] cashier3) {
        try {
            FileWriter file_writer1 = new FileWriter("FoodiesQueue_1.txt");
            FileWriter file_writer2 = new FileWriter("FoodiesQueue_2.txt");
            FileWriter file_writer3 = new FileWriter("FoodiesQueue_3.txt");
            FileWriter file_writer4 = new FileWriter("FoodiesQueue_4.txt");


            for (String i :cashier1){
                if (i == null){
                    file_writer1.write("null");
                }
                else {
                    file_writer1.write(i);
                }
                file_writer1.write("\n");
            }
            file_writer1.close();


            for (String j :cashier2){
                if (j == null){
                    file_writer2.write("null");
                }
                else {
                    file_writer2.write(j);
                }
                file_writer2.write("\n");
            }
            file_writer2.close();


            for (String z :cashier3){
                if (z == null){
                    file_writer3.write("null");
                }
                else {
                    file_writer3.write(z);
                }
                file_writer3.write("\n");
            }
            file_writer3.close();


            file_writer4.write(String.valueOf(Burger_Stock));
            file_writer4.close();
            System.out.println();



        }catch (Exception e){
            System.out.println("Error is : "+e);
        }
        /*
        try {
            FileWriter file_writer = new FileWriter("Foodies.txt");

            //file_writer.write("Cashier1 : ");
            for (String i :cashier1){
                if (i == null){
                    file_writer.write("null");
                }
                else {
                    file_writer.write(i);
                }
            }
            file_writer.write("\n");

            for (String j :cashier2){
                if (j == null){
                    file_writer.write("null");
                }
                else {
                    file_writer.write(j);
                }
            }
            file_writer.write("\n");

            for (String z :cashier3){
                if (z == null){
                    file_writer.write("null");
                }
                else {
                    file_writer.write(z);
                }
            }
            //file_writer.write("\n\n\n");

            //file_writer.write("Burger Stock :  "+Burger_Stock);
            file_writer.close();


        }catch (Exception e){
            System.out.println("Error is : "+e);
        }
         */
        System.out.println("\n              Successfully saved to the file          ");
    }




    private static void Lord(String[] cashier1, String[] cashier2, String[] cashier3) {

        System.out.println("\n                           --**The Program Loaded Successfully--**\n ");

        try {
            File file_1 = new File("FoodiesQueue_1.txt");

            Scanner fileReader_1 = new Scanner(file_1);

            System.out.print("\nCashier 1 : ");
            String line1=null;
            int j=0;
            while (fileReader_1.hasNextLine()){
                line1 =fileReader_1.nextLine();
                cashier1[j]= String.valueOf(line1.formatted(j));
                j++;
            }
            fileReader_1.close();
            for (String s : cashier1) {
                System.out.print(s + ", ");
            }
            System.out.println();


        }catch (IOException e){
            System.out.println("Error is : "+e);
        }


        try {

            File file_2 = new File("FoodiesQueue_2.txt");

            Scanner fileReader_2 = new Scanner(file_2);

            System.out.print("\nCashier 2 : ");
            String line2=null;
            int j=0;
            while (fileReader_2.hasNextLine()){
                line2 =fileReader_2.nextLine();
                cashier2[j]= String.valueOf(line2.formatted(j));
                j++;
            }
            fileReader_2.close();
            for (String s : cashier2) {
                System.out.print(s + ", ");
            }
            System.out.println();

        }catch (IOException e){
            System.out.println("Error is : "+e);
        }

        try {
            File file_3 = new File("FoodiesQueue_3.txt");

            Scanner fileReader_3 = new Scanner(file_3);

            System.out.print("\nCashier 3 : ");
            String line3=null;
            int j=0;
            while (fileReader_3.hasNextLine()){
                line3 =fileReader_3.nextLine();
                cashier3[j]= String.valueOf(line3.formatted(j));
                j++;
            }
            fileReader_3.close();
            for (String s : cashier3) {
                System.out.print(s + ", ");
            }
            System.out.println();


        }catch (IOException e){
            System.out.println("Error is : "+e);
        }

        try {
            File file_4 = new File("FoodiesQueue_4.txt");

            Scanner fileReader_4 = new Scanner(file_4);

            System.out.print("\n\n     Burger Stock  : ");
            String line4=null;

            while (fileReader_4.hasNextLine()){
                line4 =fileReader_4.nextLine();
                Burger_Stock=Integer.parseInt(line4);
                System.out.println(Burger_Stock);

            }
            fileReader_4.close();




        }catch (IOException e){
            System.out.println("Error is : "+e);
        }




        /*
        try {
            File file_ = new File("Foodies.txt");
            Scanner fileReader = new Scanner(file_);

            int x=1;
            while (fileReader.hasNextLine()){
                String line =fileReader.nextLine();

                if (x==1){
                    System.out.print("\nCashier 1 : ");
                    //String saved_line1= fileReader.nextLine();
                    for (int i=0;i<cashier1.length;i++){
                        //cashier1[i]=String.valueOf(saved_line1);
                        cashier1[i]= String.valueOf(line.formatted(i));
                        System.out.print(cashier1[i]+", ");
                    }
                    System.out.println();
                }
                if (x==2){
                    System.out.print("\nCashier 2 : ");
                    //String saved_line2= fileReader.nextLine();
                    for (int i=0;i<cashier2.length;i++){
                        //cashier2[i]=String.valueOf(saved_line2.charAt(i));
                        cashier2[i]= String.valueOf(line.formatted(i));
                        System.out.print(cashier2[i]+", ");
                    }
                    System.out.println();
                }
                if (x==3){
                    System.out.print("\nCashier 3 : ");
                    //String saved_line3= fileReader.nextLine();
                    for (int i=0;i< cashier3.length;i++){
                       // cashier3[i]=String.valueOf(saved_line3.charAt(i));
                        cashier3[i]= String.valueOf(line.formatted(i));
                        System.out.print(cashier3[i]+", ");
                    }
                    System.out.println();
                }
                x++;

            }
            fileReader.close();


        }catch (IOException e){
            System.out.println("Error is : "+e);
        }
         */



    }






}
