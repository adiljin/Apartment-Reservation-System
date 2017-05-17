/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment.sales.reservation.system;

import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.userC;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.name;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.ID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.lastName;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.phoneNumber;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.email;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.building;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.buildingID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.apartmentCost;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.dateIn;
import java.util.Scanner;
/**
 *
 * @author Adil
 */
public class report {

    static Scanner scan = new Scanner(System.in);
    public static void report(){
        int i,j;
        
        System.out.println("____________________________");
        System.out.println("*Report of all reservations*");
        System.out.println("____________________________");
        for(i=0;i<2;i++){
            for(j=0;j<20;j++){
                if(name[i][j]!= null){
                    System.out.println("______________________________");
                    System.out.println("User's work: " + userC[i][j]);
                    System.out.println("Apartment ID: " + buildingID[i][j]);
                    System.out.println("Apartment type is: "+building[i][j]);
                    System.out.println("Date of reservation: " + dateIn[i][j]);
                    System.out.println("Price of the apartment : " + apartmentCost[i][j]);
                    System.out.println("");
                    System.out.println("Buyer's ID: "+ID[i][j]);
                    System.out.println("Name: " + name[i][j]);
                    System.out.println("Phone number: "+phoneNumber[i][j]);
                    System.out.println("E-mail address: " + email[i][j]);
                    System.out.println("______________________________");
                    
                    System.out.println("");
                }    
            }
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
