/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment.sales.reservation.system;

import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.scan;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.menu;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.currentUser;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.passAdmin;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.adminID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.staffID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.passStaff;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.managerID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.passMan;


/**
 *
 * @author Adil
 */
public class log {
    public static void login(){ 
        
        
        System.out.println("_______________________________________________");
        System.out.println("      *Apartment Sales Reservation System*     ");
        System.out.println("               *has been started*              ");
        System.out.println("_______________________________________________");
        System.out.println();
        System.out.println("                 *Login Menu*                  ");
        System.out.println("_______________________________________________");
        
        //menu();
        
        System.out.println("Please enter your username: ");
        String user = scan.next();
        System.out.println("Enter Password: ");
        String pass = scan.next();
        
        if(user.equals(adminID) && pass.equals(passAdmin)) {
            currentUser = adminID;
            System.out.println("You have been logged as Will Smith the administrator");
            System.out.println("");
            System.out.println();   
            menu();
            
        }else if((user.equals(staffID) && pass.equals(passStaff))){
        
            currentUser = staffID;
            System.out.println("You have been logged as regular staff");
            System.out.println("");
            System.out.println(); 
            menu();
        
        }else if((user.equals(managerID) && pass.equals(passMan))){
        
            currentUser = managerID;
            System.out.println("You have been logged as manager");
            System.out.println("");
            System.out.println(); 
            menu();
            
        }else{
            System.out.println("try again:");
            login();
        }
    }
}
