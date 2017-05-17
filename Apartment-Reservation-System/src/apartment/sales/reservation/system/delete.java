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
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.ID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.buildingID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.building;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.dateIn;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.name;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.lastName;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.phoneNumber;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.email;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.idCheck;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationDes;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationN;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationDate;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationInfo;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationInfo2;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.cancellationInfo3;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.apartmentCost;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class delete {
static Scanner scan = new Scanner(System.in);
    
    public static void del(){
        System.out.println("");
        System.out.println("    *Cancel reservation*   ");
        System.out.println("Write apartment ID number:");
        String Name = scan.next();
        
        int u,k;
        
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 22; j++){
                idCheck = null;
                idCheck = buildingID[i][j];
                if(Name.equals(idCheck)){
                    u = i;
                    k = j;
                    delet(u,k);
                }
            }
        }
        if(idCheck==null){
            System.out.println("");
            System.out.println("Program did not find ID");
            System.out.println("You will return to main menu.");
            ApartmentSalesReservationSystem.menu();
        }
    }
    
    public static void delet(int urov, int kol){
        int vbib;
        System.out.println("");
        System.out.println("_____________________________________");
        System.out.println("ID number is: "+buildingID[urov][kol]);
        System.out.println("Buyer's ID is: "+ID[urov][kol]);
        System.out.println("Name is: "+name[urov][kol]);
        System.out.println("Last name is: "+lastName[urov][kol]);
        System.out.println("Phone number is: "+phoneNumber[urov][kol]);
        System.out.println("E-mail is: "+email[urov][kol]);
        System.out.println("Apartment type is: "+building[urov][kol]);
        System.out.println("");
        System.out.println("Do you want to delete this reservation? ");
        System.out.println("1 - yes, 2 - no");
        System.out.println("Select: ");
        vbib = scan.nextInt();
        
        if(vbib == 1){
            System.out.println("");
            System.out.println("Cancellation description: ");
            String canse = scan.next();
            cancellationDes[urov][kol] = canse;
            System.out.println("_____________________________________");
            
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy hh:mm"); 
            Date date = new Date();
            cancellationN++;
            cancellationID[urov][kol] = ("c_ID: " + cancellationN);
            cancellationDate[urov][kol] = dateFormat.format(date);
            cancellationInfo[urov][kol] = (building[urov][kol] +" apartment;");
            cancellationInfo2[urov][kol] = ("Date of cancellation: " + cancellationDate[urov][kol]);
            cancellationInfo3[urov][kol] = ("The amount refunded: " + apartmentCost[urov][kol]);
            
            //buildingID[urov][kol] = null;
            building[urov][kol] = null;
            //ID[urov][kol] = null;
            name[urov][kol] = null;
            lastName[urov][kol] = null;
            phoneNumber[urov][kol] = null;
            email[urov][kol] = null;
            dateIn[urov][kol] = null;
            System.out.println("");
            System.out.println("Information was deleted");
            System.out.println("");
            ApartmentSalesReservationSystem.menu();
            
        }else{
            ApartmentSalesReservationSystem.menu();
        }
    }
    
}
