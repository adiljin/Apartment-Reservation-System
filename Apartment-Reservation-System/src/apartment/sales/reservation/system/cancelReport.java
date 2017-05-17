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
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationInfo;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationInfo2;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationInfo3;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.apartmentCost;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationDes;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.ID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.buildingID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.userC;
import java.util.Scanner;

public class cancelReport {
    static Scanner scan = new Scanner(System.in);
    
    public static void report(){
        int i,j;
        
        System.out.println("------------------------");
        System.out.println("Cancellation report:");
        System.out.println("------------------------");
        for(i=0;i<2;i++){
            for(j=0;j<20;j++){
                if(cancellationInfo[i][j]!= null){
                    System.out.println("______________________________");
                    
                    System.out.println("User's work: " + userC[i][j]);
                    System.out.println("Buyer's ID: " + ID[i][j]);
                    System.out.println("Apartment ID: " + buildingID[i][j]);
                    System.out.println(cancellationID[i][j]);
                    System.out.println(cancellationInfo[i][j]);
                    System.out.println(cancellationInfo2[i][j]);
                    System.out.println(cancellationInfo3[i][j]);
                    System.out.println("Cancellation description: " + (cancellationDes[i][j]));
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
