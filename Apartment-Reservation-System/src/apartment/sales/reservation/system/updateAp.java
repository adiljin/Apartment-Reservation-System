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
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.userC;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.ID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.buildingID;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.building;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.apartmentCost;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.priceAspen;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.priceColorado;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.dateIn;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.name;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.lastName;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.phoneNumber;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.email;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.idCheck;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.selectA;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.selectC;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.selectChangeA;
import static apartment.sales.reservation.system.ApartmentSalesReservationSystem.selectChangeC;
import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class updateAp {
static Scanner scan = new Scanner(System.in);
    
    public static void update(){
        
        System.out.println("");
        System.out.println("_____________________________________");
        System.out.println("    *Change / Update Reservation*    ");
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
                    updateNext(u,k);
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
    public static void updateNext(int urov, int kol){ 
        String tempAID, tempName, tempLast, tempPhone, tempEmail, tempTime, tempuserC;
        int vbib;
        selectChangeA = selectA+1;
        selectChangeC = selectC+1;
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
        System.out.println("Do you want to change apartment? ");
        System.out.println("1 - yes, 2 - no");
        System.out.println("Select: ");
        vbib = scan.nextInt();
        out:
        if(vbib == 1){
            if(building[urov][kol]==building[1][kol]){
                if(selectA<11){ 
                    if(selectChangeA<12){
                        tempuserC = userC[urov][kol];
                        userC[urov][kol] = null;
                        userC[0][selectChangeA] = tempuserC;
                        
                        building[0][selectChangeA]="Aspen";
                        
                        apartmentCost[0][selectChangeA]=priceAspen;

                        tempAID = buildingID[urov][kol];
                        buildingID[urov][kol]=null;
                        buildingID[0][selectChangeA]=tempAID;

                        ID[urov][kol]=null;
                        ID[0][selectChangeA]="id"+1+1+(selectChangeA);

                        tempName = name[urov][kol];
                        name[urov][kol]=null;
                        name[0][selectChangeA] = tempName;

                        tempLast = lastName[urov][kol];
                        lastName[urov][kol]=null;
                        lastName[0][selectChangeA] = tempLast;

                        tempPhone = phoneNumber[urov][kol];
                        phoneNumber[urov][kol]=null;
                        phoneNumber[0][selectChangeA] = tempPhone;

                        tempEmail = email[urov][kol];
                        email[urov][kol]=null;
                        email[0][selectChangeA] = tempEmail;

                        dateIn[urov][kol] = null;
                        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy hh:mm"); 
                        Date date = new Date();
                        dateIn[0][selectChangeA] = dateFormat.format(date);

                        selectC--;
                        selectA++;



                        System.out.println("Operation is successful, you will return to main menu.");
                        ApartmentSalesReservationSystem.menu();

                        /*System.out.println("Do you want return to menu?");
                        System.out.println("1 - Menu; 2 - Exit");
                        otvet = scan.nextInt();
                        if(otvet == 1){
                            ApartmentSalesReservationSystem.menu();
                        }else if(otvet == 2){
                            System.exit(0);
                        }*/


                    }else{
                        System.out.println("So sorry but there is no space in apartment.");
                        ApartmentSalesReservationSystem.menu();
                    }
                }else{
                    System.out.println("So sorry but there is no space in apartment.");
                    ApartmentSalesReservationSystem.menu();
                }
            }else if(building[urov][kol]==building[0][kol]){
                if(selectC<11){
                    if(selectChangeC<12){
                        tempuserC = userC[urov][kol];
                        userC[urov][kol] = null;
                        userC[1][selectChangeC] = tempuserC;
                        
                        building[1][selectChangeC]="Colorado";
                        
                        apartmentCost[1][selectChangeC]=priceColorado;

                        tempAID = buildingID[urov][kol];
                        buildingID[urov][kol]=null;
                        buildingID[1][selectChangeC]=tempAID;

                        ID[urov][kol]=null;
                        ID[1][selectChangeC]="id"+1+1+(kol+1);

                        tempName = name[urov][kol];
                        name[urov][kol]=null;
                        name[1][selectChangeC] = tempName;

                        tempLast = lastName[urov][kol];
                        lastName[urov][kol]=null;
                        lastName[1][selectChangeC] = tempLast;

                        tempPhone = phoneNumber[urov][kol];
                        phoneNumber[urov][kol]=null;
                        phoneNumber[1][selectChangeC] = tempPhone;

                        tempEmail = email[urov][kol];
                        email[urov][kol]=null;
                        email[1][selectChangeC] = tempEmail;

                        dateIn[urov][kol] = null;
                        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy hh:mm"); 
                        Date date = new Date();
                        dateIn[1][selectChangeC] = dateFormat.format(date);

                        selectA--;
                        selectC++;

                        System.out.println("Operation is successful, you will return to main menu.");

                        ApartmentSalesReservationSystem.menu();

                        /*System.out.println(selectChangeC+"KZKZ " + selectC);
                        System.out.println("Do you want return to menu?");
                        System.out.println("1 - Menu; 2 - Exit");
                        otvet = scan.nextInt();
                        if(otvet == 1){
                            ApartmentSalesReservationSystem.menu();
                        }else if(otvet == 2){
                            System.exit(0);
                        }*/

                    }else{
                        System.out.println("So sorry but there is no space in apartment.");
                        ApartmentSalesReservationSystem.menu();
                    }
                }else{
                    System.out.println("So sorry but there is no space in apartment.");
                    ApartmentSalesReservationSystem.menu();
                }
            }else{
                System.out.println("You made a mistake!");
                update();
            }           
        }else{
            ApartmentSalesReservationSystem.menu();
        }
    }
}
