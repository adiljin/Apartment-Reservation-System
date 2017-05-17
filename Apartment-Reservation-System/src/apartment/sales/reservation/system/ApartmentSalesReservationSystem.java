/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment.sales.reservation.system;

/**
 *
 * @author Adil
 */
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;



public class ApartmentSalesReservationSystem {

    /**
     * @param args the command line arguments
     */
    
    static String kind = null;
    static int priceAspen = 480000;
    static int priceColorado = 350000;
    
    static int selectA = 1;
    static int selectC = 1;
    static int selectChangeA = 0;
    static int selectChangeC = 0;
    
    static int[][] apartmentCost = new int[2][22];
    
    static String idCheck;
    
    static String[][] login = new String[2][22];
    
    static String[][] kindApartment = new String[2][22];
    static String[][] buildingID = new String[2][22];
    static String[][] building = new String[2][22];
    static Scanner scan = new Scanner(System.in);
    static String[][] a = new String[2][22];
    static String[][] userC = new String[2][22];
    static String[][] name = new String[2][22];
    static String[][] lastName = new String[2][22];
    static String[][] ID = new String[2][22];
    static String[][] dateIn = new String[2][22];
    static String[][] cancellationID = new String[2][22];
    static int cancellationN = 0;
    static String[][] cancellationDes = new String[2][22];
    static String[][] cancellationDate = new String[2][22];
    static String[][] cancellationInfo = new String[2][22];
    static String[][] cancellationInfo2 = new String[2][22];
    static String[][] cancellationInfo3 = new String[2][22];
    static String[][] userName = new String[2][22];
    static String[][] password = new String[2][22];
    static String[][] email = new String[2][22];
    static String[][] phoneNumber = new String[2][22];
    
    static String currentUser;
    
    static String adminID = "admin";
    static String passAdmin = "admin" ;
    static String nameAdmin = "Will" ;
    static String lastAdmin = "Smith" ;
    
    static String staffID = "staff";
    static String passStaff = "staff" ;
    static String nameUserStaff = "Rex" ;
    static String lastUserStaff = "T" ;
    
    static String managerID = "man" ;
    static String passMan  = "man" ;
    static String nameMan = "Dragon" ;
    static String lastMan = "R" ;


    public static void main(String[] args) {
        
        log.login();
    }

    /**
     *
     */
    

    
    public static void relogin(){ 
        System.out.println("relogin process...");
        log.login();
        
    }
   
    public static void menu(){
        int select;
   
        if(currentUser.equals("admin")){
            System.out.println("_______________________________________________");
            System.out.println("                    *MENU*                     ");
            System.out.println("_______________________________________________");
            System.out.println("Please choose an option:");
            System.out.println("1 - Apartment reservation");
            System.out.println("2 - Change / Update Reservation");
            System.out.println("3 - Cancel reservation");
            System.out.println("4 - Report of all reservations");
            System.out.println("5 - Report of all cancelled reservations");
            System.out.println("6 - Create new employee");
            System.out.println("7 - User's report");            
            System.out.println("8 - Logout and relogin");
            System.out.println("Select or press another number to close the program:");
            select = scan.nextInt();        
            switch(select){
                case 1:
                    add();
                    break;
                case 2:
                    updateAp.update();
                    break;
                case 3:
                    delete.del();
                    break;
                case 4:
                    report.report();
                    break;
                case 5:
                    cancelReport.report();
                    break;
                case 6:
                    newEmployee.newWorker();
                    break;
                case 7:
                    usersReport.report();
                    break;
                case 8:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Logged out...");
                    relogin();
                    break;
                 default: 
                    System.out.println("Program closed");
                    System.exit(0); 
                    break;
            }
            
        }else if(currentUser.equals(staffID)){
            
            System.out.println("_______________________________________________");
            System.out.println("                    *MENU*                     ");
            System.out.println("_______________________________________________");
            System.out.println("Please choose an option:");
            System.out.println("1 - Appartment reservation");
            System.out.println("2 - Cancel reservation");
            System.out.println("3 - Exit and relogin");
            System.out.println("Select or press another number to close the program:");
            select = scan.nextInt();        
            switch(select){
                
                case 1:
                    add();
                    break;
                case 2:
                    delete.del();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Logged out...");
                    relogin();
                    break;
                 default: 
                    System.out.println("Program closed");
                    System.exit(0);  
                    break;
            }
            
        }else if(currentUser.equals(managerID)){
            System.out.println("_______________________________________________");
            System.out.println("                    *MENU*                     ");
            System.out.println("_______________________________________________");
            System.out.println("Please choose an option:");
            System.out.println("1 - Report of all reservations");
            System.out.println("2 - Report of all cancelled reservations");
            System.out.println("3 - Exit and relogin");
            System.out.println("Select or press another number to close the program:");
            select = scan.nextInt();        
            switch(select){
                
                case 1:
                    report.report();
                    break;
                case 2:
                    cancelReport.report();
                    break;
                case 3:
                    System.out.println("-----------------------------------------------");
                    System.out.println("Logged out...");
                    relogin();
                    break;
                 default: 
                    System.out.println("Program closed");
                    System.exit(0);  
                    break;
            }
        }
    }
    
    public static void newUser(){
        System.out.println("What kind user do you want create?");
        System.out.println("1 - employee, 2 - manager");
        String newUser = scan.next();
        if(newUser.equals("1")){
            System.out.println("New staff's name:");
        }
        
        System.out.println("Successful logout from the system");
    }
          
    public static void add(){  
        
        int flatLevel = selectEt.selectEt();
        int apNomer = choice.hata(flatLevel);    
        
        building[flatLevel-1][apNomer-1] = kind;
        System.out.println("Please enter buyer's name:");
        ID[flatLevel-1][apNomer-1] = "id"+ flatLevel + 1 + apNomer;        
        name[flatLevel-1][apNomer-1] = scan.next();
        System.out.println("Enter your bayer's last name:");
        lastName[flatLevel-1][apNomer-1] = scan.next();
        System.out.println("Enter bayer's Phone Number:");
        phoneNumber[flatLevel-1][apNomer-1] = scan.next();
        System.out.println("Please enter your E-mail:");
        email[flatLevel-1][apNomer-1] = scan.next();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy hh:mm"); 
        Date date = new Date();
        dateIn[flatLevel-1][apNomer-1] = dateFormat.format(date);
        menu();
    }
    
}
