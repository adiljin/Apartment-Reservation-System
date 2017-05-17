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
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.nameUserStaff;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.lastUserStaff;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.managerID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.passMan;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.nameMan;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.lastMan;
import java.util.Scanner;

/**
 *
 * @author Adil
 */
public class newEmployee {
    static Scanner scan = new Scanner(System.in);
    public static void newWorker(){
        System.out.println("____________________________");
        System.out.println("    *Create new employee*   ");
        System.out.println("");
        System.out.println("Choose kind of employee:");
        System.out.println("1 - Regular staff");
        System.out.println("2 - Manager");
        System.out.println("3 - Main menu");
        String workerKind = scan.next();
        if(workerKind.equals("1")){
            
            
            System.out.println("");
            System.out.println("Write new staff's ID which will be login");
            staffID = scan.next();
            System.out.println("Write new staff's password");
            passStaff = scan.next();
            System.out.println("Write new staff's name");
            nameUserStaff = scan.next();
            System.out.println("Write new staff's last name");
            lastUserStaff = scan.next();
            System.out.println("____________________________");
            ApartmentSalesReservationSystem.menu();
            
        }else if(workerKind.equals("2")){
        
            System.out.println("Write new manager's ID which will be login");
            managerID = scan.next();
            System.out.println("Write new manager's password");
            passMan = scan.next();
            System.out.println("Write new manager's name");
            nameMan = scan.next();
            System.out.println("Write new manager's last name");
            lastMan = scan.next();
            System.out.println("____________________________");
            ApartmentSalesReservationSystem.menu(); 
            
        }else if(workerKind.equals("3")){
            
            ApartmentSalesReservationSystem.menu();
        
        }else{
            System.out.println();
        }
    }
}
