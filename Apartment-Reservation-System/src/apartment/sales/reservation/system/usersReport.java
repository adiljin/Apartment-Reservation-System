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
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.scan;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.menu;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.currentUser;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.passAdmin;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.adminID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.staffID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.passStaff;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.nameUserStaff;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.lastUserStaff;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.managerID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.passMan;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.nameMan;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.lastMan;
import java.util.Scanner;
public class usersReport {
    public static void report(){
        int i,j;
        
        System.out.println("------------------------");
        System.out.println("User's report:");
        System.out.println("------------------------");
        
        
        if(staffID!= null){
            System.out.println("Employee:");
            System.out.println("______________________________");
            System.out.println("ID: " + staffID);
            System.out.println("Password: "+ passStaff);
            System.out.println("First name: " + nameUserStaff);
            System.out.println("Last name : " + lastUserStaff);
            System.out.println("");
            System.out.println("______________________________");
            System.out.println("");
        }    


        if(managerID!= null){
            System.out.println("Manager:");
            System.out.println("______________________________");
            System.out.println("ID: " + managerID);
            System.out.println("Password: "+ passMan);
            System.out.println("First name: " + nameMan);
            System.out.println("Last name : " + lastMan);
            System.out.println("");
            System.out.println("______________________________");
        }
        
        System.out.println("-------------------------");
        System.out.println("Do you want to continue:");
        System.out.println("1- Back to main menu");
        System.out.println("2- Exit");
        
        int resh = scan.nextInt();
        
        switch(resh)
        {
            case 1:
                ApartmentSalesReservationSystem.menu();
                break;
            default:
                System.out.println("Good Bye");
                System.exit(0);
                break;
            
        }
    }
}
