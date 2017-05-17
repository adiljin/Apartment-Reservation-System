/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment.sales.reservation.system;

import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.a;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.currentUser;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.userC;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.building;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.buildingID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.selectA;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.selectC;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.kind;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.apartmentCost;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.priceAspen;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.priceColorado;
import java.util.Scanner;
/**
 *
 * @author Adil
 */
class choice {
    static Scanner scan = new Scanner(System.in);
    public static int hata(int et){
        int select = 0;
        System.out.println("-----------------------------------");
        if(et == 1){
            kind = "Aspen";
            //selectA = selectA + 1;
        }else if(et == 2){
            kind = "Colorado";
            //selectC = selectC + 1;
        }
        
        if(et == 1){
            if(selectA<11){
                userC[et-1][selectA-1] = currentUser;
                
                building[et-1][selectA-1] = kind;
                buildingID[et-1][selectA-1] = "id"+1+selectA;
                System.out.println(building[et-1][selectA-1]+" apartment:");
                System.out.println("Apartment ID is:" + buildingID[et-1][selectA-1]);
                building[et-1][selectA-1] = a[et-1][selectA-1];
                apartmentCost[et-1][selectA-1] = priceAspen;

                select = selectA;
                selectA = selectA + 1;
            }else{
                System.out.println("Invalid place");
                ApartmentSalesReservationSystem.menu();
            }
        }else if(et == 2){
            if(selectC<11){
                userC[et-1][selectC-1] = currentUser;
                
                building[et-1][selectC-1] = kind;
                buildingID[et-1][selectC-1] = "id"+2+selectC;
                System.out.println(building[et-1][selectC-1]+" apartment:");
                System.out.println("Apartment ID is: " + buildingID[et-1][selectC-1]);
                building[et-1][selectC-1] = a[et-1][selectC-1];
                apartmentCost[et-1][selectC-1] = priceColorado;
                
                select = selectC;
                selectC = selectC + 1;
            }else{
                System.out.println("Invalid place");
                ApartmentSalesReservationSystem.menu();
            }
        }
        return select;
               
    }
}
