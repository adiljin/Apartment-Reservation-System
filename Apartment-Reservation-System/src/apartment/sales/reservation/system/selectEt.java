/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartment.sales.reservation.system;

import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.scan;

/**
 *
 * @author Adil
 */
public class selectEt {
    public static int selectEt(){
        int et=0;
        
        System.out.println("_______________________________________________");
        System.out.println("             *Apartment reservation*           ");
        System.out.println("_______________________________________________");
        System.out.println("Select Type of apartment:");
        System.out.println("_______________________________________________");
        System.out.println("Aspen");
        System.out.println("Priced at RM 480,000 the unit comes with a balcony,");
        System.out.println("3 bedrooms, a kitchen and 2 bathrooms with one");
        System.out.println("attached and a study room.");
        System.out.println("The unit has 3 parking bays for the tenants.");
        System.out.println("_______________________________________________");
        System.out.println("Colorado");
        System.out.println("Priced at RM 350,000 the unit has 2 bedrooms,");
        System.out.println("a kitchen and a study room.");
        System.out.println("This unit has 2 parking bays for the tenants.");
        System.out.println("");
        System.out.println("_______________________________________________");
        System.out.println("              *Choose Apartment*               ");
        System.out.println("_______________________________________________");
        System.out.println("Select apartment:");
        System.out.println("1- Aspen");
        System.out.println("2- Colorado");
        System.out.println("Select: ");
        
        int aspen=scan.nextInt();
        switch(aspen){
            case 1: et=1;
                break;
            case 2: et=2;
                break;
            default : 
                System.out.println("Invalid Option!");
                selectEt();
                }
        
        return et;
}
}
